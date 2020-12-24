package id.alin_gotama.iot_project.Services;

import id.alin_gotama.iot_project.Model.ServerDefaultResponse;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface services {

    @POST("/api/onstate")
    Call<ServerDefaultResponse> openGate(

    );

    @POST("/api/offstate")
    Call<ServerDefaultResponse> closeGate(

    );

    @POST("/api/readstate")
    Call<ServerDefaultResponse> readGate(

    );

}
