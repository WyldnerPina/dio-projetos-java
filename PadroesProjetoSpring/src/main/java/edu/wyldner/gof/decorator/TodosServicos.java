package edu.wyldner.gof.decorator;

import java.util.HashMap;

public class TodosServicos implements Servico{
	HashMap<String, Double> servicos;
	
	public TodosServicos(HashMap<String, Double> servicos) {
		super();
		this.servicos = servicos;
	}

	@Override
	public double valorServicoContratado() {
		double valor = 0;
		for(double cada: servicos.values()) {
			valor = valor + cada;
		}
		return valor;
	}
}
