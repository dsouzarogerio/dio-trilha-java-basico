import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da Conta:");
        int numeroConta = scan.nextInt();

        System.out.println("Digite sua Agência e dígito neste formato(XXXX-XX):");
        String agencia = scan.next();

        System.out.println("Digite seu o nome do Cliente:");
        String nomeCliente = scan.next().toUpperCase();

        System.out.println("Digite o saldo da conta:");
        double saldo = scan.nextDouble();

        System.out.println(String.format("Olá, %s obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo));
    }
}