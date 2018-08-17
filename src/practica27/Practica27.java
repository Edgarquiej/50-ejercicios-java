//aregglos
package practica27;

//matrices de varias dimenciones
public class Practica27 {

    public static void main(String[] args) {
        // TODO code application logic here
        double acumulado;
        double saldo[][]= new double[6][5];
        double interes=0.10;
        for(int i=0;i<6;i++){
            saldo[i][0]=1000;
            acumulado=1000;
            for(int j=0; j<5;j++){
                acumulado=acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
            }
            interes=interes+0.01;
        }
        for(int i=0;i<6;i++){
            System.out.println();
            for(int j=0; j<5;j++){
                System.out.printf("%1.2f",saldo[i][j]);
                System.out.print(" ");
            }
        }
    }
    
}
