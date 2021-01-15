package com.example.demo;

import javax.persistence.*;

@Entity(name= "participate")
@IdClass(ParticipateId.class)
public class Participate {

    @Id
    private int iduser;

    @Id
    private int idbet;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdbet() {
        return idbet;
    }

    public void setIdbet(int idbet) {
        this.idbet = idbet;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Column
    private boolean answer;

}
