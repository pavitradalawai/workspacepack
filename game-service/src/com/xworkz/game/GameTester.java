package com.xworkz.game;
import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;
public class GameTester {

	

	

	public static void main(String[] args) {
	

		GameDTO dto = new GameDTO("xyz", "34", "Empty", 5, 0, false);






		
		 GameService gameservice = new GameServiceImpl();
		 String saved = gameservice.validateAndSave1(dto);
		 System.out.println(saved);

	}


	
}
















