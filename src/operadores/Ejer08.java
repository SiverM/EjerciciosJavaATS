/*
Construir un programa que calcule y muestre por pantalla las raíces de la ecuación
de segundo grado de coeficientes realies.
ax^2+bx+c=0
 */
package operadores;
import java.util.Scanner;
public class Ejer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del coeficiente a: ");
        double a = sc.nextInt();
        System.out.print("Ingrese el valor del coeficiente b: ");
        double b = sc.nextInt();
        System.out.print("Ingrese el valor del coeficiente c: ");
        double c = sc.nextInt();
        double x1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double x2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        System.out.println("x1="+x1);
        System.out.println("x2="+x2);
    }
}
