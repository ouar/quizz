package fr.gfi.quiz.entite.hibernate;
// Generated 14 avr. 2014 16:36:23 by Hibernate Tools 4.0.0



/**
 * QuizzQuestion generated by hbm2java
 */
public class QuizzQuestion  implements java.io.Serializable {


     private Integer id;
     private Question question;
     private Quizz quizz;

    public QuizzQuestion() {
    }

    public QuizzQuestion(Question question, Quizz quizz) {
       this.question = question;
       this.quizz = quizz;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Question getQuestion() {
        return this.question;
    }
    
    public void setQuestion(Question question) {
        this.question = question;
    }
    public Quizz getQuizz() {
        return this.quizz;
    }
    
    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }




}


