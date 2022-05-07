package pl.vabank.game.controllers;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.vabank.game.access.QuestionsRepository;
import pl.vabank.game.data.QuestionsData;

@Controller
public class AnswerController {

    @Autowired
    private QuestionsRepository questRepo;


    @GetMapping("/answer/{rid}/{qid}/{aid}")
    public String answerQuestion(@PathVariable Long rid, @PathVariable Long qid, @PathVariable Long aid, Model model) {

        QuestionsData question=null;
        try {
            question = questRepo.getById(qid);

            String answerText = null;
            if (aid==1L) answerText=question.getAnswer1Text();
            else if (aid==2L) answerText=question.getAnswer2Text();
            else if (aid==3L) answerText=question.getAnswer3Text();
            else if (aid==4L) answerText=question.getAnswer4Text();

            if (answerText != null && question.getAnswerCorrect().equals(answerText)){
                model.addAttribute("message", "Odpowiedź poprawna");
            }
            else{
                model.addAttribute("message", "Odpowiedź niepoprawna. " + "Odpowiedź poprawna to: " +  question.getAnswerCorrect());
            }

            model.addAttribute("roomid", rid);
            model.addAttribute("questionid", qid);

        } catch (Exception e) {
            return "redirect:question/"+rid.toString()+'/'+qid.toString();
        }





        return "answer";
    }
    
}
