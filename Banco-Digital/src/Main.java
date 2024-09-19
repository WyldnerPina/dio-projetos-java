import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		ContaPoupanca cp = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o número de Meses para ver o rendimento (valor inteiro)");
		int mesesRendimento = scanner.nextInt();
		System.out.printf("Rendimento de %.2f após %d meses%n", cp.rendimento(mesesRendimento), mesesRendimento);

	}

}
