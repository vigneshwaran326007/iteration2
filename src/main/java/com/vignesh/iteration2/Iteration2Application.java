package com.vignesh.iteration2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

interface gameControl{
	void up();
	void down();
	void left();
	void right();
	
}



class contra implements gameControl{
	
	public void up() {
		System.out.println("contra UP");
	}
	public void down() {
		System.out.println("contra down");
	}
	public void left() {
		System.out.println("contra left");
	}
	public void right() {
		System.out.println("contra right");
	}
	
}
class packman implements gameControl{
	
	public void up() {
		System.out.println("packman UP");
	}
	public void down() {
		System.out.println("packman down");
	}
	public void left() {
		System.out.println("packman left");
	}
	public void right() {
		System.out.println("packman right");
	}
	
}

class mario implements gameControl{
	public void up() {
		System.out.println("mario UP");
	}
	public void down() {
		System.out.println("mario down");
	}
	public void left() {
		System.out.println("mario left");
	}
	public void right() {
		System.out.println("mario right");
	}
}

class GameFeautures{
	
	gameControl game;
	
	GameFeautures(gameControl game){
		this.game=game;
	}

	void Gamerunner() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}




		
		




public class Iteration2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Iteration2Application.class, args);
		
		mario mario=new mario();
		packman packman=new packman();
		contra contra=new contra();
		
		GameFeautures game=new GameFeautures(mario);
		game.Gamerunner();
	}

}
