package miprimerprograma;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class MiPrimerPrograma {

    public static void main(String[] args) {
        //Definimos un array de 3 filas x 5 columnas
        int array[][] = {{15, 20, 10, 30, 13}, 
                         {7, 16, 22, 25, 29}, 
                         {1, 2, 11,3, 4}, 
                         {17, 5, 6, 27, 26}};
        //Recorremos el array multidimensional
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.println();
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(j==2){
                    tmp = array[i][j];
                    array[i][j]=array[i][j+1];
                    array[i][j+1] = tmp;
                }
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println("");
        }
        
    }

}
