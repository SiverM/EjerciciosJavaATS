/*
Una compañia de venta de carros usados, paga a su personal de ventas un salario de
1000$ mensuales, mas una comisión de 150$ por cada carro vendido, más 5% del valor
de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora
los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de
un vendedor dado.
 */
package operadores;
import java.util.Scanner;
public class Ejer04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, cantidad, costo_carro, mensual, comision, valor_venta;
        mensual=1000;
        System.out.println("Digite cantidad de carros vendidos: ");
        cantidad=sc.nextFloat();
        System.out.println("Digite el costo de cada carro: ");
        costo_carro=sc.nextFloat();
        comision=cantidad*150;
        valor_venta=(costo_carro*0.05f)*cantidad;
        salario=mensual+comision+valor_venta;
        System.out.println("Salario mensual es de: " + salario);
    }
}
