package com.example.demo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "bet")
public class Bet {

    public int getId() {
        return id;
    }

    public String getStake() {
        return stake;
    }

    public String getWinner() {
        return winner;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStake(String stake) {
        this.stake = stake;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getEndebet() {
        return endbet;
    }

    public void setEndebet(LocalDateTime endebet) {
        this.endbet = endebet;
    }

    public LocalDateTime getEndbet() {
        return endbet;
    }

    public void setEndbet(LocalDateTime endbet) {
        this.endbet = endbet;
    }


    public String getBet() {
        return bet;
    }


    public void setBet(String bet) {
        this.bet = bet;
    }

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String bet;

    @Column
    private String stake;

    @Column
    private String winner;

    @Column
    private String code;

    @Column
    private LocalDateTime endbet;


}
