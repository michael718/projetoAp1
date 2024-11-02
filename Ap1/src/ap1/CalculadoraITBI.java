package ap1;
import java.util.Scanner;

public class CalculadoraITBI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de transação do imóvel: ");
        double valorTransacao = scanner.nextDouble();

        System.out.print("Digite o valor venal do imóvel: ");
        double valorVenal = scanner.nextDouble();

        System.out.print("Digite a porcentagem do ITBI: ");
        double porcentagemITBI = scanner.nextDouble();

        double valorBase = Math.max(valorTransacao, valorVenal);
        double imposto = valorBase * (porcentagemITBI / 100);

        System.out.println("Valor do ITBI: " + imposto);

        scanner.close();
    }
}