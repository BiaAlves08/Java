/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.requisitos;

import javax.swing.JOptionPane;

public class Requisitos {

    public static void main(String[] args) {
        String continuar = "S";
        int contador = 0;
        
        while (continuar.equalsIgnoreCase("S")) {
            String sexo = JOptionPane.showInputDialog("Digite o sexo (F/M):");
            
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            
            String estadoCivil = JOptionPane.showInputDialog ( "Digite o estado civil: (S=Solteiro(a), C=Casado(a), D=Divorciado(a): ");
            
            if (sexo.equalsIgnoreCase("F") && idade < 21 && estadoCivil.equalsIgnoreCase("S")) {
                contador++;
            }
 
            continuar = JOptionPane.showInputDialog("Deseja continuar? (S/N)");
        }
 
        JOptionPane.showMessageDialog(null,
                "Total de pessoas do sexo feminino, solteiras e com menos de 21 anos: " + contador);
        System.exit(0);
        
    }
}
