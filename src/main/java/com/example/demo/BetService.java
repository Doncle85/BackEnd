package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class BetService {

    @Transactional
    public void registerUser(String stake, LocalDateTime endbet) {
        Bet bet= new Bet();
        bet.setBet(bet);
        bet.setStake(stake);
        bet.setEndebet(endbet);

    }

    public void save(Object bet) {

    }
}
