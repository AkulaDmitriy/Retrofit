package endpoints;

import models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {
    @GET("/api/users")
    Call<UserResponse> getUserList(@Query("page") int pageparam);

    @GET("/api/users/{id}")
    Call<UserSingleResponse> getSingleUser(@Path("id") int id);

    @POST("/api/users")
    Call<UserCreateResponse> createUser(@Body UserRequest userRequest);

    @PUT("/api/users/{id}")
    Call<UserUpdateResponse> updateUser(@Path("id") int id, @Body UserRequest userRequest);

    @DELETE("/api/users/{id}")
    Call<Void> deleteUser(@Path("id") int id);
}
