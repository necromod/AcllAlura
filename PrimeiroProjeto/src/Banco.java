import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "José Mario";
        String conta = "Corrente";
        double saldo = 1.99;
        double valor;
        int opcao = 0;


        String init = """
                ======================
                Dados inicias do cliente:
                
                Nome: %s
                Tipo de conta:  %s
                Saldo inicial: %.2f
                ======================
                """.formatted(nome, conta, saldo);
        System.out.println(init);

        while (opcao != 4){
            String menu = """
                \n
            ** Digite sua opção **
            1 - Consultar saldo
            2 - Retirar valor
            3 - Depositar valor
            4 - Sair
            """;
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("\nSaldo autal: " + saldo);
                case 2 -> {
                    System.out.println("\nValor a sacar: ");
                    valor = scanner.nextDouble();
                    if ((saldo - valor) < 0) {
                        System.out.println("Saldo atual insuficiente para saque");
                    } else {
                        saldo -= valor;
                    }
                }
                case 3 -> {
                    System.out.print("\nDigite valor a depositar: ");
                    valor = scanner.nextDouble();
                    saldo += valor;
                }
                case 4 -> {}
                default ->
                    System.out.println("\nNúmero inválido!");


            }
        }
    }
}
