import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;


        for (int i = 0; i < 3; i++) {
            System.out.print("Diga a sua avaliação para o filme: ");
            nota = (int) scanner.nextDouble();
            mediaAvaliacao += + nota;
        }

        System.out.println(" Media de avaliações: " + (mediaAvaliacao/3));

    }
}