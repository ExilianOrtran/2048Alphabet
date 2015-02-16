package com.alphabet.program;
import processing.core.*;

//De globale variabelen
//name is de naam van de speler
//score is de score van de speler
//level is het level waarin de speler zich bevindt
public class Player {
  String name;
  int score;
  int level;
  
  
  /**
  *De constructor functie. Wanneer de player wordt aangemaakt, krijgt het de globale variabelen binnen
  *Heeft als argument de naam van de speler nodig.
  *Bij het aanmaken van een nieuwe speler, is het logisch dat zijn score en level 0 zijn.
  */
  Player(String name){
    this.name = name;
    this.score = 0;
    this.level = 0;
  }
  
  
  /*
  //Wanneer in een latere versie gegevens kunnen worden opgeslaan, kan een speler worden geladen
  //(en is zijn score en level dus niet 0).
  Player(String name, int score, int level){
    this.name = name;
    this.score = this.score;
    this.level = this.level;
  }*/
  
  public String getName(){
    return name;
  }
  
  int getScore(){
    return score;
  }
  
  int getLevel(){
    return level;
  }
}