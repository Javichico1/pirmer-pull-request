/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomproject;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class Randomproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Este va a ser mi primer pull request");
        
        
        System.out.println("Dime una frase: ");
        String f1 = sc.nextLine();
        System.out.println("Dime otra frase: ");
        String f2 = sc.nextLine();
        
        int f11 = f2.length();
        int f22 = f2.length();
        
        boolean comparation1 = f11 == f22;
        boolean comparacion2 = f11 > f22;
        boolean comparation3 = f22 < f11;
        boolean comparation4 = f22 >= f11;
        
        System.out.println( "Tienen los mismos caracteres: " + comparation1);
        
        System.out.println("La primera frase tiene más caracteres que la segunda frase: " + comparacion2);
        
        System.out.println("La segunda frase tiene menos caracteres que la segunda frase: " + comparation3);
        
        System.out.println("la segunda frase tiene mas caracteres qe la segunda frase o los mismos: " + comparation4);
        
        System.out.println("añadiremos una nueva frase");
    }
    
}
