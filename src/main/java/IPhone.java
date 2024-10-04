public class IPhone implements Internet, IPod, Telephone {

    @Override
    public void assistirFilmes(String nome) {
        System.out.println("Reproduzindo filme: " + nome);
    }

    @Override
    public void ouvirAudiobooks(String nome) {
        System.out.println("Reproduzindo audio do livro: " + nome);
    }

    @Override
    public void assistirSeries(String nome) {
        System.out.println("Reproduzindo série: " + nome);
    }

    @Override
    public void assistirVideoClipes(String nome) {
        System.out.println("Reproduzindo video clipe: " + nome);
    }

    @Override
    public void visualizarListaArtistas() {
        System.out.println("Mostrando artistas");
    }

    @Override
    public void visualizarListaMusicas() {
        System.out.println("Mostrando músicas");
    }

    @Override
    public void visualizarListaAlbuns() {
        System.out.println("Mosrando álbuns");
    }

    @Override
    public void sincronizarComDispositivosApple() {
        System.out.println("Sincronizando com dispositivo apple...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada");
    }

    @Override
    public void enviarEmail() {
        System.out.println("enviando e-mail");
    }

    @Override
    public void navegarNaInternet() {
        System.out.println("navegando na internet");
    }

    @Override
    public void usarGoogleMaps() {
        System.out.println("utilizando google maps");
    }

    @Override
    public void verClima() {
        System.out.println("exibindo clima");
    }

    @Override
    public void conectarWiFi() {
        System.out.println("conectando com wi-fi");
    }

    @Override
    public void fazerPesquisasWeb() {
        System.out.println("pesquisando na web...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void fazerLigacoes(long telefone) {
        System.out.println("Ligando para " + telefone);
    }

    @Override
    public void atenderLigacoes() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void guardarNumeros(long numero) {
        System.out.println("Registrando número...");
    }

    @Override
    public void vizualizarCorreioDeVoz() {
        System.out.println("Mostrando correio de voz");
    }

    @Override
    public void verContatos() {
        System.out.println("Mostrando contatos...");
    }

    @Override
    public void vizualizarListaFavoritos() {
        System.out.println("Mostrando contatos favoritos...");
    }

    @Override
    public void vizualizarLigacoesRecentes() {
        System.out.println("Mostrando ligações recentes...");
    }

    @Override
    public void adicionarContatos(long numero) {
        System.out.println("Adicionando contato: " + numero);
    }

    @Override
    public void fazerLigacoesEmGrupo() {
        System.out.println("Ligando em grupo");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Colocando em espera");
    }

    @Override
    public void editarContatos() {
        System.out.println("Editando contato");
    }
}
