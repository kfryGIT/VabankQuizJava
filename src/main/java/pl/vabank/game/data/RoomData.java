package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class RoomData {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private int activRoom;

  @Column(nullable = false)
  private int activRound;
  
  @ManyToOne
  private UserData player1;
  int player1Points;

  @ManyToOne
  private UserData player2;
  int player2Points;

  @ManyToOne
  private QuestionsData question1;
  @ManyToOne
  private QuestionsData question2;
  @ManyToOne
  private QuestionsData question3;
  @ManyToOne
  private QuestionsData question4;
  @ManyToOne
  private QuestionsData question5;
  @ManyToOne
  private QuestionsData question6;
  @ManyToOne
  private QuestionsData question7;
  @ManyToOne
  private QuestionsData question8;
  @ManyToOne
  private QuestionsData question9;
  @ManyToOne
  private QuestionsData question10;
  @ManyToOne
  private QuestionsData question11;
  @ManyToOne
  private QuestionsData question12;
  @ManyToOne
  private QuestionsData question13;
  @ManyToOne
  private QuestionsData question14;
  @ManyToOne
  private QuestionsData question15;
  @ManyToOne
  private QuestionsData question16;
  @ManyToOne
  private QuestionsData question17;
  @ManyToOne
  private QuestionsData question18;
  @ManyToOne
  private QuestionsData question19;
  @ManyToOne
  private QuestionsData question20;
  @ManyToOne
  private QuestionsData question21;
  @ManyToOne
  private QuestionsData question22;
  @ManyToOne
  private QuestionsData question23;
  @ManyToOne
  private QuestionsData question24;
  @ManyToOne
  private QuestionsData question25;
  


  @Column(nullable = false)
  private int activeQuestion1;
  @Column(nullable = false)
  private int activeQuestion2;
  @Column(nullable = false)
  private int activeQuestion3;
  @Column(nullable = false)
  private int activeQuestion4;
  @Column(nullable = false)
  private int activeQuestion5;
  @Column(nullable = false)
  private int activeQuestion6;
  @Column(nullable = false)
  private int activeQuestion7;
  @Column(nullable = false)
  private int activeQuestion8;
  @Column(nullable = false)
  private int activeQuestion9;
  @Column(nullable = false)
  private int activeQuestion10;
  @Column(nullable = false)
  private int activeQuestion11;
  @Column(nullable = false)
  private int activeQuestion12;
  @Column(nullable = false)
  private int activeQuestion13;
  @Column(nullable = false)
  private int activeQuestion14;
  @Column(nullable = false)
  private int activeQuestion15;
  @Column(nullable = false)
  private int activeQuestion16;
  @Column(nullable = false)
  private int activeQuestion17;
  @Column(nullable = false)
  private int activeQuestion18;
  @Column(nullable = false)
  private int activeQuestion19;
  @Column(nullable = false)
  private int activeQuestion20;
  @Column(nullable = false)
  private int activeQuestion21;
  @Column(nullable = false)
  private int activeQuestion22;
  @Column(nullable = false)
  private int activeQuestion23;
  @Column(nullable = false)
  private int activeQuestion24;
  @Column(nullable = false)
  private int activeQuestion25;



   
//   @Column(nullable = false, unique = true, length = 45)
//   private String email;
   
 
}