package ah.hathi.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=d508ef42ab152fb0537b5ccd4ef39924&units=metric")
    Call<Example> getWeatherData(@Query("q")String name);
}
