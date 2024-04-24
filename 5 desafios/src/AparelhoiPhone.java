// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarChamadaVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone implementando as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        // Lógica para tocar música
    }

    public void pausar() {
        // Lógica para pausar música
    }

    public void selecionarMusica() {
        // Lógica para selecionar música
    }

    public void ligar() {
        // Lógica para ligar o telefone
    }

    public void atender() {
        // Lógica para atender uma chamada
    }

    public void iniciarChamadaVoz() {
        // Lógica para iniciar uma chamada de voz
    }

    public void exibirPagina() {
        // Lógica para exibir uma página na internet
    }

    public void adicionarNovaAba() {
        // Lógica para adicionar uma nova aba no navegador
    }

    public void atualizarPagina() {
        // Lógica para atualizar a página no navegador
    }
}
