package Futbol;
import becker.robots.*;
public class Futbol {
   public City chapeco;
   public Robot Messi;
   public Thing balon;  
   public Futbol(){
       this.chapeco = new City(10,10);
       this.Messi = new Robot(chapeco,5,5,Direction.WEST);
       this.balon = new Thing(chapeco,5,4);
       for(int i=0;i<6;i++){
           if(i==2){
                 Wall muro = new Wall(chapeco, i, 0, Direction.WEST);
           }
       }   
       for(int i=0;i<6;i++){
           if(i==2){
                 Wall muro = new Wall(chapeco, i, 9, Direction.WEST);
           }
       }   
    }
   
   void jugar(){
       this.advance();
   }
   
   void advance(){
       this.Messi.move();
   }
   
   void advanceLeft(){
        this.Messi.turnLeft();
   }
 
    void advanceRigth() {
              for (int i = 0; i < 3; i=i+i) {
       this.Messi.turnLeft();
     }
    }
}