package Ejercicio3;
import becker.robots.*;
public class Ejercicio3 {
    public Robot h;
    public Robot e;
    public Robot l1;
    public Robot l2;
    public Robot o;
    public City bta;
    public Thing hello;
    
    public Ejercicio3(){
        this.bta = new City(10,20);
        //Escritura del HELLO  
    this.h = new Robot(bta, 5, 0, Direction.NORTH);
    this.e = new Robot(bta, 4, 7, Direction.WEST);
    this.l1 = new Robot(bta, 4, 11, Direction.WEST);
    this.l2 = new Robot(bta, 4, 15, Direction.WEST);
    this.o = new Robot(bta, 5, 18, Direction.NORTH);
    }
    //Escritura H
     public void H(){
         for(int i =4; i>-1; i--){
         this.h.move();
         this.hello = new Thing (this.bta, i, 0); 
         }
          h.turnLeft(); 
          h.turnLeft(); 
          this.h.move();
          this.h.move();
          h.turnLeft();
          for(int i =1; i<3; i++){
                this.h.move();
         this.hello = new Thing (this.bta, 2, i);
         }
           h.turnLeft();
           this.h.move();
          this.h.move();
          h.turnLeft(); 
          h.turnLeft(); 
            for(int i = 0;i<5;i++){
             this.h.move();
             this.hello = new Thing (this.bta, i, 2);
         }
     } 
      //Escritura E
     public void E(){      
         for(int i =6;i>3;i--){
             this.e.move();
             this.hello = new Thing (this.bta, 4, i);
         }
             e.turnLeft();
             e.turnLeft();
             e.turnLeft();
      for(int i = 4;i>-1;i--){        
             this.hello = new Thing (this.bta, i, 4);
             this.e.move();
      }
     e.turnLeft();
     e.turnLeft();
     this.e.move();
     e.turnLeft();
     for(int i=4;i<7;i++){
         if(i==6){
             e.turnLeft();
             e.turnLeft();
             e.turnLeft();
         }else{
         this.e.move();
         this.hello = new Thing (this.bta, 0, (i+1));
         }
 
     }
     this.e.move();
         this.e.move();
          e.turnLeft();
          e.turnLeft();
          e.turnLeft();
        for(int i = 6;i>3;i--){
           this.e.move();
           this.hello = new Thing (this.bta,2, i );
        }
         
     }
 //Escritura L1
     public void L1(){
    for(int i = 10; i >7;i--){
        this.l1.move();
        this.hello = new Thing (this.bta,4, i );
    }
      l1.turnLeft();
          l1.turnLeft();
          l1.turnLeft();
       for(int i = 3; i >-1;i--){
        this.l1.move();
        this.hello = new Thing (this.bta,i, 8 );
    } 
       this.l1.move();
     }
//Escritura L1
     public void L2(){
    for(int i = 14; i >11;i--){
        this.l2.move();
        this.hello = new Thing (this.bta,4, i );
    }
      l2.turnLeft();
      l2.turnLeft();
      l2.turnLeft();
       for(int i = 3; i >-1;i--){
        this.l2.move();
        this.hello = new Thing (this.bta,i, 12 );
    } 
       this.l2.move();
     }
    //Escritura O
     public void O(){
    for(int i = 4; i>-1;i--){
        this.o.move();
        this.hello = new Thing (this.bta,i, 18 );
    }
    o.turnLeft();
    for(int i = 18; i>16;i--){
        this.o.move();
        this.hello = new Thing (this.bta, 0, (i-1) );
    }
    o.turnLeft();
     for(int i = 0; i<4;i++){
        this.o.move();
        this.hello = new Thing (this.bta, (i+1), 16 );
    }
     o.turnLeft();
     this.o.move();
     this.hello = new Thing (this.bta, 4, 17 );
     this.o.move();
     this.o.move();
}
  
    
}
    

