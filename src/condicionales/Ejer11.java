/*
Programa que realice las cuatro operaciones matemáticas básicas de las matemáticas
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer11 {
    static void main(String[] args) {
        double resultado;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        char op = JOptionPane.showInputDialog("Digite la operación matemática (+ - * /): ").charAt(0);
        switch (op) {
            case '+':
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No puede existir división entre 0");
                } else {
                    resultado = (double)num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"No se ingreso una operación matemática valida.");
                break;
        }

    }
}
