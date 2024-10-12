package edu.wyldner.gof.decorator;

public class ServicoPremium extends ServicoDecorator{
	public ServicoPremium(Servico s) {
		super(s);
	}


	@Override
	public double valorServicoContratado() {
		
		return servicoContratado.valorServicoContratado() + 10.5;
	}
}
