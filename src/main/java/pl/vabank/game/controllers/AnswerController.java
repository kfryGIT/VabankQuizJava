package pl.vabank.game.controllers;

//import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.vabank.game.CustomUserDetails;
import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.access.RoomRepository;
import pl.vabank.game.data.QuestionsData;
import pl.vabank.game.data.RoomData;
import pl.vabank.game.data.UserData;
/**
 * W klasie AnswerController z adnotacją @Controller obsługiwane są przychodzące żądania HTTP. 
 * Po otrzymaniu żądania uruchamiana jest metoda answerQuestion, 
 * na koniec metoda ta zwraca obiekt odpowiedzi http (w tym wypadku: wartość "answer" typu String).
 * Wartość "answer" jest interpretowana jako logiczna nazwa widoku answer.html.
 * Podsumowując klasa AnswerController obsługuje żadania użytkownika gry zwjązane z udzielaniem odpowiedzi na pytania. 
 * Klasa wykorzystuje mechanizm wstrzykiwania zależności z użyciem adnotacji @Autowired, która m.in. umożliwia 
 * pobieranie id pytania czy id pokoju przy użyciu metod get (getter). 


* @author Katarzyna Madalińska
*/
@Controller
public class AnswerController {

    @Autowired
    private QuestionsRepository questRepo;

    @Autowired
    private RoomRepository roomRepo;


    /**
     * Adnotacja @GetMapping wskazuje na mapowanie żądań, które polega na tym, że dla danego żądania HTTP, 
     * wybierana jest odpowiednia metoda Java (tj. answerQuestion) w celu obsługi tego żądania. 
     * Czyli, jeśli użytkownik wysłał na serwer żądanie HTTP za pomocą metody HTTP GET oraz 
     * zdefiniowaliśmy URL tego żądania, jako: "/answer/{rid}/{qid}/{aid}", to wówczas Spring przechwyci takie żądanie 
     * i uruchomi metodę answerQuestion.
     * 
     * Metoda answerQuestion "analizuje" odpowiedź gracza/użytkownika na pytanie, 
     * jeśli użytkownik prawidłowo odpowie na pytanie wyświetlana jest wiadomość "Odpowiedź poprawna",
     * dodatkowo następuje sumowanie dotychczasowych punktów użytkownika z punktami za prawidłową odpowiedź
     * oraz zapisywanie w bazie danych, powiększonej liczby punktów danego użytkownika.
     * Natomiast jeśli użytkownik nieprawidłowo odpowie na pytanie wyświetlana jest wiadomość "Odpowiedź niepoprawna. " 
     * + "Odpowiedź poprawna to:" oraz pobierana jest prawidłowa odpowiedź z bazy danych.
     * Blok try catch(Exception e)- stanowi zabezpieczenie przed błędami, które mogą wystąpić.
     * 
     * @param rid -oznacza id pokoju 
     * @param qid -oznacza id pytania
     * @param aid -oznacza id odpowiedzi 
     * (przy czym Adnotacja @PathVariable jest stosowana, gdy gracz wysyła żądanie ustawiając wartość parametru rid/qid/aid bezpośrednio w ścieżce)
     * @param model -dot. import org.springframework.ui.Model i łączy kod java z html
     * @return - wartość "answer"(String), która jest interpretowana jako logiczna nazwa widoku answer.html
     */
    
    @GetMapping("/answer/{rid}/{qid}/{aid}")
    public String answerQuestion(@PathVariable Long rid, @PathVariable Long qid, @PathVariable Long aid, Model model) {

        QuestionsData question = null;
        try {
            question = questRepo.getById(qid);//pobiera pytanie

            String answerText = null;
            if (aid == 1L)
                answerText = question.getAnswer1Text();//pobiera tekst odpowiedzi -String
            else if (aid == 2L)
                answerText = question.getAnswer2Text();
            else if (aid == 3L)
                answerText = question.getAnswer3Text();
            else if (aid == 4L)
                answerText = question.getAnswer4Text();

            if (answerText != null && question.getAnswerCorrect().equals(answerText)) {
                model.addAttribute("message", "Odpowiedź poprawna");
               
                Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // osoba która odpowiada-currentUser

                Object currentPrincipalObject = authentication.getPrincipal();// currentPrincipalObject-pobiera

                UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();

                RoomData room = null;// pobieranie room
                try {
                    room = roomRepo.getById(rid);
                } catch (Exception e) {
                    return "wrong_room";
                }
                if (room.getPlayer1() != null && room.getPlayer1().getId() == currentUser.getId()) {
                   int newPoints= room.getPlayer1Points()+question.getPriceCategory();//pobiera aktualne punkty usera1 i punkty za dane pytanie 
                   room.setPlayer1Points(newPoints);//aktualizacja punktów
                   roomRepo.saveAndFlush(room);//zapisywanie punktów w bazie
                }

                else if (room.getPlayer2() != null && room.getPlayer2().getId() == currentUser.getId()) {
                    int newPoints= room.getPlayer2Points()+question.getPriceCategory();
                    room.setPlayer2Points(newPoints);
                    roomRepo.saveAndFlush(room);
                }
            } else {
                model.addAttribute("message",
                        "Odpowiedź niepoprawna. " + "Odpowiedź poprawna to: " + question.getAnswerCorrect());
            }

            model.addAttribute("roomid", rid);
            // natomiast wiersz:  model.addAttribute("roomid", rid); -pozwala na przesłanie do widoku "answer" 
            //odpowiedniego room id, do którego gracz ma wrócić po odpowiedzi na pytanie

        } catch (Exception e) {//zabezpieczenie przed błędem w kodzie 
            return "redirect:question/" + rid.toString() + '/' + qid.toString();
        }

        return "answer";
    }

}
