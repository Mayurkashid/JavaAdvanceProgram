package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PlayurRepository;
import com.model.Player;

@Service
public class PlayerServiceImpl implements PlayerServiceInterface {
	
	@Autowired
	PlayurRepository playerRepo;


	@Override
	public Player insertData(Player p) 
	{

		return playerRepo.save(p);
	}

	public Player getOnePlayer(int id) 
	{
		// TODO Auto-generated method stub
		return playerRepo.findById(id).orElse(null);
	}
	
	
	public List<Player>getAllPlayer()
	{
		List<Player>list=playerRepo.findAll();
		return list;
	}
	
	public void deletePlayerr(int id)	
	{
		playerRepo.deleteById(id);
	}
	
	
	public Player updatePlayer(Player p)
	{
		Player existingPlayer=playerRepo.findById(p.getId()).orElse(null);
		existingPlayer.setName(p.getName());
		return playerRepo.save(existingPlayer);
	}

	@Override
	public Player getPlayerBYEmail(String email) 
	{
		return playerRepo.findByEmail(email);
	}

	@Override
	public List<String> getPlayerName() 
	{
		return playerRepo.findPlayersnames();
	}

	@Override
	public List<String> getPlayerByCity()
	{
		return playerRepo.findPlayerByCity();
	}
	


}
