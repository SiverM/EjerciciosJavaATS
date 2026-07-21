/*
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que posee uis y Guillermo juntos. Hacer un programa
que calcule e imprima la cantidad de dinero que tienem entre los tres.
 */
package operadores;


import java.util.Scanner;

public class Ejer03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float NG,NL,NJ,total;
        System.out.print("Ingrese la cantidad de dolaresque posee Guillermo: ");
        NG = sc.nextFloat();
        NL=NG/2;
        NJ=(NG+NL)/2;
        total=NG+NL+NJ;
        System.out.println("La cantidad de dolares que poseen los tres es de: "+total+" dolares.");
    }
}
