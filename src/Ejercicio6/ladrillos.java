
package Ejercicio6;
import becker.robots.*;

public class ladrillos {
    public City cuartos;
    public Wall pared;
    public Thing ladrillo;
    public Robot robot;
    
    public ladrillos(){
        this.cuartos = new City(15,15);
        for(int i=9; i>4; i--){
            this.pared = new Wall (cuartos, i, 2, Direction.WEST); 
        }
        
        for(int j=2; j<7; j++){
            this.pared = new Wall (cuartos, 5, j, Direction.NORTH); 
        }
        
        for(int i=5; i<10; i++){
            this.pared = new Wall (cuartos, i, 6, Direction.EAST); 
        }
        
        for(int j=3; j<7; j++){
            this.pared = new Wall (cuartos, 9, j, Direction.SOUTH); 
        }
        
        for(int i=6; i>1; i--){
            this.pared = new Wall (cuartos, i, 8, Direction.WEST); 
        }
        
        for(int j=8; j<13; j++){
            this.pared = new Wall (cuartos, 2, j, Direction.NORTH); 
        }
        
        for(int i=2; i<7; i++){
            this.pared = new Wall (cuartos, i, 12, Direction.EAST); 
        }
        
        for(int j=9; j<13; j++){
            this.pared = new Wall (cuartos, 6, j, Direction.SOUTH); 
        }
        
        this.ladrillo = new Thing(cuartos, 9, 3);
        this.ladrillo = new Thing(cuartos, 8, 2);
        this.ladrillo = new Thing(cuartos, 6, 2);
        this.ladrillo = new Thing(cuartos, 5, 3);
        this.ladrillo = new Thing(cuartos, 9, 5);
        this.ladrillo = new Thing(cuartos, 8, 6);
        this.ladrillo = new Thing(cuartos, 5, 5);
        this.ladrillo = new Thing(cuartos, 6, 6);
                
        this.robot = new Robot(cuartos, 10, 2, Direction.NORTH);
    }    
        
    public void avanzar(){
            this.robot.move();
    }
    public void girarIzquierda(){
            this.robot.turnLeft();
    }
    public void girarDerecha(){
        for (int i=0; i<3; i=i+1){
            this.robot.turnLeft();
        }
    } 
    public void recoger(){
        this.robot.pickThing();
    }
    public void colocar(){
        this.robot.putThing();
    }

}






