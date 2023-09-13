import java.util.Scanner;

public class Loopteste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        String valida = "";

        for (int i = 0; i < 3; i++) {
            System.out.print("Diga a sua avaliação para o filme: ");

            try {
                valida = scanner.nextLine();
                System.out.println(valida);

                // Espaço para conversão
                nota = Integer.parseInt(valida);
                mediaAvaliacao += + nota;
            }
            catch (NumberFormatException e){
                System.out.println("Numero inválido!");
                i--;
            }
        }
        System.out.println(" Media de avaliações: " + (mediaAvaliacao/3));

    }
}