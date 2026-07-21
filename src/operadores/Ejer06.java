/*
Hacer un programa que calcule el cuadrado de una suma:
(a+b)^2=a^2+b^2+2ab
 */
package operadores;
import java.util.Scanner;
public class Ejer06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,resultado;
        System.out.println("Digite el valor del coeficiente a: ");
        a = sc.nextFloat();
        System.out.println("Digite el valor del coeficiente b: ");
        b = sc.nextFloat();
        resultado = Math.pow(a,2)+Math.pow(b,2)+2*a*b;
        System.out.println("(a+b)^2="+resultado);
    }
}
