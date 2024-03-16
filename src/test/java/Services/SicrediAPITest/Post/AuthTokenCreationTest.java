package Services.SicrediAPITest.Post;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthTokenCreationTest {

    private static final String BASE_URI = "https://dummyjson.com";
    private static final String ENDPOINT = "/auth/login";


    @Test
    public void testAuthTokenCreation() {
        given()
                .baseUri(BASE_URI)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"username\": \"kminchelle\",\n" +
                        "    \"password\": \"0lelplR\"\n" +
                        "}")
                .when()
                .post(ENDPOINT)
                .then()
                .statusCode(201)
                .body("username", equalTo("kminchelle"))
                .body("email", equalTo("kminchelle@qq.com"))
                .body("firstName", equalTo("Jeanne"))
                .body("lastName", equalTo("Halvorson"))
                .body("gender", equalTo("female"))
                .body("image", equalTo("https://robohash.org/autquiaut.png"))
                .body("token", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvYXV0cXVpYXV0LnBuZyIsImlhdCI6MTY4MjY5MTgwMSwiZXhwIjoxNjgyNjk1NDAxfQ.npaLt2FFWCh6PAR9cUrufmmI6uLebd2Q6SFMHy8EZ1M"));
    }
}