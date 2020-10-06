package ah.hathi.weatherapp.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclient {
    public static String base_url ="http://api.openweathermap.org/data/2.5/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if (retrofit==null){

        retrofit = new Retrofit.Builder()
        .baseUrl(base_url)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
        }
        return retrofit;
    }
}
