/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas_java;

/**
 *
 * @author Carlos
 */
public class Pruebas_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Esta es una prueba en Java");
        System.out.println("Los números del 1 al 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        int myInt = 5;
        String asterisk = "*";
        
        for (int i = 1; i <= myInt; i++) {
            System.out.println(asterisk);
            if (i>1) {
                System.out.println(asterisk + asterisk);
            }
        }
    }
    
}
