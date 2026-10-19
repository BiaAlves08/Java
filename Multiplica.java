package multiplica;

       import javax.swing.JOptionPane;

public class Multiplica {
    public static void main(String[] args) {
        double[] a = new double[5];
        double[] b = new double[5];
        double[] c = new double[5];

        for (int i = 0; i < 5; i++) {
            a[i] = Double.parseDouble(JOptionPane.showInputDialog("Vetor A - digite o número " + (i + 1) + ":"));
        }

        for (int i = 0; i < 5; i++) {
            b[i] = Double.parseDouble(JOptionPane.showInputDialog("Vetor B - digite o número " + (i + 1) + ":"));
        }

        String saida = "";
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] * b[i];
            saida = saida + a[i] + " x " + b[i] + " = " + c[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, "Vetor C:\n" + saida);
    }
}
    
