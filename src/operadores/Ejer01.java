/*
Programa que calcule e imprima la suma de tres calificaciones
 */
package operadores;

import java.util.Scanner;

public class Ejer01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primera nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Introduce segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Introduce tercera nota: ");
        float nota3 = sc.nextFloat();
        float notafinal;
        notafinal=nota1+nota2+nota3;
        System.out.println("La nota es: "+notafinal);
    }
}
