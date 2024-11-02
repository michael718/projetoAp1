package ap1;
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String loginCorreto = "java8";
        final String senhaCorreta = "java8";
        
        int tentativas = 3;
        boolean acessoConcedido = false;

        while (tentativas > 0) {
            System.out.print("Digite seu login: ");
            String login = scanner.nextLine();
            
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();
            
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                acessoConcedido = true;
                break;
            } else {
                tentativas--;
                System.out.println("Login ou senha incorretos. Tentativas restantes: " + tentativas);
            }
        }

        if (acessoConcedido) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado. Número de tentativas excedido.");
        }
        
        scanner.close();
    }
}

