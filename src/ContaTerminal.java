import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente: ");
        String name = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o numero da conta: ");
        String conta = scanner.next();
        
        System.out.println("Por favor digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
    }
}
