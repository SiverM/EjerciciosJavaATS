/*
Hacer un programa que simule un cajero automático con un saldo inicial de 1000
Dólares, con el siguiente menú de opciones.
1. Ongresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir.
 */
package condicionales;

import javax.swing.*;
import java.lang.runtime.SwitchBootstraps;

public class Ejer13 {
    static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UNA OPCION:\n1. Ingresar dinero: \n2. Retirar dinero: \n3. Salir"));
        int saldo = 1000, valor;
        switch (op) {
            case 1:
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto dinero va ingresar a su cuenta: "));
                saldo += valor;
                JOptionPane.showMessageDialog(null, "Usted cuente con un saldo de: " + saldo);
                break;
            case 2:
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuanto dinero va retirar de su cuenta: "));
                if (valor <= saldo) {
                    saldo -= valor;
                    JOptionPane.showMessageDialog(null, "Usted cuente con un saldo de: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "no cuenta con saldo suficiente para retirar ese monto.");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por su preferencia.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opción ingresada no es valida.");
                break;
        }
    }
}
