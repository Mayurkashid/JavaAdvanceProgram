package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Player;
import com.service.PlayerServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController //restfull web serviceses
public class PlayerController {
	
	@Autowired
	PlayerServiceInterface  playerService;

	/*
	@PostMapping("/save")
	public Player savePlayer(@RequestBody Player p)
	{
		return playerService.insertData(p);
	}
	*/
	@PostMapping("/save")
	public ResponseEntity<Player> savePlayer(@RequestBody Player p)
	{
		Player pl=playerService.insertData(p);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","Save Player").body(p);
	}

	
	@GetMapping("get/{id}")
	public Player findOnePlayer(@PathVariable int id)
	{
		return playerService.getOnePlayer(id);
	}
	
	@GetMapping("getall")
	public List<Player>findAllPlayer()
	{
		List<Player> list=playerService.getAllPlayer();
		return list;
	}
	
	@DeleteMapping("delete/{id}")
	public void deletePlayer(@PathVariable int id)
	{
		playerService.deletePlayerr(id);
	}
	

	@PutMapping("update")
	public Player updatePlayer(@RequestBody Player p)
	{
		return playerService.updatePlayer(p);
	}

	@GetMapping("/find/{email}")
	public Player getPlayerBYEmail(@PathVariable String email) 
	{
		return playerService.getPlayerBYEmail(email);
	}

	@GetMapping("/getNames")
	public List<String> getPlayerName() 
	{
		return playerService.getPlayerName();
	}
	
	@GetMapping("/getbycity")
	public List<String> findPlayerByCity()
	{
		return playerService.getPlayerByCity();
	}


}



