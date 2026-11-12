public class AuthPassword extends MetodoAutenticacion {

    @Override
    public boolean autenticar(String credencialPrincipal, String credencialSecundaria) {
        return credencialPrincipal.equals("lucho") && credencialSecundaria.equals("1234");
    }
}