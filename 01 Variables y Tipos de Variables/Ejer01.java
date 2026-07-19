/*
 * PRACTICA VARIABLES PRIMITIVAS
 * Crea un programa que almacene la siguiente información utilizando 
 * el tipo de dato más adecuado:
 * Nombre
 * Edad
 * Peso
 * ¿Es estudiange?
 * Inicial de apellido
 * Luego imprima toda la información
 **/
public class Ejer01 {

    public static void main(String[] args) {
        String nombre="Iver";		// String no es un tipo de variable primitivo
        int edad=40;
        float estatura=1.70f;
        boolean estudiante=false;
        char inic_ap='M';
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi edad es de "+edad+" años");
        System.out.println("Tengo una estatura de "+estatura+" mtrs.");
        System.out.println("¿Soy estudiante?: "+estudiante);
        System.out.println("La inician de mi apellido es: "+inic_ap);
    }
}
