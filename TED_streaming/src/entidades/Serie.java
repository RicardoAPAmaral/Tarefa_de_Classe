package entidades;

public class Serie extends Video {
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String titulo, String diretor, String elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa, int temporadaAtual, int episodioAtual) {
        super(titulo, diretor, genero, sinopse);
        this.temporadaAtual = temporadaAtual;
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }
}