
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	
	public double rendimento(int meses) {
		for(int i=0; i<meses; i++) {
			saldo = saldo + (saldo*0.01);
		}
		return saldo;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
