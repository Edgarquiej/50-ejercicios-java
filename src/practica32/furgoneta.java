//herencias
package practica32;

public class furgoneta extends coche {
    private int capacidae;
    private int placae;
    
    public furgoneta(int placas, int capacidad){
        super(); //llamar al constructor
        this.placae=placas;
        this.capacidae=capacidad;
    }
    public String datofurgoneta(){
        return " La capacidad de carga es "+capacidae+" y la placas son "+ placae;
    }
}
