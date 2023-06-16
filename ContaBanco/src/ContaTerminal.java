import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        // Solicitando Dados do Cliente

        System.out.println("Por favor digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo saída no terminal

        System.out.println("Olá " + nomeCliente.concat(" ").concat(sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");
        
    }
}
