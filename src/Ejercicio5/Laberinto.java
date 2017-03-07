
package Ejercicio5;
import becker.robots.*;
public class Laberinto {
    public Robot Wall_e;
    public City Tierra;
    public Thing Basura;
    
    public Laberinto(){
        this.Tierra = new City(12,15);
        this.Wall_e = new Robot(Tierra, 8,9,Direction.NORTH);
        
         for(int i=5;i<9;i++){
             Wall muro = new Wall(Tierra, 3, i, Direction.NORTH);
         }
         for(int i=6;i<10;i++){
             if(i==8){
             }else{
             Wall muro = new Wall(Tierra, 4, i, Direction.NORTH);
             }
         }
          for(int i=4;i<11;i++){
             if(i==5||i==6||i==7||i==9){
             }else{
             Wall muro = new Wall(Tierra, 5, i, Direction.NORTH);
             }
         }
          for(int i=3;i<10;i++){
             if(i%2==0){
             }else{
             Wall muro = new Wall(Tierra, 6, i, Direction.NORTH);
             }
         }
          for(int i=4;i<10;i++){
             if(i==5||i==7){
             }else{
             Wall muro = new Wall(Tierra, 7, i, Direction.NORTH);
             }
         }
        for(int i=3;i<11;i++){
             if(i==4||i==5||i==6||i==8||i==9){
             }else{
             Wall muro = new Wall(Tierra, 8, i, Direction.NORTH);
             }
         }
        for(int i=4;i<10;i++){
             if(i==6||i==7||i==8){
             }else{
             Wall muro = new Wall(Tierra, 9, i, Direction.NORTH);
             }
         }
        for(int i=6;i<8;i++){
             Wall muro = new Wall(Tierra, i, 3, Direction.WEST);
             }
        for(int i=5;i<9;i++){
             if(i==6||i==7){
             }else{
             Wall muro = new Wall(Tierra, i, 4, Direction.WEST);
             }
         }
          for(int i=3;i<8;i++){
             if(i==5){
             }else{
             Wall muro = new Wall(Tierra, i, 5, Direction.WEST);
             }
         }
          for(int i=4;i<9;i++){
             if(i==6){
             }else{
             Wall muro = new Wall(Tierra, i, 6, Direction.WEST);
             }
         }
          for(int i=5;i<9;i++){
             if(i==7){
             }else{
             Wall muro = new Wall(Tierra, i, 7, Direction.WEST);
             }
         }
          for(int i=4;i<8;i++){
             if(i==5||i==6){
             }else{
             Wall muro = new Wall(Tierra, i, 8, Direction.WEST);
             }
         }
          for(int i=3;i<9;i++){
             if(i==4||i==6){
             }else{
             Wall muro = new Wall(Tierra, i, 9, Direction.WEST);
             }
         }
          for(int i=4;i<9;i++){
             if(i==5||i==6||i==7){
             }else{
             Wall muro = new Wall(Tierra, i, 10, Direction.WEST);
             }
         }
            for(int i=5;i<8;i++){        
             Wall muro = new Wall(Tierra, i, 11, Direction.WEST);            
             }
            this.Basura = new Thing (this.Tierra, 4,9);
            this.Basura = new Thing (this.Tierra, 5,7);
            this.Basura = new Thing (this.Tierra, 7,6);
            
         }
      public void Avanzar(){
          this.Wall_e.move();  
         }
      public void Derecha(){
          this.Wall_e.turnLeft(); 
          this.Wall_e.turnLeft();
          this.Wall_e.turnLeft();
         }
      public void Izquierda(){
          this.Wall_e.turnLeft(); 
         }
      public void Recoger(){
          Wall_e.pickThing();
      }
}
