
package miprimerprograma;

import java.util.Scanner;

public class Pago {
    public static void main (String[] args){
        //entrada
        int dinero = 3000000;
         System.out.println("Por favor digita tu salario: ");
        Scanner in = new Scanner(System.in);
        dinero = in.nextInt();
            
        //procedimiento
        double resultado ;//formula magiCA
        
        //salida 
        System.out.println("Tu sueldo es: " + dinero);
    }
}
