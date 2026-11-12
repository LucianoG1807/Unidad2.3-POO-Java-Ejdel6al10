import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ContenidoDigital> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula("Interestelar", 169));
        contenidos.add(new EpisodioSerie("El comienzo", 45, 1, 1));
        contenidos.add(new TransmisionEnVivo("Final del torneo", 120, true));
        contenidos.add(new TransmisionEnVivo("Concierto en vivo", 90, false));

        for (ContenidoDigital contenido : contenidos) {
            System.out.println("\n=== REPRODUCTOR UNIVERSAL ===");
            contenido.reproducir();
        }
    }
}