import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num2 - num1;
        for(int i = 0; i < contagem; i++ ){
            System.out.println("Imprimindo o numero " + (i+1));
        }
    }
}