
package estructuras;

import java.util.Scanner;

public class codigo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, i, poten=1;
        
        System.out.println("\tREALIZAR LA PERMUTACION DE NUMERO");
        System.out.print("Digite un numero: ");
        num = teclado.nextInt();
        
        for(i=1; i<=num; i++){
            poten *=i;
        }
        
        System.out.println("La potencia del numero "+num+" es: "+poten);
    }
}
