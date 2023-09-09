package com.service;

import java.util.List;

import com.model.Player;

public interface PlayerServiceInterface {

	Player insertData(Player p);
	
	Player getOnePlayer(int id);
	
	List<Player> getAllPlayer();
	
	Player updatePlayer(Player p);

	void deletePlayerr(int id);
	
	Player getPlayerBYEmail(String email);

	List<String> getPlayerName();
	
	List<String> getPlayerByCity();


}
