/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2;

public class Atv2 {

    public static void main(String[] args) {
        int cont=1, r=0, num=5;
        System.out.println("Tabuada do n°: "+num);
        do {
            r = num *cont;
            System.out.println(num+"X"+cont+"="+r);
            cont = cont + 1;
        }
        
        while (cont<=9);
        System.exit(0);
    }
}
