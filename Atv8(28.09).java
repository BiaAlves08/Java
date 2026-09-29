// Array bidimensional: Matriz - Excluir dados
package com.mycompany.atv8;

import javax.swing.JOptionPane;

public class Atv8 {

    public static void main(String[] args) {
        int v[] = new int [2];
        int n;
        String st= "Digite o número para excluir: ";
        st = JOptionPane.showInputDialog(null, st);
        n = Integer.parseInt(st);
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                if (v[i]== n) {
                    st = "Valor encontrado";
                    JOptionPane.showMessageDialog(null, st);
                }
                
                else {
                    st = "Valor não encontrado";
                    JOptionPane.showMessageDialog(null, st);
                }
            }
            
            System.exit(0);
        }
    }
}
