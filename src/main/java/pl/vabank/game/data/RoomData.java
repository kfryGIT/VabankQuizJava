package pl.vabank.game.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class RoomData {

  public RoomData() {
  }

  

  public RoomData(Long id) {
    this.id = id;
  }



  public RoomData(Long id, int activRoom, int activRound, UserData player1, int player1Points, UserData player2,
      int player2Points, QuestionsData question1, QuestionsData question2, QuestionsData question3,
      QuestionsData question4, QuestionsData question5, QuestionsData question6, QuestionsData question7,
      QuestionsData question8, QuestionsData question9, QuestionsData question10, QuestionsData question11,
      QuestionsData question12, QuestionsData question13, QuestionsData question14, QuestionsData question15,
      QuestionsData question16, QuestionsData question17, QuestionsData question18, QuestionsData question19,
      QuestionsData question20, QuestionsData question21, QuestionsData question22, QuestionsData question23,
      QuestionsData question24, QuestionsData question25, int activeQuestion1, int activeQuestion2, int activeQuestion3,
      int activeQuestion4, int activeQuestion5, int activeQuestion6, int activeQuestion7, int activeQuestion8,
      int activeQuestion9, int activeQuestion10, int activeQuestion11, int activeQuestion12, int activeQuestion13,
      int activeQuestion14, int activeQuestion15, int activeQuestion16, int activeQuestion17, int activeQuestion18,
      int activeQuestion19, int activeQuestion20, int activeQuestion21, int activeQuestion22, int activeQuestion23,
      int activeQuestion24, int activeQuestion25) {
    this.id = id;
    this.activRoom = activRoom;
    this.activRound = activRound;
    this.player1 = player1;
    this.player1Points = player1Points;
    this.player2 = player2;
    this.player2Points = player2Points;
    this.question1 = question1;
    this.question2 = question2;
    this.question3 = question3;
    this.question4 = question4;
    this.question5 = question5;
    this.question6 = question6;
    this.question7 = question7;
    this.question8 = question8;
    this.question9 = question9;
    this.question10 = question10;
    this.question11 = question11;
    this.question12 = question12;
    this.question13 = question13;
    this.question14 = question14;
    this.question15 = question15;
    this.question16 = question16;
    this.question17 = question17;
    this.question18 = question18;
    this.question19 = question19;
    this.question20 = question20;
    this.question21 = question21;
    this.question22 = question22;
    this.question23 = question23;
    this.question24 = question24;
    this.question25 = question25;
    this.activeQuestion1 = activeQuestion1;
    this.activeQuestion2 = activeQuestion2;
    this.activeQuestion3 = activeQuestion3;
    this.activeQuestion4 = activeQuestion4;
    this.activeQuestion5 = activeQuestion5;
    this.activeQuestion6 = activeQuestion6;
    this.activeQuestion7 = activeQuestion7;
    this.activeQuestion8 = activeQuestion8;
    this.activeQuestion9 = activeQuestion9;
    this.activeQuestion10 = activeQuestion10;
    this.activeQuestion11 = activeQuestion11;
    this.activeQuestion12 = activeQuestion12;
    this.activeQuestion13 = activeQuestion13;
    this.activeQuestion14 = activeQuestion14;
    this.activeQuestion15 = activeQuestion15;
    this.activeQuestion16 = activeQuestion16;
    this.activeQuestion17 = activeQuestion17;
    this.activeQuestion18 = activeQuestion18;
    this.activeQuestion19 = activeQuestion19;
    this.activeQuestion20 = activeQuestion20;
    this.activeQuestion21 = activeQuestion21;
    this.activeQuestion22 = activeQuestion22;
    this.activeQuestion23 = activeQuestion23;
    this.activeQuestion24 = activeQuestion24;
    this.activeQuestion25 = activeQuestion25;
  }


  public RoomData(Long id, int activRoom, int activRound, UserData player1, int player1Points, UserData player2,
  int player2Points, List<QuestionsData> allQuestions) {
    this.id = id;
    this.activRoom = activRoom;
    this.activRound = activRound;
    this.player1 = player1;
    this.player1Points = player1Points;
    this.player2 = player2;
    this.player2Points = player2Points;
    this.question1 = allQuestions.get(0);
    this.question2 = allQuestions.get(1);
    this.question3 = allQuestions.get(2);
    this.question4 = allQuestions.get(3);
    this.question5 = allQuestions.get(4);
    this.question6 = allQuestions.get(5);
    this.question7 = allQuestions.get(6);
    this.question8 = allQuestions.get(7);
    this.question9 = allQuestions.get(8);
    this.question10 = allQuestions.get(9);
    this.question11 = allQuestions.get(10);
    this.question12 = allQuestions.get(11);
    this.question13 = allQuestions.get(12);
    this.question14 = allQuestions.get(13);
    this.question15 = allQuestions.get(14);
    this.question16 = allQuestions.get(15);
    this.question17 = allQuestions.get(16);
    this.question18 = allQuestions.get(17);
    this.question19 = allQuestions.get(18);
    this.question20 = allQuestions.get(19);
    this.question21 = allQuestions.get(20);
    this.question22 = allQuestions.get(21);
    this.question23 = allQuestions.get(22);
    this.question24 = allQuestions.get(23);
    this.question25 = allQuestions.get(24);
    this.activeQuestion1 = 2;
    this.activeQuestion2 = 2;
    this.activeQuestion3 = 2;
    this.activeQuestion4 = 2;
    this.activeQuestion5 = 2;
    this.activeQuestion6 = 2;
    this.activeQuestion7 = 2;
    this.activeQuestion8 = 2;
    this.activeQuestion9 = 2;
    this.activeQuestion10 = 2;
    this.activeQuestion11 = 2;
    this.activeQuestion12 = 2;
    this.activeQuestion13 = 2;
    this.activeQuestion14 = 2;
    this.activeQuestion15 = 2;
    this.activeQuestion16 = 2;
    this.activeQuestion17 = 2;
    this.activeQuestion18 = 2;
    this.activeQuestion19 = 2;
    this.activeQuestion20 = 2;
    this.activeQuestion21 = 2;
    this.activeQuestion22 = 2;
    this.activeQuestion23 = 2;
    this.activeQuestion24 = 2;
    this.activeQuestion25 = 2;

  }


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
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getActivRoom() {
    return activRoom;
  }

  public void setActivRoom(int activRoom) {
    this.activRoom = activRoom;
  }

  public int getActivRound() {
    return activRound;
  }

  public void setActivRound(int activRound) {
    this.activRound = activRound;
  }

  public UserData getPlayer1() {
    return player1;
  }

  public void setPlayer1(UserData player1) {
    this.player1 = player1;
  }

  public int getPlayer1Points() {
    return player1Points;
  }

  public void setPlayer1Points(int player1Points) {
    this.player1Points = player1Points;
  }

  public UserData getPlayer2() {
    return player2;
  }

  public void setPlayer2(UserData player2) {
    this.player2 = player2;
  }

  public int getPlayer2Points() {
    return player2Points;
  }

  public void setPlayer2Points(int player2Points) {
    this.player2Points = player2Points;
  }

  public QuestionsData getQuestion1() {
    return question1;
  }

  public void setQuestion1(QuestionsData question1) {
    this.question1 = question1;
  }

  public QuestionsData getQuestion2() {
    return question2;
  }

  public void setQuestion2(QuestionsData question2) {
    this.question2 = question2;
  }

  public QuestionsData getQuestion3() {
    return question3;
  }

  public void setQuestion3(QuestionsData question3) {
    this.question3 = question3;
  }

  public QuestionsData getQuestion4() {
    return question4;
  }

  public void setQuestion4(QuestionsData question4) {
    this.question4 = question4;
  }

  public QuestionsData getQuestion5() {
    return question5;
  }

  public void setQuestion5(QuestionsData question5) {
    this.question5 = question5;
  }

  public QuestionsData getQuestion6() {
    return question6;
  }

  public void setQuestion6(QuestionsData question6) {
    this.question6 = question6;
  }

  public QuestionsData getQuestion7() {
    return question7;
  }

  public void setQuestion7(QuestionsData question7) {
    this.question7 = question7;
  }

  public QuestionsData getQuestion8() {
    return question8;
  }

  public void setQuestion8(QuestionsData question8) {
    this.question8 = question8;
  }

  public QuestionsData getQuestion9() {
    return question9;
  }

  public void setQuestion9(QuestionsData question9) {
    this.question9 = question9;
  }

  public QuestionsData getQuestion10() {
    return question10;
  }

  public void setQuestion10(QuestionsData question10) {
    this.question10 = question10;
  }

  public QuestionsData getQuestion11() {
    return question11;
  }

  public void setQuestion11(QuestionsData question11) {
    this.question11 = question11;
  }

  public QuestionsData getQuestion12() {
    return question12;
  }

  public void setQuestion12(QuestionsData question12) {
    this.question12 = question12;
  }

  public QuestionsData getQuestion13() {
    return question13;
  }

  public void setQuestion13(QuestionsData question13) {
    this.question13 = question13;
  }

  public QuestionsData getQuestion14() {
    return question14;
  }

  public void setQuestion14(QuestionsData question14) {
    this.question14 = question14;
  }

  public QuestionsData getQuestion15() {
    return question15;
  }

  public void setQuestion15(QuestionsData question15) {
    this.question15 = question15;
  }

  public QuestionsData getQuestion16() {
    return question16;
  }

  public void setQuestion16(QuestionsData question16) {
    this.question16 = question16;
  }

  public QuestionsData getQuestion17() {
    return question17;
  }

  public void setQuestion17(QuestionsData question17) {
    this.question17 = question17;
  }

  public QuestionsData getQuestion18() {
    return question18;
  }

  public void setQuestion18(QuestionsData question18) {
    this.question18 = question18;
  }

  public QuestionsData getQuestion19() {
    return question19;
  }

  public void setQuestion19(QuestionsData question19) {
    this.question19 = question19;
  }

  public QuestionsData getQuestion20() {
    return question20;
  }

  public void setQuestion20(QuestionsData question20) {
    this.question20 = question20;
  }

  public QuestionsData getQuestion21() {
    return question21;
  }

  public void setQuestion21(QuestionsData question21) {
    this.question21 = question21;
  }

  public QuestionsData getQuestion22() {
    return question22;
  }

  public void setQuestion22(QuestionsData question22) {
    this.question22 = question22;
  }

  public QuestionsData getQuestion23() {
    return question23;
  }

  public void setQuestion23(QuestionsData question23) {
    this.question23 = question23;
  }

  public QuestionsData getQuestion24() {
    return question24;
  }

  public void setQuestion24(QuestionsData question24) {
    this.question24 = question24;
  }

  public QuestionsData getQuestion25() {
    return question25;
  }

  public void setQuestion25(QuestionsData question25) {
    this.question25 = question25;
  }

  public int getActiveQuestion1() {
    return activeQuestion1;
  }

  public void setActiveQuestion1(int activeQuestion1) {
    this.activeQuestion1 = activeQuestion1;
  }

  public int getActiveQuestion2() {
    return activeQuestion2;
  }

  public void setActiveQuestion2(int activeQuestion2) {
    this.activeQuestion2 = activeQuestion2;
  }

  public int getActiveQuestion3() {
    return activeQuestion3;
  }

  public void setActiveQuestion3(int activeQuestion3) {
    this.activeQuestion3 = activeQuestion3;
  }

  public int getActiveQuestion4() {
    return activeQuestion4;
  }

  public void setActiveQuestion4(int activeQuestion4) {
    this.activeQuestion4 = activeQuestion4;
  }

  public int getActiveQuestion5() {
    return activeQuestion5;
  }

  public void setActiveQuestion5(int activeQuestion5) {
    this.activeQuestion5 = activeQuestion5;
  }

  public int getActiveQuestion6() {
    return activeQuestion6;
  }

  public void setActiveQuestion6(int activeQuestion6) {
    this.activeQuestion6 = activeQuestion6;
  }

  public int getActiveQuestion7() {
    return activeQuestion7;
  }

  public void setActiveQuestion7(int activeQuestion7) {
    this.activeQuestion7 = activeQuestion7;
  }

  public int getActiveQuestion8() {
    return activeQuestion8;
  }

  public void setActiveQuestion8(int activeQuestion8) {
    this.activeQuestion8 = activeQuestion8;
  }

  public int getActiveQuestion9() {
    return activeQuestion9;
  }

  public void setActiveQuestion9(int activeQuestion9) {
    this.activeQuestion9 = activeQuestion9;
  }

  public int getActiveQuestion10() {
    return activeQuestion10;
  }

  public void setActiveQuestion10(int activeQuestion10) {
    this.activeQuestion10 = activeQuestion10;
  }

  public int getActiveQuestion11() {
    return activeQuestion11;
  }

  public void setActiveQuestion11(int activeQuestion11) {
    this.activeQuestion11 = activeQuestion11;
  }

  public int getActiveQuestion12() {
    return activeQuestion12;
  }

  public void setActiveQuestion12(int activeQuestion12) {
    this.activeQuestion12 = activeQuestion12;
  }

  public int getActiveQuestion13() {
    return activeQuestion13;
  }

  public void setActiveQuestion13(int activeQuestion13) {
    this.activeQuestion13 = activeQuestion13;
  }

  public int getActiveQuestion14() {
    return activeQuestion14;
  }

  public void setActiveQuestion14(int activeQuestion14) {
    this.activeQuestion14 = activeQuestion14;
  }

  public int getActiveQuestion15() {
    return activeQuestion15;
  }

  public void setActiveQuestion15(int activeQuestion15) {
    this.activeQuestion15 = activeQuestion15;
  }

  public int getActiveQuestion16() {
    return activeQuestion16;
  }

  public void setActiveQuestion16(int activeQuestion16) {
    this.activeQuestion16 = activeQuestion16;
  }

  public int getActiveQuestion17() {
    return activeQuestion17;
  }

  public void setActiveQuestion17(int activeQuestion17) {
    this.activeQuestion17 = activeQuestion17;
  }

  public int getActiveQuestion18() {
    return activeQuestion18;
  }

  public void setActiveQuestion18(int activeQuestion18) {
    this.activeQuestion18 = activeQuestion18;
  }

  public int getActiveQuestion19() {
    return activeQuestion19;
  }

  public void setActiveQuestion19(int activeQuestion19) {
    this.activeQuestion19 = activeQuestion19;
  }

  public int getActiveQuestion20() {
    return activeQuestion20;
  }

  public void setActiveQuestion20(int activeQuestion20) {
    this.activeQuestion20 = activeQuestion20;
  }

  public int getActiveQuestion21() {
    return activeQuestion21;
  }

  public void setActiveQuestion21(int activeQuestion21) {
    this.activeQuestion21 = activeQuestion21;
  }

  public int getActiveQuestion22() {
    return activeQuestion22;
  }

  public void setActiveQuestion22(int activeQuestion22) {
    this.activeQuestion22 = activeQuestion22;
  }

  public int getActiveQuestion23() {
    return activeQuestion23;
  }

  public void setActiveQuestion23(int activeQuestion23) {
    this.activeQuestion23 = activeQuestion23;
  }

  public int getActiveQuestion24() {
    return activeQuestion24;
  }

  public void setActiveQuestion24(int activeQuestion24) {
    this.activeQuestion24 = activeQuestion24;
  }

  public int getActiveQuestion25() {
    return activeQuestion25;
  }

  public void setActiveQuestion25(int activeQuestion25) {
    this.activeQuestion25 = activeQuestion25;
  }


   
//   @Column(nullable = false, unique = true, length = 45)
//   private String email;
   
 
}