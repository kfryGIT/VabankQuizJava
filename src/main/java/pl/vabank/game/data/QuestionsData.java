package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
@Entity 
public class QuestionsData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
