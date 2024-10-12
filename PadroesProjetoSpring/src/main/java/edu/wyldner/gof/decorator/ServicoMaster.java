package edu.wyldner.gof.decorator;

public class ServicoMaster extends ServicoDecorator {
	public ServicoMaster(Servico s) {
		super(s);
	}


	@Override
	public double valorServicoContratado() {
		
		return servicoContratado.valorServicoContratado() + 24.0;
	}
}
