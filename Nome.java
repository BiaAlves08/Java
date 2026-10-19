
package nome;

import javax.swing.JOptionPane;

public class Nome {

    public static void main(String[] args) {
        String st;

        st = JOptionPane.showInputDialog(null, "Quantas partes tem seu nome completo?");
        int partes = Integer.parseInt(st);

        String v[] = new String[partes];

        for (int i = 0; i < partes; i++) {
            v[i] = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + " nome/sobrenome:");
        }

        String iniciais = "";

        for (int i = 0; i < partes; i++) {
            iniciais = iniciais + v[i].charAt(0) + ". ";
        }

        JOptionPane.showMessageDialog(null, "Iniciais: " + iniciais);
        System.exit(0);
    }
}