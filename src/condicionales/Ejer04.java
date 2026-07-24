/*
En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
Cuál será la cantidad que pagará una persona por su compra?
 */
package condicionales;

import javax.swing.JOptionPane;

public class Ejer04 {
    static void main(String[] args) {
        double compra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio a pagar: "));
        if (compra > 300) {
            JOptionPane.showMessageDialog(null, "El precio a pagar sera de: " + (compra - (compra * 0.2))+" $");
        }else{
            JOptionPane.showMessageDialog(null,"Su compra no supera los $300, por tanto no puede tener un descuento.");
        }
    }
}
