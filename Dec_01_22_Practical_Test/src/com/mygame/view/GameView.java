package com.mygame.view;
import com.mygame.service.GameService;
import com.mygame.dao.GameDAO;
import java.util.Random;

public class GameView {
	static String cityWithBlank[]= new String[5] ;
	int randomNumberArray[] = new int[10];
	GameService gsObj = new GameService();
	
	void generateRamdomNumber(int count) {
		
	}
	public void diaplayCityNameWithBlanks() {
		  gsObj.getCityNamesService();
		  
	}

}
