package ap1;
import java.util.Scanner;
import java.util.Arrays;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] resistencias = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = scanner.nextDouble();
        }
        
        double resistenciaEquivalente = 0;
        for (double resistencia : resistencias) {
            resistenciaEquivalente += resistencia;
        }

        double maior = Arrays.stream(resistencias).max().getAsDouble();
        double menor = Arrays.stream(resistencias).min().getAsDouble();

        System.out.println("Resistência Equivalente: " + resistenciaEquivalente);
        System.out.println("Maior Resistência: " + maior);
        System.out.println("Menor Resistência: " + menor);
        
        scanner.close();
    }
}