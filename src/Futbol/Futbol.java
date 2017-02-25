package Futbol;
import becker.robots.*;
public class Futbol {
   public City chapeco;
   public Robot Messi;
   public Thing balon;  
   public Futbol(){
       this.chapeco = new City(10,10);
       this.Messi = new Robot(chapeco,3,8,Direction.WEST);
       this.balon = new Thing(chapeco,3,7);
       for(int i=0;i<5;i++){
          if(i==2){}else{
                 Wall muro = new Wall(chapeco, i, 0, Direction.WEST);
          }       
       }   
       for(int i=0;i<5;i++){
         if(i==2){}else{
                 Wall muro = new Wall(chapeco, i, 8, Direction.EAST);
         }
       }   
    }
   
   void finta(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,3,6);  
   }
   void finta2(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,2,6);  
   }
   void finta3(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,2,5);  
   }
   void finta4(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,2,4);  
   }
   void finta5(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,1,4);  
   }
    void finta6(){
       Messi.pickThing();
       this.balon = new Thing(chapeco,1,3);  
   }
    void finta7(){
        Messi.pickThing();
       this.balon = new Thing(chapeco,1,2);  
    }
     void finta8(){
        Messi.pickThing();
       this.balon = new Thing(chapeco,2,2);  
    }
      void finta9(){
        Messi.pickThing();
       this.balon = new Thing(chapeco,2,1);  
    }
      void finta10(){
        Messi.pickThing();
       this.balon = new Thing(chapeco,2,0);  
    }
      void gol(){
         Messi.pickThing(); 
      }
   
      
   void advance(){
       this.Messi.move();
   }
   
   void advanceLeft(){
        this.Messi.turnLeft();
   }
 
    void advanceRigth() {
              
       this.Messi.turnLeft();
       this.Messi.turnLeft();
       this.Messi.turnLeft();
     
    }
    void regate(){
        Messi.pickThing();
    }
}