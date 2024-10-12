package edu.wyldner.gof.decorator;


public abstract class ServicoDecorator implements Servico {
	Servico servicoContratado;

	public ServicoDecorator(Servico s) {
		super();
		servicoContratado = s;
	}
}
