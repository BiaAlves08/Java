
package com.mycompany.etecjava;

public class EtecJava {

    public static void main(String[] args) {
        int cont=1, r=0, num=5;
        System.out.println("tabuada do n°: "+num);
        while (cont <=10) {
            r=num*cont;
            System.out.println(num+"X"+cont+"="+r);
            cont = cont+1;
        }
        System.exit(0);
    }
}
