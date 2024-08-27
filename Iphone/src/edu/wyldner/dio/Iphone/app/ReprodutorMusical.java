package edu.wyldner.dio.Iphone.app;

import edu.wyldner.dio.Iphone.Iphone;

public class ReprodutorMusical implements Iphone {
	public void tocar() {
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Música escolhida");
	}

	@Override
	public void appEmSegundoPlano() {
		System.out.println("colocando em segundo plano músicas");
	}

	@Override
	public void interfacePersonalizada() {
		System.out.println("gerando interface música");
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
