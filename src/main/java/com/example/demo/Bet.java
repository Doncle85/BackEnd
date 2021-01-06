package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

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

    public LocalDate getEndebet() {
        return endbet;
    }

    public void setEndebet(LocalDate endebet) {
        this.endbet = endebet;
    }

    public LocalDate getEndbet() {
        return endbet;
    }

    public void setEndbet(LocalDate endbet) {
        this.endbet = endbet;
    }


    public String getBet() {
        return bet;
    }


    public void setBet(String bet) {
        this.bet = bet;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private LocalDate endbet;


}
