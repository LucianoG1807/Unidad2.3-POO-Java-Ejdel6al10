public class EpisodioSerie extends ContenidoDigital {

    private int temporada;
    private int numeroEpisodio;

    public EpisodioSerie(String titulo, int duracionMinutos, int temporada, int numeroEpisodio) {
        super(titulo, duracionMinutos);
        this.temporada = temporada;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo episodio: " + titulo);
        System.out.println("Temporada: " + temporada);
        System.out.println("Episodio: " + numeroEpisodio);
        System.out.println("Duración: " + duracionMinutos + " minutos.");
    }
}