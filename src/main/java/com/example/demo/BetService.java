package com.example.demo;

import com.example.demo.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    @Autowired
    private ParticipateRepository participateRepository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(BetDto betDto) {
        Bet bet = new Bet();
        bet.setBet(betDto.getBet());
        bet.setStake(betDto.getStake());
        bet.setEndbet(betDto.getEndbet());
        bet.setCreator(betDto.getCreator());
        bet.setCode(UUID.randomUUID().toString());
        Bet saveBet = betRepository.save(bet);
        Participate participate = new Participate();
        
        participate.setIdbet(saveBet.getId());
        participate.setIduser(1);
//        participateRepository.findById("iduser");
//        participateRepository.findById("idbet");
        participateRepository.save(participate);
        Participate participate2 = new Participate();
        participate2.setIdbet(saveBet.getId());
        User challenger = userRepository.findByUsername(betDto.getChallenger()).get();
        participate2.setIduser(challenger.getId());
        participateRepository.save(participate2);
}


}


