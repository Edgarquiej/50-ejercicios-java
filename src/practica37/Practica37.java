//interfaz grafica
package practica37;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] a = new Empleado[5];
        a[0]=new Empleado("Mario lopes",85000,1990,12,17);
        a[1]=new Empleado("Luisa ramos",95000,1995,06,02);
        a[2]=new Empleado("Maria Matinez",105000,2002,03,15);
        a[3]=new Empleado("Juan Garcia",15000,2008,02,15);
        a[4]=new Empleado("Ana Matinez",205000,2012,05,24);
        //jefatura jefaf=(jefatura)a[5];
        //jefaf.estableceincentivo(55000);
        //System.out.println(jefaf.tomardeciciones(" Dar mas dias de vacaciones a los empleados")); 
        //jefatura directorc=new jefatura("Pedro Lopez",30000,1995,02,26);
        //Comparable ejemplo=new Empleado("Elizabe",80132,2011,04,28);
        
        /*if(directorc instanceof Empleado){
          System.out.println("Es de tipo jefatura");  
        }  
        if(ejemplo instanceof Comparable){
          System.out.println("Implementa la interfaz comparable");  
        }  */  
        for(Empleado s: a){
           s.sueldos(5); 
        }
        
        Arrays.sort(a);
        
         for(Empleado e: a){
           System.out.println("El nombre del empleado "+e.nombrea()+ " la id "+e.ides()+ " Sueldo "+ e.sueldoa()+ " Fecha "+e.fechac());
        }
    }
    
}



class jefatura extends Empleado implements jefe{
     public jefatura(String nom, double sue, int agno, int mes, int dia){
     super(nom,sue,agno,mes,dia);
     }
     public String tomardeciciones(String deciciones){
         return "Un miembro de la direccion a tomado la decicion de "+deciciones;
     }
     public void estableceincentivo(double b){
         incentivo=b;
     }
     public double dsueldo(){
         double sueldof=super.sueldoa();
         return sueldof+incentivo;
     }
    private double incentivo;
}
class Empleado implements Comparable{
    public Empleado(String nomb, double suel, int agno, int mes, int dia){
        nombre=nomb;
        sueldo=suel;
        GregorianCalendar cale = new GregorianCalendar(agno, mes-1,dia);
        altacontrato=cale.getTime();
        ++ids;
        id=ids;
    }
    public String nombrea(){
     return nombre;
    }
    public int ides(){
     return id;
    }
    public double sueldoa(){
        return sueldo;
    }
    public Date fechac(){
        return altacontrato;
    }
    public void sueldos(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    public int compareTo(Object obj){
        Empleado oempleado =(Empleado)obj;
        if(this.sueldo<oempleado.sueldo){
            return -1;
        }
        if(this.sueldo>oempleado.sueldo){
           return 1; 
        }
        return 0;
    }
    
    private String nombre;
    private double sueldo;
    private Date altacontrato;
    private static int ids;
    private int id;
   
    
}