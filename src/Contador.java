import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = lerInteiro(terminal);
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = lerInteiro(terminal);

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d\n", i);
        }
    }

    private static int lerInteiro(Scanner scanner) {
        do {
            try {
                int valorRetorno = scanner.nextInt();
                scanner.nextLine();
                return valorRetorno;
            }
            catch (Exception exception) {
                System.out.println("Valor inválido, deve ser digitado um número inteiro!");
            }
        } while (true);
    }
}