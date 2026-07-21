package variables;
public class Estudiante {

    // ===========================
    // Variables de instancia
    // Cada objeto tendrá su propio nombre y edad.
    // ===========================
    String nombre;
    int edad;

    // ===========================
    // Variable estática
    // Es compartida por todos los objetos.
    // ===========================
    static String universidad = "UMSA";

    // Metodo para mostrar los datos
    public void mostrarDatos() {

        // Variable local
        String mensaje = "Información del estudiante";

        System.out.println(mensaje);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Universidad: " + universidad);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        // Primer objeto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Carlos";
        estudiante1.edad = 20;

        // Segundo objeto
        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "María";
        estudiante2.edad = 22;

        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
    }

}