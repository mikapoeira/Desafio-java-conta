import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor,digite seu numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora digite sua agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ",obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + " conta " + numero + " e seu saldo de " + saldo + " ja está disponivel para saque");

    }
}
