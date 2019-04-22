package co.medicamecanica.restclient.login;

public interface UserListener {
    void onPostExecute(User user, int code);
}
