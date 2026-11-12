public class Pelicula extends ContenidoDigital {

    public Pelicula(String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
        System.out.println("Duración: " + duracionMinutos + " minutos.");
    }
}