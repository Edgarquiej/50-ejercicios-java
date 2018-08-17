
package practica28;

public class coche {
    private int  rueda;
    private int largo;
    private int ancho;
    private int peso;
    private String color;
    private boolean aciento;
    private boolean climatizador;
    private int pesot;
    
    public coche(){
        rueda=4;
        largo=25;
        ancho=45;
        peso=25;
    }
    
    public String ruedas(){
        return "Las ruedas son "+rueda+ " mide "+largo+ " con un ancho"+ancho+ " y un peso "+peso;
    }
    public void colore(String colors){
        //color="Amarillo";
        color=colors;
    }
    public String colores(){
       return "El color del carro es "+color; 
    }
    public void acientos(String asiento_cuero){
        if(asiento_cuero.equalsIgnoreCase("si")){
            this.aciento=true;
        }else{
            this.aciento=false;
        }
    }
    public String acientosv(){
        if(aciento==true){
            return "Tiene asientos de cuero ";
        }else{
            return "Tiene asientos de serie";
        }
    }
    public void climatizador(String climatizarq){
        if(climatizarq.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }
    public String climatizarv(){
        if(climatizador==true){
            return "Tiene climatizador el coche ";
        }else{
            return "No tiene climatizador el coche";
        }
    }
    public String pesototal(){
        int pesoc=500;
        pesot=peso+pesoc;
        if(climatizador==true){
            pesot=pesot+20;
        }
        if(aciento==true){
            pesot=pesot+50;
        }
        return "El peso total del coche es "+pesot;
    }
    public int precioc(){
        int preciof=10000;
        if(climatizador==true){
            preciof+=1500;
        }
        if(aciento==true){
            preciof+=2000;
        }
        return preciof;
    }


}
