# Java
class Main {
  public static void main(String[] args) {
      
    	byte qtde = 10;
    	short numero_short;
    	int n;
    	long numero_long;
    	double valor;
    	float numero;
    	char letra = 'b';
    	String bairro;
    	boolean cadastro;
    	
    	
    	System.out.println(letra);
    	//System.out.println("Bianca")
  }
}


import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        System.out.println("Valor digitado: " + numero);
        //Abaixo fechando o objeto
        entrada.close()
    }
}


import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Aluno: ");
        String aluno = entrada.next();
        System.out.print("Nota1: ");
        float n1= entrada.nextFloat();
        System.out.println("Aluno: " + aluno + " " + "Nota: " + n1);
        entrada.close();
        
        if (n1<=5) {
            System.out.print("Reprovado");
        }
        
        else {
            System.out.print("Aprovado");
        }
    }
}


import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Aluno: ");
        String aluno = entrada.next();
        System.out.print("Nota1: ");
        float n1= entrada.nextFloat();
        System.out.print("Nota2: ");
        float n2= entrada.nextFloat();
        System.out.print("Nota3: ");
        float n3= entrada.nextFloat();
        
        System.out.println("Aluno: " + aluno + "\n" + "Nota 1: " + n1 + "\n" + "Nota 2: " + n2 + "\n" + "Nota 3: " + n3);
        entrada.close();
        
        float total = n1+n2+n3;
        System.out.println("O total sera de: " + total);
        
        float media = (n1+n2+n3)/3;
        System.out.println("A media do(a) " + aluno + " sera de: " + media);
    }
}
