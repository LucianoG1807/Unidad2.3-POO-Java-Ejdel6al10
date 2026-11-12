import java.util.List;

public abstract class ExportadorFinanciero {

    public boolean validarDatos(List<String> registros) {
        return registros != null && !registros.isEmpty();
    }

    public abstract void exportarDatos(List<String> registros);
}