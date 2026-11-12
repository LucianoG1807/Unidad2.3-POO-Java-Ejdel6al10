import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ItemFacturable> items = new ArrayList<>();

        items.add(new ProductoImportado("Notebook", 1000000));
        items.add(new ServicioProfesional("Consultoría", 200000));
        items.add(new AlimentoBasico("Arroz", 3000));

        for (ItemFacturable item : items) {
            System.out.println("=== DETALLE DEL ÍTEM ===");
            item.mostrarDetalle();
            System.out.println();
        }
    }
}