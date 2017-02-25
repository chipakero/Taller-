package Ejercicio2;
import becker.robots.*;
public class Ejercicio2 {
    public  Robot joe;
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
}

