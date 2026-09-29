// Array unidimensional: Vetor - Buscar dados
package com.mycompany.atv3;

import javax.swing.JOptionPane;

public class Atv3 {

    public static void main(String[] args) {
        int v[] = new int [2];
        int n;
        String st = "Digite o número para busca:";
        st = JOptionPane.showInputDialog(null, st);
        n = Integer.parseInt(st);
        for (int i=0; i<2; i++) {
            if (v[i]==n) {
                st = "Valor encontrado";
                JOptionPane.showMessageDialog(null, st);
            }
            
            else {
                st = "Valor não encontrado";
                JOptionPane.showMessageDialog(null, st);
            }
            
            System.exit(0);
        }
    }
}
