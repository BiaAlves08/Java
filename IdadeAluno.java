/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadealuno;

import javax.swing.JOptionPane;


public class IdadeAluno {
   
    public static void main(String[] args) {
        int idade;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite a idade do aluno " + i + " de 20:"));

            soma += idade;

            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        double media = soma / 20.0;

        String resultado = "Menor idade lida: " + menorIdade + "\n" +
                "Maior idade lida: " + maiorIdade + "\n" +
                "Média das idades: " + media;

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
   
