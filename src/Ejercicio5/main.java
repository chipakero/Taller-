package Ejercicio5;
public class main {
    public static void main(String[] args){
        Laberinto curse = new Laberinto();
        for(int i = 0;i<20;i++){
            
            if(i==1){
                curse.Derecha();
            }if(i==2){
                curse.Izquierda();
            }if(i==4){
                    curse.Izquierda();
            }if(i==5){
                curse.Derecha();
            }if(i==6){
                curse.Izquierda();
                curse.Izquierda();
                curse.Recoger();
            }if(i==7){
                 curse.Izquierda();
            }if(i==8){
                curse.Derecha();
            }if(i==9){
                curse.Derecha();
            }if(i==11){
                curse.Derecha();
            }if(i==12){
                curse.Izquierda();
            }if(i==13){
                curse.Izquierda();
                curse.Izquierda();
                curse.Recoger();
            }if(i==14){
                curse.Derecha();
            }if(i==15){
                curse.Derecha();
            }if(i==16){
                curse.Izquierda();
            }if(i==17){
                curse.Derecha();
            }if(i==18){
                curse.Izquierda();
                curse.Recoger();
            }
            curse.Avanzar();
        }
        
    }
}
