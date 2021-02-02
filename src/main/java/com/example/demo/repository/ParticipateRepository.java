package com.example.demo.repository;

import com.example.demo.entity.Participate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ParticipateRepository extends JpaRepository<Participate,String> {

    }


