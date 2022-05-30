package utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import objects.UserLogin;

import java.io.FileReader;
import java.io.IOException;

public class DataParser {

    private static final String JSON = "src/test/resources/testData/";
    private static Gson gson = new Gson();

    public static UserLogin parseData() throws IOException {
        return gson.fromJson(new JsonReader(new FileReader(JSON + "usersLoginData.json")), UserLogin.class);
    }
}
