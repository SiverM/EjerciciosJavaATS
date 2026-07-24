/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */
package condicionales;
import java.util.Scanner;
public class Ejer10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = entrada.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Introduce el año: ");
        int anio = entrada.nextInt();

        boolean fechaCorrecta = true;

        // Validar el año (por ejemplo, mayor que 0)
        if (anio <= 0) {
            fechaCorrecta = false;
        }

        // Validar el mes entre 1 y 12
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else {
            // Validar los días según el mes
            int diasMaximos = 0;

            if (mes == 2) {
                diasMaximos = 28; // Febrero sin bisiesto
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasMaximos = 30; // Abril, junio, septiembre, noviembre
            } else {
                diasMaximos = 31; // Enero, marzo, mayo, julio, agosto, octubre, diciembre
            }

            if (dia < 1 || dia > diasMaximos) {
                fechaCorrecta = false;
            }
        }

        // Mostrar resultado
        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        entrada.close();
    }
}

