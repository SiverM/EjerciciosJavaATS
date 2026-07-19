/*;
 *Declara las siguientes variables:
 *añoActual
 *añoNacimiento
 *Calcula:
 *Edad
 *Edad dentro de 10 años
 *Edad hace 5 años
 **/
public class Ejer02 {
        
    public static void main(String[] args) {
        int anio_act=2026;
        int anio_nac=1985;
        int edad=anio_act-anio_nac;
        int edad_10=edad+10;
        int edad_5=edad-5;
        System.out.println("Año actual: "+anio_act);
        System.out.println("Año de nacimiento: "+anio_nac);
        System.out.println("Edad: "+edad);
        System.out.println("Dentro de 10 años tendrá: "+edad_10+" años");
        System.out.println("Hace 5 años tenía: "+edad_5+" años");
        System.out.println(System.getProperty("java.version"));
    }
}




