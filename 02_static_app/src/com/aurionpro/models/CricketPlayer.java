package com.aurionpro.models;

public class CricketPlayer {

	
	private int playerId;
	private String name;
	private int matches;
	private double runs ;
	private double wickets;
	private double Average;
	
	
	public CricketPlayer() {
		
	}
	
	public CricketPlayer(int playerId, String name, int matches, double runs, double wickets) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		
	}

	public double getAverage() {
		return Average;
	}
	public void setAverage(double average) {
		Average = average;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public double getRuns() {
		return runs;
	}
	public void setRuns(double runs) {
		this.runs = runs;
	}
	public double getWickets() {
		return wickets;
	}
	public void setWickets(double wickets) {
		this.wickets = wickets;
	}
	
	
	public void calculateAverage() {
		setAverage(getRuns()/getMatches());
	}
	
	
}
