//arreglo
package practica26;

//matriz con dos dimenciones
public class Practica26 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*int matriz[][]=new int[4][4];
        
        matriz[0][0]=2;
        matriz[0][1]=3;
        matriz[0][2]=25;
        matriz[0][3]=22;
        
        matriz[1][0]=52;
        matriz[1][1]=33;
        matriz[1][2]=25;
        matriz[1][3]=72;
        
        matriz[2][0]=2;
        matriz[2][1]=6;
        matriz[2][2]=35;
        matriz[2][3]=92;
        
        matriz[3][0]=16;
        matriz[3][1]=37;
        matriz[3][2]=87;
        matriz[3][3]=96;
         for(int i=0;i<4;i++){
            for(int q=0;q<4;q++){
                System.out.print(matriz[i][q]+" ");
            }
            System.out.println();
        }
        */
        int matriz[][]={
            {12,14,25,34},
            {24,56,44,34},
            {23,23,23,56},
            {55,87,69,79}            
        };
        for(int fila[]:matriz){
            for(int z:fila){
                System.out.print(z+" ");
            }
            System.out.println();
        }
        
    }
    
}
