public abstract class ItemFacturable {

    protected String nombre;
    protected double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularImpuesto();

    public double calcularPrecioFinal() {
        return precioBase + calcularImpuesto();
    }

    public void mostrarDetalle() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}