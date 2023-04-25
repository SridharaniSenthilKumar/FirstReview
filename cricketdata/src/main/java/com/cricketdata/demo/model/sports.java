package com.cricketdata.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class sports {
	@Id
	private int playerID;
	private int won;
	private String fullname;
	private String level;
	private String footwearEvaluation;
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getFootwearEvaluation() {
		return footwearEvaluation;
	}
	public void setFootwearEvaluation(String footwearEvaluation) {
		this.footwearEvaluation = footwearEvaluation;
	}
	public sports(int playerID, int won, String fullname, String level, String footwearEvaluation) {
		super();
		this.playerID = playerID;
		this.won = won;
		this.fullname = fullname;
		this.level = level;
		this.footwearEvaluation = footwearEvaluation;
	}
	public sports() {
		super();
	}
	
}


