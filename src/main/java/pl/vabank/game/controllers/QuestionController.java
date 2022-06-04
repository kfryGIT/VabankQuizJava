package pl.vabank.game.controllers;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.access.RoomRepository;
import pl.vabank.game.data.QuestionsData;
import pl.vabank.game.data.RoomData;
import pl.vabank.game.data.UserData;
import pl.vabank.game.CustomUserDetails;

@Controller
public class QuestionController {

    @Autowired // wstrzykiwanie zależności
    private QuestionsRepository questRepo;

    @Autowired // wstrzykiwanie zależności
    private RoomRepository roomRepo;

    // met.szuka wybranego pytania z puli pytan w room
    private Pair<Supplier<Integer>, Consumer<Integer>> findCurrentQuestion(RoomData roomData,
            QuestionsData questionsData) {
        long currentQuesID = questionsData.getId();// pyt.które wybrał user
        if (roomData.getQuestion1().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion1, roomData::setActiveQuestion1);
        } else if (roomData.getQuestion2().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion2, roomData::setActiveQuestion2);
        } else if (roomData.getQuestion3().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion3, roomData::setActiveQuestion3);
        } else if (roomData.getQuestion4().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion4, roomData::setActiveQuestion4);
        } else if (roomData.getQuestion5().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion5, roomData::setActiveQuestion5);
        } else if (roomData.getQuestion6().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion6, roomData::setActiveQuestion6);

        } else if (roomData.getQuestion7().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion7, roomData::setActiveQuestion7);

        } else if (roomData.getQuestion8().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion8, roomData::setActiveQuestion8);

        } else if (roomData.getQuestion9().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion9, roomData::setActiveQuestion9);

        } else if (roomData.getQuestion10().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion10, roomData::setActiveQuestion10);
        }

        else if (roomData.getQuestion11().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion11, roomData::setActiveQuestion11);
        }

        else if (roomData.getQuestion12().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion12, roomData::setActiveQuestion12);
        }

        else if (roomData.getQuestion13().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion13, roomData::setActiveQuestion13);
        }

        else if (roomData.getQuestion14().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion14, roomData::setActiveQuestion14);
        }

        else if (roomData.getQuestion15().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion15, roomData::setActiveQuestion15);
        }

        else if (roomData.getQuestion16().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion16, roomData::setActiveQuestion16);
        }

        else if (roomData.getQuestion17().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion17, roomData::setActiveQuestion17);
        }

        else if (roomData.getQuestion18().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion18, roomData::setActiveQuestion18);
        }

        else if (roomData.getQuestion19().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion19, roomData::setActiveQuestion19);
        }

        else if (roomData.getQuestion20().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion20, roomData::setActiveQuestion20);
        }

        else if (roomData.getQuestion21().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion21, roomData::setActiveQuestion21);
        }

        else if (roomData.getQuestion22().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion22, roomData::setActiveQuestion22);
        }

        else if (roomData.getQuestion23().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion23, roomData::setActiveQuestion23);
        }

        else if (roomData.getQuestion24().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion24, roomData::setActiveQuestion24);
        }

        else if (roomData.getQuestion25().getId().equals(currentQuesID)) {
            return Pair.with(roomData::getActiveQuestion25, roomData::setActiveQuestion25);
        }

        return Pair.with(() -> 0, (Integer i) -> {
        });
    }

    @GetMapping("/question/{rid}/{qid}") // wybiera czyta i blokuje pytanie w room
    public String gameQuestion(@PathVariable Long rid, @PathVariable Long qid, Model model) {

        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // osoba która
                                                                                                    // dochodzi
            // do pokoju
            Object currentPrincipalObject = authentication.getPrincipal();// currentPrincipalObject-pobiera aktualnego
                                                                          // usera
            UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();

            QuestionsData question = questRepo.getById(qid);// wybrane pytanie
            model.addAttribute("question", question);// model-łączy kod java z html

            RoomData room = roomRepo.getById(rid);
            model.addAttribute("room", room);

            Pair<Supplier<Integer>, Consumer<Integer>> roomAPI = findCurrentQuestion(room, question);
            // sprawdzamy room, pytanie,gracza(sprawdz czy currentUser to gracz 1 czy gracz2
            // w danym roomie)
            if (room.getPlayer1().getId().equals(currentUser.getId())) {


                int activQuestion = roomAPI.getValue0().get();// getter na roomie czyli wywołanie gettera na
                                                              // currentQuestion
                if (activQuestion == 2) {
                    roomAPI.getValue1().accept(1);// wywłanie settera dla currentQuestion i zmiana warości z 2 na 1
                    roomRepo.saveAndFlush(room);// zapisanie do bazy 1(currentQuestion)

                } // TODO:obsługa gdy activQuestion=0 lub 1
            } else if (room.getPlayer2().getId().equals(currentUser.getId())) {

                int activQuestion = roomAPI.getValue0().get();
                if (activQuestion == 1) {
                    roomAPI.getValue1().accept(0);// wywłanie settera dla currentQuestion i zmiana warości z 1 na 0
                    roomRepo.saveAndFlush(room);// zapisanie do bazy 0(currentQuestion)

                }
            } 
        } catch (Exception e) {
            return "redirect:game_room/" + rid.toString();
        }

        return "question";
    }
}
