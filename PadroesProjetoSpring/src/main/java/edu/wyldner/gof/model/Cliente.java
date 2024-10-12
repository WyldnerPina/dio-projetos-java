package edu.wyldner.gof.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import edu.wyldner.gof.decorator.ServicoMaster;
import edu.wyldner.gof.decorator.ServicoPlanoBase;
import edu.wyldner.gof.decorator.ServicoPremium;

@Entity(name = "tb_Cliente")
public class Cliente extends Pessoa{


	private double valor;
	
	@ManyToOne
	private Endereco endereco;
	
	@OneToMany
	private List<Dependente> dependentes;;


	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(ServicoPlanoBase servico) {
		
		ServicoPlanoBase valorFinal = null;
		
		
		if(servico.getValorBase() <= 15) {
			valorFinal = new ServicoPlanoBase(new ServicoPremium(servico));
			this.valor = valorFinal.getValorBase();
		}else if (servico.getValorBase() <= 25) {
			valorFinal = new ServicoPlanoBase(new ServicoMaster(servico));
			this.valor = valorFinal.getValorBase();
		}else {
			valorFinal = new ServicoPlanoBase(new ServicoMaster(new ServicoPremium(servico)));
			this.valor = valorFinal.getValorBase();
		}		
	}


}
