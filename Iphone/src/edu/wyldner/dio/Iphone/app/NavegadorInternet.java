package edu.wyldner.dio.Iphone.app;

import edu.wyldner.dio.Iphone.Iphone;

public class NavegadorInternet implements Iphone {
	public void exibirPagina(String url) {
		System.out.println("Exibindo página");
	}

	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void appEmSegundoPlano() {
		System.out.println("colocando navegador em segundo plano");
	}

	@Override
	public void interfacePersonalizada() {
		System.out.println("gerando interface navegador");
	}

	@Override
	public void receberTouch(int x, int y) {
		System.out.println("recebendo toque");
		if(x<=300 && y >=400) {
			appEmSegundoPlano();
			ativarTeclado();
		}
	}

	@Override
	public void ativarTeclado() {
		System.out.println("ativando teclado");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("aumentando volume");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("diminuindo volume");
	}

	@Override
	public void sincronizarDispositivos(String tipoDispositivo) {
		System.out.println("sincronizando ");
	}

	@Override
	public void ativarSensorProximidade() {
		System.out.println("sensor de proximidade");
	}

	@Override
	public void ativarSensorLuz() {
		System.out.println("sensor de luz");
	}

	@Override
	public void ativarSensorRetratoPaisagem() {
		System.out.println("ativar retrato/paisagem");
	}
}
