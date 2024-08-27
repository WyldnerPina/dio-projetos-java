package edu.wyldner.dio.Iphone.app;

import edu.wyldner.dio.Iphone.Iphone;

public class AparelhoTelefonico implements Iphone {
	public void ligar(String numero) {
		System.out.println("Ligando");
	}

	public void atender() {
		System.out.println("Atendido");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz");
	}

	@Override
	public void appEmSegundoPlano() {
		System.out.println("colocando telefone em segundo plano");
	}

	@Override
	public void interfacePersonalizada() {
		System.out.println("gerando interface");
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
