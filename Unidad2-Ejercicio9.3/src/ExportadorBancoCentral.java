import java.util.List;

public class ExportadorBancoCentral extends ExportadorFinanciero {

    @Override
    public void exportarDatos(List<String> registros) {
        if (validarDatos(registros)) {
            System.out.println("Iniciando exportación al Banco Central...");

            for (String registro : registros) {
                System.out.println("Enviando al Banco Central: " + registro);
            }

            System.out.println("Exportación al Banco Central completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}