package pl.vabank.game.controllers;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.access.RoomRepository;
import pl.vabank.game.data.QuestionsData;
import pl.vabank.game.data.RoomData;


@Controller
public class QuestionController {

    @Autowired
    private QuestionsRepository questRepo;

    @Autowired
    private RoomRepository roomRepo;


    @GetMapping("/question/{rid}/{qid}")
    public String gameQuestion(@PathVariable Long rid, @PathVariable Long qid, Model model) {

        try {
            QuestionsData question = questRepo.getById(qid);
            model.addAttribute("question", question);

            RoomData room = roomRepo.getById(rid);
            model.addAttribute("room", room);
        } catch (Exception e) {
            return "redirect:game_room/"+rid.toString();
        }



        return "question";
    }

    
}
