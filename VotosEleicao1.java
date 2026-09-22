
package com.mycompany.votoseleicao1;
        
import javax.swing.JOptionPane;
        
public class VotosEleicao1 {

    public static void main(String[] args) {
        String cod = "Digite o numero do candidato escolhido:\n";
        int candidato1=0;
        int candidato2=0;
        int candidato3=0;
        int candidato4=0;
        int votosNulos=0;
        int votosBrancos=0;
        int codigo;
        
         do {
            String entrada = JOptionPane.showInputDialog(
                    "Digite o codigo do candidato (1 a 4)\n" +
                    "5 = voto em branco\n" +
                    "outro numero = voto nulo\n" +
                    "0 = encerrar votacao");
        
             codigo = Integer.parseInt(entrada);
 
            switch (codigo) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosBrancos++;
                    break;
                case 0:
                    break;
                default:
                    votosNulos++;
                    break;
            }
        } while (codigo != 0);
 
        String resultado = "Resultado da apuracao dos votos:\n\n" +
                "Candidato 1: " + candidato1 + " votos\n" +
                "Candidato 2: " + candidato2 + " votos\n" +
                "Candidato 3: " + candidato3 + " votos\n" +
                "Candidato 4: " + candidato4 + " votos\n" +
                "Votos em branco: " + votosBrancos + "\n" +
                "Votos nulos: " + votosNulos;
 
        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
 
