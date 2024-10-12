package edu.wyldner.gof.decorator;

public class ServicoPlanoBase extends ServicoDecorator{
	
	private double valorBase;
	
	public ServicoPlanoBase(Servico s) {
		super(s);
	}
	
	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public double getValorBase() {
		return valorBase;
	}


	@Override
	public double valorServicoContratado() {
		
		return servicoContratado.valorServicoContratado() + this.valorBase;
	}
}
