package com.example.demo;

import com.example.demo.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;



    @Repository
    public interface BetRepository extends JpaRepository<Bet,String> {

    }
