/*
Pedir un número entre 0 y 99999 y decidir cuántas cifras tiene
 */
package condicionales;
import javax.swing.JOptionPane;
public class Ejer08 {
    static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        if (numero>0 && numero<100000) {
            int contador=String.valueOf(numero).length();
            JOptionPane.showMessageDialog(null,"Cifras: "+contador);
        }else{
            JOptionPane.showMessageDialog(null,"El número ingresado no se encuentra entre 0 y 99999.");
        }
    }
}
