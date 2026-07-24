/*
Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
* Si trabaja 40 horas o menos se le paga $16 por hora.
* Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
package condicionales;
import javax.swing.JOptionPane;
public class Ejer05 {
    static void main(String[] args) {
        float salario,salario1;
        int horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas: "));
        if(horas<=40){
            salario=horas*16;
        }else{
            salario1=40*16;
            horas-=40;
            salario=salario1+(horas*20);
        }
        JOptionPane.showMessageDialog(null,"Salario: "+salario+ " $");
    }
}
