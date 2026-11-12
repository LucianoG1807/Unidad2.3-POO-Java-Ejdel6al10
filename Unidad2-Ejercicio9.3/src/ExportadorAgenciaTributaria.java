import java.util.List;

public class ExportadorAgenciaTributaria extends ExportadorFinanciero {

    @Override
    public void exportarDatos(List<String> registros) {
        if (validarDatos(registros)) {
            System.out.println("Iniciando exportación a la Agencia Tributaria...");

            for (String registro : registros) {
                System.out.println("Enviando a la Agencia Tributaria: " + registro);
            }

            System.out.println("Exportación a la Agencia Tributaria completada.");
        } else {
            System.out.println("Error: no hay registros para exportar.");
        }
    }
}