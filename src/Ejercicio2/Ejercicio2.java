package Ejercicio2;
import becker.robots.*;
public class Ejercicio2 {
    public  Robot joe;
    public  Robot afk;
    public  Robot troll;
    public  City unal;
    public  Thing num;   
    public Ejercicio2(){
        this.unal = new City(10,10);
for(int i=0;i<9;i++){
    this.num = new Thing (this.unal, 0, i);
}  
for(int i=0;i<9;i++){
    this.num = new Thing (this.unal, 4, i);
}
for(int i=1;i<5;i++){
    this.num = new Thing (this.unal, i, 0);
}        
for(int i=2;i<7;i++){
    this.num = new Thing (this.unal, 2, i);
}
for(int i=1;i<4;i++){
    this.num = new Thing (this.unal, i, 8);
}   
        this.num =new Thing(this.unal, 1,2);
        this.num =new Thing(this.unal, 1,3);
        this.num =new Thing(this.unal, 1,6);
        this.num =new Thing(this.unal, 3,2);
        this.num =new Thing(this.unal, 3,5);
        this.num =new Thing(this.unal, 3,6);
      
 this.joe = new Robot(unal,5,1, Direction.NORTH);
 this.afk = new Robot(unal,5,4, Direction.NORTH);
 this.troll = new Robot(unal,5,7, Direction.NORTH);
 

        for(int i=0;i<5;i++){
            Wall blockAve = new Wall(unal, i, 0, Direction.WEST);       
        }   
        for(int i=0; i<9;i++){
            Wall blockAve = new Wall(unal, 0, i, Direction.NORTH);
        }
        for(int i=0;i<5;i++){
             Wall blockAve = new Wall(unal, i, 3, Direction.WEST);
        }
        for(int i=0; i<5;i++){
            Wall blockAve = new Wall(unal, i, 5, Direction.EAST);
        }
        for(int i=0;i<5;i++){
             Wall blockAve = new Wall(unal, i, 8, Direction.EAST);
        }
        for(int i=0;i<9;i++){
            if(((i == 1) || (i == 4))||(i==7)){
            } else {
                Wall blockAve = new Wall(unal, 4, i, Direction.SOUTH);
            }
        }

    
           
    }
    public void advance(){
        this.joe.move();        
    }
    public void advanceLeft(){
        joe.turnLeft();      
    }

    void advanceRigth() {
      joe.turnLeft();
      joe.turnLeft();
      joe.turnLeft(); 
    }
    void recoger(){
      joe.pickThing();
    }
     public void advance2(){
        this.troll.move();        
    }
    public void advanceLeft2(){
        troll.turnLeft();      
    }

    void advanceRigth2() {
      troll.turnLeft();
      troll.turnLeft();
      troll.turnLeft(); 
    }
    void recoger2(){
      troll.pickThing();
    }
     public void advance3(){
        this.afk.move();        
    }
    public void advanceLeft3(){
        afk.turnLeft();      
    }

    void advanceRigth3() {
      afk.turnLeft();
      afk.turnLeft();
      afk.turnLeft(); 
    }
    void recoger3(){
      afk.pickThing();
    }
}

