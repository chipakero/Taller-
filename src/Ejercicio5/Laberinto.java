
package Ejercicio5;
import becker.robots.*;
public class Laberinto {
    public Robot Wall_e;
    public City Tierra;
    public Thing Basura;
    
    public Laberinto(){
        this.Tierra = new City(15,15);
        this.Wall_e = new Robot(Tierra, 1,1,Direction.NORTH);
         Wall muro = new Wall(Tierra, 0, 0, Direction.WEST);
    }
    
}
