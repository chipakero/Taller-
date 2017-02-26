
package Ejercicio4;
import becker.robots.*;
public class Histograma {
    public Robot chipa;
    public City sfe;
    public Thing histo;
    public Histograma(){
        this.sfe = new City(10,10);
        this.chipa = new Robot(sfe,1,0, Direction.SOUTH); 
            
        this.histo = new Thing (this.sfe, 2, 0); 
        this.histo = new Thing (this.sfe, 3, 0); 
        this.histo = new Thing (this.sfe, 4, 0); 
        this.histo = new Thing (this.sfe, 5, 0); 
        this.histo = new Thing (this.sfe, 6, 0); 
 
    }
    public void Impresion(){
        int a, b, c, d ,e;
        a = 7;
        b = 9;
        c = 10;
        d = 1;
        e = 6;   
        this.chipa.move();
        chipa.pickThing();
        
       
        chipa.turnLeft();     
        for(int i = 0; i<a;i++){
            this.histo = new Thing (this.sfe, 2, i); 
            this.chipa.move();
        }
        chipa.turnLeft();  
        chipa.turnLeft();  
        for(int i = a;i>0;i--){ 
            this.chipa.move();
        }
        chipa.turnLeft();  
        this.chipa.move();
        chipa.turnLeft();
        chipa.pickThing();
        
       
        for(int i = 0; i<b;i++){
            this.histo = new Thing (this.sfe, 3, i); 
            this.chipa.move();
        }
        chipa.turnLeft();  
        chipa.turnLeft();  
        for(int i = b;i>0;i--){ 
            this.chipa.move();
        }
        chipa.turnLeft();  
        this.chipa.move();
        chipa.turnLeft();
        chipa.pickThing();
        
        for(int i = 0; i<c;i++){
            this.histo = new Thing (this.sfe, 4, i); 
            this.chipa.move();
        }
        chipa.turnLeft();  
        chipa.turnLeft();  
        for(int i = c;i>0;i--){ 
            this.chipa.move();
        }
        chipa.turnLeft();  
        this.chipa.move();
        chipa.turnLeft();
        chipa.pickThing();
   
        for(int i = 0; i<d;i++){
            this.histo = new Thing (this.sfe, 5, i); 
            this.chipa.move();
        }
        chipa.turnLeft();  
        chipa.turnLeft();  
        for(int i = d;i>0;i--){ 
            this.chipa.move();
        }
        chipa.turnLeft();  
        this.chipa.move();
        chipa.turnLeft();
        chipa.pickThing();
        
        for(int i = 0; i<e;i++){
            this.histo = new Thing (this.sfe, 6, i); 
            this.chipa.move();
        }
        chipa.turnLeft();  
        chipa.turnLeft();  
        for(int i = e;i>0;i--){ 
            this.chipa.move();
        }
        chipa.turnLeft();  
        this.chipa.move();
       
    }
}
