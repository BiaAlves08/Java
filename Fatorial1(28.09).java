package com.mycompany.fatorial1;

import javax.swing.JOptionPane;

public class Fatorial1 {

    public static void main(String[] args) {
        String st = JOptionPane.showInputDialog(null, "Digite o número para calcular o fatorial: ");

        int numero = Integer.parseInt(st);
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        // Exibe o resultado final
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);

        System.exit(0);
    }
}