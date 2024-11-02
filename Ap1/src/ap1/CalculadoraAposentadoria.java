package ap1;
import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();
        
        boolean podeAposentar = false;
        int anosFaltantes = 0;
        
        if (sexo == 'F') {
            if (idade >= 62 || anosContribuicao >= 30) {
                podeAposentar = true;
            } else {
                anosFaltantes = Math.min(62 - idade, 30 - anosContribuicao);
            }
        } else if (sexo == 'M') {
            if (idade >= 65 || anosContribuicao >= 35) {
                podeAposentar = true;
            } else {
                anosFaltantes = Math.min(65 - idade, 35 - anosContribuicao);
            }
        }

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar.");
        } else {
            System.out.println("Faltam " + anosFaltantes + " anos para você se aposentar.");
        }
        
        scanner.close();
    }
}
