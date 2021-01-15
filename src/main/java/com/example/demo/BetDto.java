package com.example.demo;

import java.time.LocalDate;


public class BetDto {


   public String getBet() {
      return bet;
   }

   public void setBet(String bet) {
      this.bet = bet;
   }

   public String getStake() {
      return stake;
   }

   public void setStake(String stake) {
      this.stake = stake;
   }

   public LocalDate getEndbet() {
      return endbet;
   }

   public void setEndbet(LocalDate endbet) {
      this.endbet = endbet;
   }

   public String getCreator() {
      return creator;
   }

   public void setCreator(String creator) {
      this.creator = creator;
   }

   public String getChallenger() { return challenger; }

   public void setChallenger(String challenger) {
      this.challenger = challenger;
   }

   String bet;

   String stake;

   LocalDate endbet;

   String creator;

   String challenger;


}
