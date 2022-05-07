package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
@Entity 
public class QuestionsData {
    
    public QuestionsData() {
    }

    public QuestionsData(Long id, String questionText, String answer1Text, String answer2Text, String answer3Text,
            String answer4Text, String answerCorrect, String nameCategory, int priceCategory) {
        this.id = id;
        this.questionText = questionText;
        this.answer1Text = answer1Text;
        this.answer2Text = answer2Text;
        this.answer3Text = answer3Text;
        this.answer4Text = answer4Text;
        this.answerCorrect = answerCorrect;
        this.nameCategory = nameCategory;
        this.priceCategory = priceCategory;
    }

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String questionText;

    @Column(nullable = false)
    private String answer1Text;

    @Column(nullable = false)
    private String answer2Text;

    @Column(nullable = false)
    private String answer3Text;

    @Column(nullable = false)
    private String answer4Text;

    @Column(nullable = false)
    private String answerCorrect;

    @Column(nullable = false)
    private String nameCategory;

    @Column(nullable = false)
    private int priceCategory;

}
