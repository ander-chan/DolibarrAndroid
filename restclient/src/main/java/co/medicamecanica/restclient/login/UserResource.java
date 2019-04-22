package co.medicamecanica.restclient.login;

import org.restlet.resource.Get;

public interface UserResource {
    @Get
    public User[] retrive();
}
