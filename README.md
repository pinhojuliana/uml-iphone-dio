```mermaid 
classDiagram
    class iPod {
        <<interface>>
        +assistirFilmes()
        +ouvirAudiobooks()
        +assistirSeries()
        +assistirVideoClipes()
        +visualizarListaArtistas()
        +visualizarListaMusicas()
        +visualizarListaAlbuns()
        +sincronizarComDispositivosApple()
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class Telephone {
        <<interface>>
        +fazerLigacoes()
        +atenderLigacoes()
        +guardarNumeros()
        +correioDeVoz()
        +verContatos()
        +listaFavoritos()
        +ligacoesRecentes()
        +adicionarContatos()
        +fazerLigacoesEmGrupo()
        +colocarEmEspera()
        +editarContatos()
    }

    class Internet {
        <<interface>>
        +enviarEmail()
        +navegarNaInternet()
        +usarGoogleMaps()
        +verClima()
        +conectarWiFi()
        +fazerPesquisasWeb()
        +pesquisarGoogle()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +visualizarFotos()
        +tirarFotos()
        +visualizarCalendario()
    }

    Internet <|-- iPhone
    Telephone <|-- iPhone
    iPod <|-- iPhone
