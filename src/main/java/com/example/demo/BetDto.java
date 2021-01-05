package com.example.demo;

import java.time.LocalDateTime;

public class BetDto {

    public String getStake() {
        return stake;
    }

    public void setStake(String stake) {
        this.stake = stake;
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


    String bet;

    String stake;

    LocalDateTime endbet;

}
