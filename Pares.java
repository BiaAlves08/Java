
package pares; 

import javax.swing.JOptionPane;

public class Pares {
    public static void main(String[] args) {
        int[] valores = new int[10];
        String pares = "";

        for (int i = 0; i < 10; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor:"));
            if (valores[i] % 2 == 0) {
                pares = pares + valores[i] + " ";
            }
        }

        if (pares.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum valor par foi digitado.");
        } else {
            JOptionPane.showMessageDialog(null, "Valores pares: " + pares);
        }
    }
}