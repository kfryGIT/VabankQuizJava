package pl.vabank.game.controllers;

import org.apache.logging.log4j.message.Message;
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
 * 
 * Opis klasu co tu sie dzieje 
* @author Katarzyna Madalińska
*/
@Controller
public class AnswerController {

    @Autowired
    private QuestionsRepository questRepo;

    @Autowired
    private RoomRepository roomRepo;


    /**
     * Jeśli uczestinik odpowie poprawnie przkedayzwana jest mesasge w zaleznosci ... -komentarze
     * @param rid
     * @param qid
     * @param aid
     * @param model
     * @return
     */
    @GetMapping("/answer/{rid}/{qid}/{aid}")
    public String answerQuestion(@PathVariable Long rid, @PathVariable Long qid, @PathVariable Long aid, Model model) {

        QuestionsData question = null;
        try {
            question = questRepo.getById(qid);

            String answerText = null;
            if (aid == 1L)
                answerText = question.getAnswer1Text();
            else if (aid == 2L)
                answerText = question.getAnswer2Text();
            else if (aid == 3L)
                answerText = question.getAnswer3Text();
            else if (aid == 4L)
                answerText = question.getAnswer4Text();

            if (answerText != null && question.getAnswerCorrect().equals(answerText)) {
                model.addAttribute("message", "Odpowiedź poprawna");
                // liczenie punktów
                Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // osoba która

                Object currentPrincipalObject = authentication.getPrincipal();// currentPrincipalObject-pobiera

                UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();

                RoomData room = null;// pobieranie room
                try {
                    room = roomRepo.getById(rid);
                } catch (Exception e) {
                    return "wrong_room";
                }
                if (room.getPlayer1() != null && room.getPlayer1().getId() == currentUser.getId()) {
                   int newPoints= room.getPlayer1Points()+question.getPriceCategory();//pobiera aktualnych punktów usera i punktów za dane pytanie 
                   room.setPlayer1Points(newPoints);//aktualizacja punktów
                   roomRepo.saveAndFlush(room);//zapsywanie punktów w bazie
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
            model.addAttribute("questionid", qid);

        } catch (Exception e) {//bląd logiczny w kodzie zabezpieczenie
            return "redirect:question/" + rid.toString() + '/' + qid.toString();
        }

        return "answer";
    }

}
