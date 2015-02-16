package com.alphabet.program;
import processing.core.*;

/**
*De klasse van het spelbord
*/
public class Board {
  
  //De globale variabelen
  //columns is het aantal kolommen van het bord, standaard 4
  //row is het aantal rijen van het bord, standaard 4
 byte columns;
 byte rows;
 int gridSizeX;
 int gridSizeY;
 int gridSizeZ;
 PApplet parent;
 
 
  /**
  *De constructor functie. Wanneer het bord wordt aangemaakt, krijgt het de globale variabelen binnen
  *Heeft als argumenten het aantal kolommen en rijen nodig
  */
 Board(byte columns, byte rows, int grootte, PApplet parent){
   this.columns = columns;
   this.rows = rows;
   this.gridSizeX = grootte;
   this.gridSizeY = grootte/10;
   this.gridSizeZ = grootte;
   this.parent = parent;
 }
 /**
 *Deze methode wordt gebruikt om het aantal kolommen te veranderen
 *Heeft als argumenten het aantal kolommen nodig
 */
 void setColumns(byte columns){
   this.columns = columns;
 }
 
 /**
 *Deze methode wordt gebruikt om het aantal rijen te veranderen
 *Heeft als argumenten het aantal rijen nodig
 */
 void setRows(byte rows){
   this.rows = rows;
 }
 
 /**
 *De methode die het bord tekent
 */
 void drawBoard(){
   //Begin te tekenen in ongeveer het midden (de bewerking bij de x-coordinaat) en op de juiste y-hoogte
   parent.translate(parent.width/2-(columns*gridSizeX)/2-gridSizeX/4,600,0);
   
   //Geneste for-loop om de matrix te tekenen dat het bord vormt
   for (int i = 1; i<=rows;i++){
     for(int j = 1; j<=columns;j++){
       parent.box(gridSizeX,gridSizeY,gridSizeZ);
       parent.translate(0,0,-gridSizeZ);
     }
     parent.translate(gridSizeX,0,gridSizeZ*4);
   }
 }
 
}