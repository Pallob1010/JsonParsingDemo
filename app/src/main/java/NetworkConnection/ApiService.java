package NetworkConnection;

import java.util.ArrayList;
import java.util.List;

import ModelClass.RecievedData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {

    @Headers("Content-Type:application/json")
    @GET("/users")
    Call<ArrayList<RecievedData>>getAll();

}
