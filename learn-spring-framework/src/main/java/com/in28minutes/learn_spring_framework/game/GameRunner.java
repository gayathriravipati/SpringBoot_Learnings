package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {
	//instance of the MarioGame
	GamingConsole game;
	
	//class constructor 
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	@Bean
	public void run() {
		System.out.println("Running game:" + game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
	
}
