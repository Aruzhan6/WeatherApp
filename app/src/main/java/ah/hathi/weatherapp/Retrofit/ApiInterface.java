package ah.hathi.weatherapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("find?type=like&APPID=d508ef42ab152fb0537b5ccd4ef39924")
    Call<Example> getWeatherData(@Query("q")String name);
}
