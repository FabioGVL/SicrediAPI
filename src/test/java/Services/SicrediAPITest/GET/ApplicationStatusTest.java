package Services.SicrediAPITest.GET;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApplicationStatusTest {

    private static final String BASE_URI = "http://dummyjson.com";
    private static final String ENDPOINT = "/test";
    private static final String EXPECTED_STATUS = "ok";
    private static final String EXPECTED_METHOD = "GET";

    @BeforeEach
    public void setUp() {
        baseURI = BASE_URI;
    }

    @Test
    public void testApplicationStatus() {
        given()
                .when()
                .get(ENDPOINT)
                .then()
                .statusCode(200)
                .body("status", equalTo(EXPECTED_STATUS))
                .body("method", equalTo(EXPECTED_METHOD));
    }
}