/*
Pedir una nota de 0 a 10 y mostrarla de forma:
Insuficiente, Suficiente, Bien, Notable y Sobresaliente
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer12 {
    static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota: "));
        switch (nota) {
            case 1, 2, 3:
                JOptionPane.showMessageDialog(null, "Insuficiente.");
                break;
            case 4, 5:
                JOptionPane.showMessageDialog(null, "Suficiente.");
                break;
            case 6, 7:
                JOptionPane.showMessageDialog(null, "Bien.");
                break;
            case 8, 9:
                JOptionPane.showMessageDialog(null, "Notable.");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Sobresaliente.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La nota ingresada no se encuentra entre 1 y 10.");
                break;
        }
    }
}
