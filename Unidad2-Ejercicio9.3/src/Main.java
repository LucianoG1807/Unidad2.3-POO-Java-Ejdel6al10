import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> registros = new ArrayList<>();

        registros.add("Balance: Enero - Ingresos: $500000");
        registros.add("Balance: Febrero - Ingresos: $650000");
        registros.add("Balance: Marzo - Ingresos: $720000");

        ExportadorFinanciero banco = new ExportadorBancoCentral();
        ExportadorFinanciero agencia = new ExportadorAgenciaTributaria();

        System.out.println("=== EXPORTACIÓN AL BANCO CENTRAL ===");
        banco.exportarDatos(registros);

        System.out.println("\n=== EXPORTACIÓN A LA AGENCIA TRIBUTARIA ===");
        agencia.exportarDatos(registros);
        
    }
}