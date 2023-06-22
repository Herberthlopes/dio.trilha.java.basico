import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
        System.out.println("Digite número inteiro");
		int C = leitor.nextInt();
		String nome;
		int N;

// TODO: complete os espaços em branco com sua solução para o problema

		for (int i = 0; i < C; i++) {
             System.out.println("Digite nome");
			nome = leitor.next();
            System.out.println("Digite número inteiro 1 - 25000");
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
	
}
