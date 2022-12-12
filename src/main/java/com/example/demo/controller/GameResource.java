package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Game;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class GameResource {

	Map<String, Game> gameMap = new HashMap<String, Game>();

	@ApiOperation(value = "Get All Games",notes = "This API retrive all the games available in the Box.")
	@GetMapping("/")
	public List<Game> getAllGames() {
		return new ArrayList<Game>(gameMap.values());
	}
	@ApiOperation(value = "Get Game based on ID",notes = "This API retrive  game based on id")
	@GetMapping("/{gameId}")
	public Game getGameById(@ApiParam(value = "GET GAME BASED ON ID", required = true)@PathVariable String gameId) {
		return gameMap.get(gameId);
	}

	@ApiOperation(value="Add Game to BOX",notes = "Adding Game to box")
	@PostMapping("/")
	public Game addGame(@RequestBody Game game) {
		return gameMap.put(game.getGameId(), game);
	}
}
