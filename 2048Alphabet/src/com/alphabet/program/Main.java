package com.alphabet.program;
import processing.core.*;


public class Main extends PApplet {
	
	public static void main(String args[]) {
	    PApplet.main(new String[] { "Main"});
	  }

	Board board;
	StartMenu startMenu;
	int screenWidth = 1200;
	int screenHeight =600;


	/**
	*Setup van het programma
	*Zet alles klaar
	*/
	public void setup(){
	  board = new Board((byte)4,(byte)4, 150, this);
	  startMenu = new StartMenu(this);
	  background(158,40,89);
	  size(screenWidth,screenHeight,P3D);
	}


	/**
	*Roep alle drawing functies aan en zet de camera juist (camera klopt alleen bij 1600x900 resolutie)
	*/
	public void draw(){
	  camera(width/2-150, 225, (height/2) / tan(PI/6), width/2-(4*100)/2+100/2,600,0, 0, 1, 0);
	  lights();
	  startMenu.draw();
	  if(!startMenu.isVisible()){
	    board.drawBoard();
	  }
	}



	void update(){
	  
	  startMenu.check();
	  
	}
	public void mousePressed() {
	  
	  if (overRect()) {
	    startMenu.hide();
	  }
	}

	boolean overRect()  {
	  if (mouseX >= 0 && mouseX <= 10000 && 
	      mouseY >= 0 && mouseY <= 40000) {
	    return true;
	  } else {
	    return false;
	  }
	}
}
