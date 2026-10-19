package ordem;

import javax.swing.JOptionPane;

public class Ordem {

    public static void main(String[] args) {
         int[] original = new int[10];
        int[] ordenado = new int[10];

        for (int i = 0; i < 10; i++) {
            original[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor:"));
            ordenado[i] = original[i];
        }

        // ordena o vetor copiado (bubble sort)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }

        String saida = "";
        for (int i = 0; i < 10; i++) {
            saida = saida + ordenado[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Ordem crescente: " + saida);
    }
    
}
