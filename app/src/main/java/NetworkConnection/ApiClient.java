package NetworkConnection;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit retrofit = null;
    public static String Base_Url = "https://jsonplaceholder.typicode.com";

    public static Retrofit getobject(){

        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                        .baseUrl(Base_Url)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
        }

        return retrofit;

    }
}