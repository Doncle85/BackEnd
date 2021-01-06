package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    @Transactional
    public void save(BetDto betDto) {
        Bet bet= new Bet();
        bet.setBet(betDto.getBet());
        bet.setStake(betDto.getStake());
        bet.setEndebet(betDto.getEndbet());
        bet.setCode(UUID.randomUUID().toString());
        betRepository.save(bet);
    }

}
