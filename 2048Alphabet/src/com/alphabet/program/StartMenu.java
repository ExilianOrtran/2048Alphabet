package com.alphabet.program;
import processing.core.*;

public class StartMenu{
	
  PApplet parent;
  PImage img;
  
  StartMenu(PApplet parent){
	  this.parent = parent;
	  img = parent.loadImage("button.png");
  }
  boolean show = true;
  
  public void draw(){
	  
	  parent.image(img,0,0);
    
  }
  
  
  public boolean isVisible(){
    return show;
  }
  
  public void show(){
     show = true;
  }
  
  public void hide(){
     show = false;
  }


public void check() {
	// TODO Auto-generated method stub
	
}
}