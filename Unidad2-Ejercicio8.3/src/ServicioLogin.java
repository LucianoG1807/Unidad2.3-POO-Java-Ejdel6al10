public class ServicioLogin {

    public void iniciarSesion(MetodoAutenticacion metodo, String credencialPrincipal, String credencialSecundaria) {

        if (metodo.autenticar(credencialPrincipal, credencialSecundaria)) {
            System.out.println("Autenticación exitosa. Acceso permitido.");
        } else {
            System.out.println("Autenticación fallida. Acceso denegado.");
        }
    }
}