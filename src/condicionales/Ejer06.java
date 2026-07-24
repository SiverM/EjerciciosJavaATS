/*
Hacer un programa que diga si un numero es par o impar.
 */
package condicionales;
import javax.swing.JOptionPane;
public class Ejer06 {
    static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas: "));
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"El número es par.");
        }else{
            JOptionPane.showMessageDialog(null,"El número es impar.");
        }
    }
}
