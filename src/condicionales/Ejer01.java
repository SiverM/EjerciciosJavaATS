/*
Hacer un programa que lea un numero entero y muestre si el
numero es multiplo de 10
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer01 {
    static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
        }
    }
}
