package edu.wyldner.dio.Iphone;

import edu.wyldner.dio.Iphone.app.ReprodutorMusical;

public class IphoneMain {

	public static void main(String[] args) {
		System.out.println("Ligando Iphone");
		System.out.println("=======================================");
		
		Iphone musica = new ReprodutorMusical();
		Iphone telefone = new ReprodutorMusical();
		Iphone navegador = new ReprodutorMusical();
		int x = 200;
		int y = 400;
				
		String tipoDispositivo = "note";
		musica.interfacePersonalizada();
		musica.receberTouch(x, y);
		musica.aumentarVolume();
		musica.diminuirVolume();
		musica.sincronizarDispositivos(tipoDispositivo);
		musica.ativarSensorProximidade();
		musica.ativarSensorLuz();
		musica.ativarSensorRetratoPaisagem();
		
		
		String tipoDispositivo2 = "pc";
		telefone.interfacePersonalizada();
		telefone.receberTouch(x, y);
		telefone.aumentarVolume();
		telefone.diminuirVolume();
		telefone.sincronizarDispositivos(tipoDispositivo2);
		telefone.ativarSensorProximidade();
		telefone.ativarSensorLuz();
		telefone.ativarSensorRetratoPaisagem();
		
		
		String tipoDispositivo3 = "pc";
		navegador.interfacePersonalizada();
		navegador.receberTouch(x, y);
		navegador.aumentarVolume();
		navegador.diminuirVolume();
		navegador.sincronizarDispositivos(tipoDispositivo3);
		navegador.ativarSensorProximidade();
		navegador.ativarSensorLuz();
		navegador.ativarSensorRetratoPaisagem();		
		
	}

}
