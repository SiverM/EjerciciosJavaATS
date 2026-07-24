/*
Determinar si es mayo o me.nor de edad, dada una edad
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer14 {
    static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        String resultado = (edad >= 18) ? "Es mayor de edad." : "Es menor de edad.";
        JOptionPane.showMessageDialog(null, resultado);
    }
}
