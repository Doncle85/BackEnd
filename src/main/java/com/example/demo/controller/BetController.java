package com.example.demo.controller;

import com.example.demo.dto.BetDto;
import com.example.demo.entity.Bet;
import com.example.demo.repository.BetRepository;
import com.example.demo.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BetController {
    @Autowired
    private BetService betService;

    @PostMapping("/records")
    public void register(@RequestBody BetDto bet) {
        betService.save(bet);
    }

    @GetMapping("/bets")
    List<Bet> all() {
        return betService.findAll();
    }

    @DeleteMapping("/bets/{id}")
    void deleteBets(@PathVariable ("id") int id) {
        betService.deleteById(id);
    }
}

