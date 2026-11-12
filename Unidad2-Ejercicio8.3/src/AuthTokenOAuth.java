public class AuthTokenOAuth extends MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        return credencialPrincipal.equals("TOKEN_VALIDO")
                && credencialSecundaria.equals("PROVEEDOR_VALIDO");
    }
}