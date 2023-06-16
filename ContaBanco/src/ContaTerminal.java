import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        // Solicitando Dados do Cliente
        System.out.println("Por favor digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Por favor digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        
        
    }
}
