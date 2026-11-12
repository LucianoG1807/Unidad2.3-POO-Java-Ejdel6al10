public class AuthBiometrica extends MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        return credencialPrincipal.equals("HUELLA_VALIDADA")
                && credencialSecundaria.equals("USUARIO_VALIDO");
    }
}