/*
    PRACTICAR VARIABLES DE REFERENCIA Y TIPOS PRIMITIVOS
Imagina que registras un empleado.
Debes crear variables para:
Nombre
Cargo
Salario
Años de experiencia
¿Está contratado?
Código del empleado
Área
Después muestra SU ficha
 */
package variables;

public class Ejer03 {
    public static void main(String[] args) {
        // declarando y registrando datos;
        String nombre = "Juan Pérez";
        String cargo = "Desarrollador Java";
        String area = "Backend";
        String codigo = "A-105";
        int expe = 5;
        float salario = 8500.50f;
        boolean contratado = true;
        // mostrando ficha empleado
        System.out.println("======== EMPLEADO =========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Área: " + area);
        System.out.println("Codigo: " + codigo);
        System.out.println("Experiencia: " + expe + " años");
        System.out.println("Salario: " + salario + " bs");
        System.out.println("Contratado: " + contratado);
    }
}
