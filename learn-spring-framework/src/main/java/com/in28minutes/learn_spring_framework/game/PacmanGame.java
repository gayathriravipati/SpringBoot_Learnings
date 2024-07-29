package com.in28minutes.learn_spring_framework.game;


public class PacmanGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("jump up");
	}
	@Override
	public void down() {
		System.out.println("move down");
	}
	@Override
	public void left() {
		System.out.println("move left");
	}
	@Override
	public void right() {
		System.out.println("move right");
	}
}
