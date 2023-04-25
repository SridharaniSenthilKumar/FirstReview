package com.cricketdata.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketdata.demo.dao.CricketDataRepository;
import com.cricketdata.demo.model.sports;

@Service
public class CricketDataService {
@Autowired
        CricketDataRepository dataRepository;
        public List<sports> getAllDatas () {
        List<sports>dataList=dataRepository.findAll();
        return dataList;
       }

public sports saveCricketData(sports t)
{
sports obj=dataRepository.save(t);

return obj;
}

public sports updateCricketData(sports t)
{
	sports obj=dataRepository.save(t);
	return obj;
}


public void deleteCricketData(int playerID)
{
	dataRepository.deleteById(playerID);
}

}

