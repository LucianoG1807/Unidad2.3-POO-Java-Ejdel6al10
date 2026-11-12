public class ImpresoraTinta extends Impresor {

    private int nivelCartucho;

    public ImpresoraTinta(String modelo, int resolucion, int nivelCartucho) {
        super(modelo, resolucion);
        this.nivelCartucho = nivelCartucho;
    }

    @Override
    public void imprimirDocumento(String documento) {
        if (nivelCartucho > 0) {
            System.out.println("Impresora de tinta " + modelo + " imprimiendo: " + documento);
            nivelCartucho -= 10;

            if (nivelCartucho < 0) {
                nivelCartucho = 0;
            }
        } else {
            System.out.println("Error: cartucho agotado. No se puede imprimir.");
        }
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolución: " + resolucion + " dpi");
        System.out.println("Nivel de cartucho: " + nivelCartucho + "%");
    }
}