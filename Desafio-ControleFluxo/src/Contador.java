import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Criando Scanner
        Scanner terminal = new Scanner(System.in);
        // Variável parametroUm / coleta dela via terminal
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        // Variável parametroDois / coleta dela via terminal
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contar
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    // Declaração da classe ParametrosInvalidosException como interna estática
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}