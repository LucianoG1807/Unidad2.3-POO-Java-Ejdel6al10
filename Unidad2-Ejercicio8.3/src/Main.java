public class Main {

    public static void main(String[] args) {

        ServicioLogin servicio = new ServicioLogin();

        MetodoAutenticacion password = new AuthPassword();
        MetodoAutenticacion biometrica = new AuthBiometrica();
        MetodoAutenticacion oauth = new AuthTokenOAuth();

        System.out.println("=== AUTENTICACIÓN CON CONTRASEÑA ===");
        servicio.iniciarSesion(password, "lucho", "1234");
        servicio.iniciarSesion(password, "lucho", "0000");

        System.out.println("\n=== AUTENTICACIÓN BIOMÉTRICA ===");
        servicio.iniciarSesion(biometrica, "HUELLA_VALIDADA", "USUARIO_VALIDO");
        servicio.iniciarSesion(biometrica, "HUELLA_INVALIDA", "USUARIO_VALIDO");

        System.out.println("\n=== AUTENTICACIÓN OAUTH ===");
        servicio.iniciarSesion(oauth, "TOKEN_VALIDO", "PROVEEDOR_VALIDO");
        servicio.iniciarSesion(oauth, "TOKEN_INVALIDO", "PROVEEDOR_VALIDO");
    }
}