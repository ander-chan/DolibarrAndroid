package co.medicamecanica.restclient;

public interface ConsumeListener<T> {


    void onPostExecute(Integer code);

    Integer doInBackground(T wrap);
}
