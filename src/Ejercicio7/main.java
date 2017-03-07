
package Ejercicio7;


public class main {
    public static void main(String[] args){
        organizar a = new organizar();
        for(int i = 0; i<=144; i++){
            a.Recoger();
            if((a.PosicionA() == 12)&&(a.PosicionC() == 12)){
                a.Recoger();
            }
            else{
                a.Muevete();
                if(a.PosicionA() == 11){
                    a.Recoger();
                    a.GiroDerecho();
                    a.Muevete();
                    a.Recoger();
                    a.GiroDerecho();
                    a.Muevete();
                }
                if(a.PosicionA() == 0){
                    a.Recoger();
                    a.GiroIzquierda();
                    a.Muevete();
                    a.Recoger();
                    a.GiroIzquierda();
                    a.Muevete();
                }
            }    
                if((a.PosicionA()==4)&&((a.PosicionC()==4)||(a.PosicionC()==10))){
                    a.Dejar();
                }
                if((a.PosicionA()==5)&&((a.PosicionC()==5)||(a.PosicionC()==9))){
                    a.Dejar();
                }
                if((a.PosicionA()==6)&&((a.PosicionC()>=4)||(a.PosicionC()<=10))){
                    a.Dejar();
                }
            }
}
}
