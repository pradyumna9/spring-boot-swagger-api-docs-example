package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the Game")
public class Game {

	@ApiModelProperty(notes = "uniquely identify the game")
	private String gameId;
	@ApiModelProperty(notes = "Game Name")
	private String name;
	@ApiModelProperty(notes = "Game Cost")
	private float cost;

	public Game(String gameId, String name, float cost) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.cost = cost;
	}

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", name=" + name + ", cost=" + cost + "]";
	}

}
