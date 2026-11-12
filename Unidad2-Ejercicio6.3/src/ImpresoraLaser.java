public class ImpresoraLaser extends Impresor {

    private int nivelToner;

    public ImpresoraLaser(String modelo, int resolucion, int nivelToner) {
        super(modelo, resolucion);
        this.nivelToner = nivelToner;
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (nivelToner > 0) {
            System.out.println("Impresora láser " + modelo + " imprimiendo: " + documento);
            nivelToner -= 10;

            if (nivelToner < 0) {
                nivelToner = 0;
            }
        } else {
            System.out.println("Error: tóner agotado. No se puede imprimir.");
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolución: " + resolucion + " dpi");
        System.out.println("Nivel de tóner: " + nivelToner + "%");
    }
}