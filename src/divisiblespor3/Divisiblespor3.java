/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblespor3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam120
 */
public class Divisiblespor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String cadena;
        InputStreamReader flujo;
        flujo = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        int n1, n2, au;
        System.out.println("Introduce el primer numero:");
        cadena=teclado.readLine();
        n1 = Integer.parseInt(cadena);
        System.out.println("Introduce el segundo numero:");
        cadena=teclado.readLine();
        n2 = Integer.parseInt(cadena);
        System.out.println("Numeros divisibles por 3 comprendidos entre " + n1 + " Y " + n2);
        System.out.println("Prueba");
        if(n1 > n2){
            au = n2;
            n2=n1;
            n1=au;
        }
        for (int i = n1+1; i < n2; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }
}
