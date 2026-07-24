/*
Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
 */
package condicionales;
import javax.swing.JOptionPane;
public class Ejer03 {
    static void main(String[] args) {
        char letra=JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula.");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula.");
        }
    }
}
