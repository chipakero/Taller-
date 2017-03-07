package Ejercicio8;
import becker.robots.*;
class limpiar {
   City TERRENO = new City(11,11);
      Robot jugador1 = new Robot(TERRENO, 10, 5, Direction.NORTH,11);
      int x=0,
              y=0;
      Thing balon0 = new Thing(TERRENO, 2, 5);Thing balon1 = new Thing(TERRENO, 5,2);
      Thing balon2 = new Thing(TERRENO, 8, 5);Thing balon3 = new Thing(TERRENO, 5, 8);
      
      void paredes(){         
          int f=1;    
          int n=1;
          for(int j=0;j<2;j++){
          for(int i=0;i<2;i++){
          int r=4;
      Wall b0 = new Wall(TERRENO, 0+n, r, Direction.EAST);Wall b2 = new Wall(TERRENO, 1+n, r, Direction.EAST);
      Wall b4 = new Wall(TERRENO, 2+n, r, Direction.EAST);Wall b6 = new Wall(TERRENO, 3+n, r, Direction.EAST);
          r++;
      Wall b1 = new Wall(TERRENO, 0+n, r+1, Direction.WEST);Wall b3 = new Wall(TERRENO, 1+n, r+1, Direction.WEST);
      Wall b5 = new Wall(TERRENO, 2+n, r+1, Direction.WEST);Wall b7 = new Wall(TERRENO, 3+n, r+1, Direction.WEST);        
          }
          n=n+5;

          for(int i=0;i<2;i++){
          int l=4;
     Wall b1 = new Wall(TERRENO,l+1 ,0+f , Direction.SOUTH);Wall b3 = new Wall(TERRENO, l+1 ,1+f , Direction.SOUTH);
      Wall b5 = new Wall(TERRENO,l+1 ,2+f , Direction.SOUTH);Wall b7 = new Wall(TERRENO, l+1 , 3+f, Direction.SOUTH);        
          l++;
           Wall b0 = new Wall(TERRENO, l,0+f , Direction.NORTH);Wall b2 = new Wall(TERRENO, l,1+f , Direction.NORTH);
      Wall b4 = new Wall(TERRENO, l,2+f , Direction.NORTH);Wall b6 = new Wall(TERRENO, l, 3+f , Direction.NORTH);    
          }
            f = f+5;
          }
      }
      
      void avanza1(){
       jugador1.move();jugador1.move();
      jugador1.pickThing();
      for(int e=0;e<6;e++){
      jugador1.move();
      }
      jugador1.pickThing();
      }
          void avanza(){
      jugador1.move();jugador1.move();
      for(int e=0;e<2;e++){
      jugador1.turnLeft();
      for(int i=0;i<5;i++){
      jugador1.move();
      }
      }
      jugador1.turnLeft();
      }
}