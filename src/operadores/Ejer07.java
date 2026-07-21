/*
Construir un programa que, dado un número total de horas, devuelve el número de semanas,
días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar
5 semanas, 6 días y 16 horas.
 */
package operadores;
import java.util.Scanner;
public class Ejer07 {
    static void main(String[] args) {
        double total_horas,semanas,dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite total horas a calcular: ");
        total_horas=leer.nextDouble();
        horas=total_horas;
        semanas=Math.floor(horas/168);
        horas-=(semanas*168);
        dias=Math.floor(horas/24);
        horas-=(dias*24);
        System.out.println((int)total_horas+" equivalen a: "+(int)semanas+" semanas, "+(int)dias+" dias, "+(int)horas+" horas");
    }
}
