import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");

    }
}