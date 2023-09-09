package com.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Player;

public interface PlayurRepository extends JpaRepository<Player,Integer> {

	Player findByEmail (String email);
	
	@Query("select p.name from Player p")
	List<String> findPlayersnames();
	
	@Query("select id,name,email from Player where city='Pune' ")
	List<String> findPlayerByCity();

}
