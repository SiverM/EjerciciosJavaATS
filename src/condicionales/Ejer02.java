/*
Pedir dos numeros y decir cual es el mayor o si son iguales
 */
package condicionales;
import javax.swing.JOptionPane;

public class Ejer02 {
    static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        if(num1==num2){
            JOptionPane.showMessageDialog(null, "Los numeros son iguales.");
        }else if(num1>num2){
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es el mayor.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+num2+" es el mayor.");
        }
    }
}
