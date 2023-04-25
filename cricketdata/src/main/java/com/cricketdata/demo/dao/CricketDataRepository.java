package com.cricketdata.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketdata.demo.model.sports;

public interface CricketDataRepository extends JpaRepository<sports,Integer>{

}
