package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface BetRepository {
    @Repository
    public interface UserRepository extends JpaRepository<Bet,String> {
        Optional<Bet> findByEmail(String email);
    }
}