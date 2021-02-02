package com.example.demo.service;

import com.example.demo.dto.BetDto;
import com.example.demo.entity.Bet;
import com.example.demo.entity.Participate;
import com.example.demo.entity.User;
import com.example.demo.repository.BetRepository;
import com.example.demo.repository.ParticipateRepository;
import com.example.demo.security.UserRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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
        Optional<User> curentUser = userRepository.findByUsername(betDto.getCreator());
        Bet bet = new Bet();
        bet.setBet(betDto.getBet());
        bet.setStake(betDto.getStake());
        bet.setEndbet(betDto.getEndbet());
        bet.setCreator(curentUser.get().getId());
//        bet.setCode(RandomStringUtils.randomAlphanumeric(5).toUpperCase());
        Bet saveBet = betRepository.save(bet);
        Participate participate = new Participate();
        participate.setIdbet(saveBet.getId());
        participate.setIduser(curentUser.get().getId());
        participateRepository.save(participate);
        Participate participate2 = new Participate();
        participate2.setIdbet(saveBet.getId());
        User challenger = userRepository.findByUsername(betDto.getChallenger()).get();
        participate2.setIduser(challenger.getId());
        participateRepository.save(participate2);
}


}


