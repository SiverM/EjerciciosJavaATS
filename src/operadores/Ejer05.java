/*
La calificación final de un estudiante de Informática se calcula con base
a las calificaciones de cuatro aspectos de su rendimiento académico:
participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final
con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e
imprima la calificación final obtenida por un estudiante.
 */
package operadores;
import java.util.Scanner;
public class Ejer05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float participacion, parcial1, parcial2, examen_f,total_nota;
        System.out.print("Digite sobre 100 puntos la participación: ");
        participacion = sc.nextFloat();
        participacion = participacion * 0.1f;
        System.out.print("Digite sobre 100 puntos la nota del primer parcial: ");
        parcial1 = sc.nextFloat();
        parcial1 = parcial1 * 0.25f;
        System.out.print("Digite sobre 100 puntos  la nota del segundo parcial: ");
        parcial2 = sc.nextFloat();
        parcial2 = parcial2 * 0.25f;
        System.out.print("Digite sobbre 100 puntos la nota del examen final: ");
        examen_f = sc.nextFloat();
        examen_f = examen_f * 0.4f;
        total_nota = participacion+parcial1+parcial2+examen_f;
        System.out.print("Valor total de notas: " + total_nota);
    }
}
