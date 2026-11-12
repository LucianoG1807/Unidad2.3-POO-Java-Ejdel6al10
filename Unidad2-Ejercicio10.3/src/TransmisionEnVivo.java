public class TransmisionEnVivo extends ContenidoDigital {

    private boolean enCurso;

    public TransmisionEnVivo(String titulo, int duracionMinutos, boolean enCurso) {
        super(titulo, duracionMinutos);
        this.enCurso = enCurso;
    }

    @Override
    public void reproducir() {
        if (enCurso) {
            System.out.println("Reproduciendo transmisión en vivo: " + titulo);
        } else {
            System.out.println("No se puede reproducir. La transmisión no está en curso: " + titulo);
        }
    }
}