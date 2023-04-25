package com.cricketdata.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricketdata.demo.model.sports;
import com.cricketdata.demo.service.CricketDataService;

@RestController
public class CricketDataController {
	@Autowired
	public CricketDataService cricketService;
	@GetMapping(value="/fetchdata")
	public List<sports>getAllDatas(){
	List<sports>dataList=cricketService.getAllDatas();
    return dataList;
	}
	
	@PostMapping("/savecricketdata")
	public sports saveCricketData(@RequestBody sports t)
	{
		return cricketService.saveCricketData(t);
	}
	
	@PutMapping(value="/updateCricketData")
	public sports updateCricketData(@RequestBody sports t)
	{
		return cricketService.saveCricketData(t);
	}
	
	@DeleteMapping(value="/deleteCricketData/{id}")
	public void deleteCricketData(@PathVariable("id") int playerID)
	{
		cricketService.deleteCricketData(playerID);
	}

}
