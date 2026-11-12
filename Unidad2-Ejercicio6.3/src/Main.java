public class Main {

    public static void main(String[] args) {

        Impresor laser = new ImpresoraLaser("HP LaserJet", 1200, 20);
        Impresor tinta = new ImpresoraTinta("Epson EcoTank", 600, 10);

        System.out.println("=== IMPRESORA LÁSER ===");
        laser.mostrarEstado();
        laser.imprimirDocumento("Informe anual");
        laser.imprimirDocumento("Factura");
        laser.imprimirDocumento("Contrato");
        laser.mostrarEstado();

        System.out.println("\n=== IMPRESORA DE TINTA ===");
        tinta.mostrarEstado();
        tinta.imprimirDocumento("Fotografía");
        tinta.imprimirDocumento("Documento");
        tinta.mostrarEstado();
    }
}