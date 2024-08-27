classDiagram
    Iphone <|.. ReprodutorMusical
    Iphone <|.. AparelhoTelefonico
    Iphone <|.. NavegadorInternet

    class Iphone {
        <<interface>>
        +appEmSegundoPlano()
        +interfacePersonalizada()
        +receberTouch(int x, int y)
        +ativarTeclado()
        +aumentarVolume()
        +diminuirVolume()
        +sincronizarDispositivos(String tipoDispositivo)
        +ativarSensorProximidade()
        +ativarSensorLuz()
        +ativarSensorRetratoPaisagem()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +appEmSegundoPlano()
        +interfacePersonalizada()
        +receberTouch(int x, int y)
        +ativarTeclado()
        +aumentarVolume()
        +diminuirVolume()
        +sincronizarDispositivos(String tipoDispositivo)
        +ativarSensorProximidade()
        +ativarSensorLuz()
        +ativarSensorRetratoPaisagem()
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +appEmSegundoPlano()
        +interfacePersonalizada()
        +receberTouch(int x, int y)
        +ativarTeclado()
        +aumentarVolume()
        +diminuirVolume()
        +sincronizarDispositivos(String tipoDispositivo)
        +ativarSensorProximidade()
        +ativarSensorLuz()
        +ativarSensorRetratoPaisagem()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
        +appEmSegundoPlano()
        +interfacePersonalizada()
        +receberTouch(int x, int y)
        +ativarTeclado()
        +aumentarVolume()
        +diminuirVolume()
        +sincronizarDispositivos(String tipoDispositivo)
        +ativarSensorProximidade()
        +ativarSensorLuz()
        +ativarSensorRetratoPaisagem()
    }