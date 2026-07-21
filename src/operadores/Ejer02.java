/*
Hacer un programa que calcule e imprima el salario
semanal de un empleado a partir de sus horas semanales
trabajadas y de su salario por hora.
 */
package operadores;
import java.util.Scanner;
public class Ejer02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario_semana, hora, salario_hora;
        System.out.print("Ingrese el valor de salario por hora: ");
        salario_hora = sc.nextFloat();
        System.out.print("Ingrese el valor de horas trabajadas en la semana: ");
        hora = sc.nextFloat();
        salario_semana = salario_hora * hora;
        System.out.print("Salario por semana: " + salario_semana);
    }
}
