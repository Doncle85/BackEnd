package com.example.demo;

import javax.persistence.Id;
import java.io.Serializable;

public class ParticipateId implements Serializable {
    @Id
    private int iduser;

    public ParticipateId(int iduser, int idbet) {
        this.iduser = iduser;
        this.idbet = idbet;
    }

    public ParticipateId() {
    }

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
}
