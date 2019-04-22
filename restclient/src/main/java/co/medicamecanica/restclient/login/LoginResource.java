package co.medicamecanica.restclient.login;

import org.restlet.resource.Get;

public interface LoginResource {
    @Get
    public Login login();

}
