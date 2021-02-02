package com.example.demo.controller;

import com.example.demo.dto.BetDto;
import com.example.demo.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetController {
    @Autowired
    private BetService betService;

    @PostMapping("/records")
    public void register(@RequestBody BetDto bet) {
        betService.save(bet);
    }




}
