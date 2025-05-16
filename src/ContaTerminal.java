import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 237.48;

        System.out.println("Informe o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe sua agência: ");
        String agencia = scanner.next();

        System.out.println("Informe seu nome e sobrenome");
        String nomeCliente = scanner.next();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");
    }

}
