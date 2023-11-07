package tests;

import endpoints.UserService;
import models.UserSingleResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private final UserService userService = retrofit.create(UserService.class);

    @Test

    public void getSingleUser() throws IOException {
        int id=2;
        Response<UserSingleResponse> response = userService.getSingleUser(id).execute();

        Assertions.assertTrue(response.isSuccessful());

        UserSingleResponse singleResponse = response.body();
        assertEquals(id, singleResponse.getData().getId());

    }
}
