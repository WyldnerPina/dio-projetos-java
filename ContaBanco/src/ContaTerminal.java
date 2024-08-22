import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número de sua conta");
		int numero = scanner.nextInt();
		
		System.out.println("Digite o número de sua agência");
		String agencia = scanner.next();
		
		System.out.println("Digite seu nome");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite seu saldo");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n "
							+ "Sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque");

	}

}
