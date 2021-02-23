package com.example.demo.dto;

import java.time.LocalDate;


public class UpdateBetDto {



   public LocalDate getEndbet() {
      return endbet;
   }

   public void setEndbet(LocalDate endbet) {
      this.endbet = endbet;
   }

   LocalDate endbet;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   private Integer id;



}
