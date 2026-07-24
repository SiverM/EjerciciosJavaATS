/*
Pedir tres numeros y mostrarlos ordenados de mayor a menor
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer07 {
    static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tercer numero: "));
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    JOptionPane.showMessageDialog(null, num1 + " " + num2 + " " + num3);
                } else {
                    JOptionPane.showMessageDialog(null, num1 + " " + num3 + " " + num2);
                }
            } else {
                JOptionPane.showMessageDialog(null, num3 + " " + num1 + " " + num2);
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    JOptionPane.showMessageDialog(null, num2 + " " + num1 + " " + num3);
                } else {
                    JOptionPane.showMessageDialog(null, num2 + " " + num3 + " " + num1);
                }
            } else {
                JOptionPane.showMessageDialog(null, num3 + " " + num2 + " " + num1);
            }
        }
    }
}
