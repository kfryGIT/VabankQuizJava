package pl.vabank.game.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.vabank.game.data.RoomData;
import pl.vabank.game.data.UserData;
import pl.vabank.game.CustomUserDetails;
import pl.vabank.game.access.RoomRepository;

@Controller
public class RoomController {

    Logger logger = LoggerFactory.getLogger(RoomController.class);


    @Autowired
    private RoomRepository roomRepo;

    @GetMapping("/game_room/{id}")
    public String gameRoom(@PathVariable("id") Long id, Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); // osoba która dochodzi
                                                                                                // do pokoju
        Object currentPrincipalObject = authentication.getPrincipal();
        UserData currentUser = ((CustomUserDetails) currentPrincipalObject).getUser();


        RoomData room=null;
        try {
            room = roomRepo.getById(id);
        } catch (Exception e) {
            return "wrong_room";
        }

        Boolean isValid = false;
        if (room.getPlayer1() != null && room.getPlayer1().getId() == currentUser.getId())
            isValid = true;
        
        else if (room.getPlayer2() != null && room.getPlayer2().getId() == currentUser.getId())
            isValid = true;
        else if (room.getPlayer2() == null) {
            room.setPlayer2(currentUser);
            roomRepo.saveAndFlush(room);
            isValid = true;

        }
    

        if (isValid) {
            model.addAttribute("question1", room.getQuestion1());
            model.addAttribute("question2", room.getQuestion2());
            model.addAttribute("question3", room.getQuestion3());
            model.addAttribute("question4", room.getQuestion4());
            model.addAttribute("question5", room.getQuestion5());
            model.addAttribute("question6", room.getQuestion6());
            model.addAttribute("question7", room.getQuestion7());
            model.addAttribute("question8", room.getQuestion8());
            model.addAttribute("question9", room.getQuestion9());
            model.addAttribute("question10", room.getQuestion10());
            model.addAttribute("question11", room.getQuestion11());
            model.addAttribute("question12", room.getQuestion12());
            model.addAttribute("question13", room.getQuestion13());
            model.addAttribute("question14", room.getQuestion14());
            model.addAttribute("question15", room.getQuestion15());
            model.addAttribute("question16", room.getQuestion16());
            model.addAttribute("question17", room.getQuestion17());
            model.addAttribute("question18", room.getQuestion18());
            model.addAttribute("question19", room.getQuestion19());
            model.addAttribute("question20", room.getQuestion20());
            model.addAttribute("question21", room.getQuestion21());
            model.addAttribute("question22", room.getQuestion22());
            model.addAttribute("question23", room.getQuestion23());
            model.addAttribute("question24", room.getQuestion24());
            model.addAttribute("question25", room.getQuestion25());
            model.addAttribute("room", room);

            return "game_room";

        }

        return "wrong_room";
    }
}
