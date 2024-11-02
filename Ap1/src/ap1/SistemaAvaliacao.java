package ap1;
import java.util.Scanner;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        String status = (media >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);

        scanner.close();
    }
}