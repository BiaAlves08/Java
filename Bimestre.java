package bimestre;

import javax.swing.JOptionPane;

public class Bimestre {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º bimestre:"));
            soma = soma + notas[i];
        }

        double media = soma / 4;
        String resultado;

        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: " + resultado);
         System.exit(0);
    }
}