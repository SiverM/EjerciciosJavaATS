/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
Suponiendo que todos los meses son de 30 días
 */
package condicionales;
import javax.swing.JOptionPane;

public class Ejer09 {
    static void main(String[] args) {
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el día:"));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
        int ano=Integer.parseInt(JOptionPane.showInputDialog("Digite el año:"));
        if (dia>=1 && dia<=30){
            if (mes>=1 && mes<=12){
                if (ano != 0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta.");
                }else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, el año es incorrecto.");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, el mes es incorrecto.");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, el día es incorrecto.");
        }
    }
}
