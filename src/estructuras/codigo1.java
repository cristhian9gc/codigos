
package estructuras;

import java.util.Scanner;

public class codigo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, x, suma, resta, mul, div;
        System.out.print("Digite un numero: ");
        num1 = teclado.nextInt();
        
        System.out.print("Digite otro numero: ");
        num2 = teclado.nextInt();
        
        do{
            System.out.println("\nElija una opcion ");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. salir");
            System.out.print("opc: ");
            x = teclado.nextInt();
            
            switch(x){
                case 1: System.out.println("\tSUMA");
                        suma = num1 + num2;
                        System.out.println("La suma es :"+suma);
                        break;
                case 2: System.out.println("\tRESTA");
                        resta = num1 - num2;
                        System.out.println("La suma es :"+resta);
                        break;
                case 3: System.out.println("\tMULTIPLICACION");
                        mul = num1 * num2;
                        System.out.println("La suma es :"+mul);
                        break;
                case 4: System.out.println("\tDIVISION");
                        div = num1 / num2;
                        System.out.println("La suma es :"+div);
                        break;
                case 5: 
                    break;
            }
        }while(x!=5);
    }
}
