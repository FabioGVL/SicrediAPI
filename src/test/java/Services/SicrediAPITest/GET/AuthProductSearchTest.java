package Services.SicrediAPITest.GET;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthProductSearchTest {

    private static final String BASE_URL = "https://dummyjson.com/auth/products";
    private static final String LOGIN_URL = "https://dummyjson.com/auth/login";
    private static String validToken;

    @Test
    public void testProductSearchWithAuthentication() {
        // Gerar o token válido antes de fazer a chamada GET
        validToken = given()
                .baseUri(LOGIN_URL)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"username\": \"kminchelle\",\n" +
                        "    \"password\": \"0lelplR\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .path("token");

        given()
                .header("Authorization", "Bearer " + validToken)
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .body("products.size()", equalTo(3))
                .body("products[0].id", equalTo(1))
                .body("products[0].title", equalTo("iPhone 9"))
                .body("products[0].description", equalTo("An apple mobile which is nothing like apple"))
                .body("products[0].price", equalTo(549))
                .body("products[0].discountPercentage", equalTo(12.96f))
                .body("products[0].rating", equalTo(4.69f))
                .body("products[0].stock", equalTo(94))
                .body("products[0].brand", equalTo("Apple"))
                .body("products[0].category", equalTo("smartphones"))
                .body("products[0].thumbnail", equalTo("https://i.dummyjson.com/data/products/1/thumbnail.jpg"))
                .body("products[0].images.size()", equalTo(5))
                .body("products[0].images[0]", equalTo("https://i.dummyjson.com/data/products/1/1.jpg"))
                .body("products[0].images[1]", equalTo("https://i.dummyjson.com/data/products/1/2.jpg"))
                .body("products[0].images[2]", equalTo("https://i.dummyjson.com/data/products/1/3.jpg"))
                .body("products[0].images[3]", equalTo("https://i.dummyjson.com/data/products/1/4.jpg"))
                .body("products[0].images[4]", equalTo("https://i.dummyjson.com/data/products/1/thumbnail.jpg"))
                .body("products[1].id", equalTo(2))
                .body("products[1].title", equalTo("iPhone X"))
                .body("products[1].description", equalTo("SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ..."))
                .body("products[1].price", equalTo(899))
                .body("products[1].discountPercentage", equalTo(17.94f))
                .body("products[1].rating", equalTo(4.44f))
                .body("products[1].stock", equalTo(34))
                .body("products[1].brand", equalTo("Apple"))
                .body("products[1].category", equalTo("smartphones"))
                .body("products[1].thumbnail", equalTo("https://i.dummyjson.com/data/products/2/thumbnail.jpg"))
                .body("products[1].images.size()", equalTo(4))
                .body("products[1].images[0]", equalTo("https://i.dummyjson.com/data/products/2/1.jpg"))
                .body("products[1].images[1]", equalTo("https://i.dummyjson.com/data/products/2/2.jpg"))
                .body("products[1].images[2]", equalTo("https://i.dummyjson.com/data/products/2/3.jpg"))
                .body("products[1].images[3]", equalTo("https://i.dummyjson.com/data/products/2/thumbnail.jpg"))
                .body("products[2].id", equalTo(3))
                .body("products[2].title", equalTo("Samsung Universe 9"))
                .body("products[2].description", equalTo("Samsung's new variant which goes beyond Galaxy to the Universe"))
                .body("products[2].price", equalTo(1249))
                .body("products[2].discountPercentage", equalTo(15.46f))
                .body("products[2].rating", equalTo(4.09f))
                .body("products[2].stock", equalTo(36))
                .body("products[2].brand", equalTo("Samsung"))
                .body("products[2].category", equalTo("smartphones"))
                .body("products[2].thumbnail", equalTo("https://i.dummyjson.com/data/products/3/thumbnail.jpg"))
                .body("products[2].images.size()", equalTo(1))
                .body("products[2].images[0]", equalTo("https://i.dummyjson.com/data/products/3/1.jpg"))
                .body("total", equalTo(100))
                .body("skip", equalTo(0))
                .body("limit", equalTo(30));
        // Add more assertions as needed
    }

    @Test
    public void testInvalidTokenReturnsForbiddenError() {
        given()
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(403)
                .body("message", equalTo("Authentication Problem"));
    }

    @Test
    public void testUnauthorizedAccess() {
        given()
                .header("Authorization", "Bearer invalid_token")
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(401)
                .body("name", equalTo("JsonWebTokenError"))
                .body("message", equalTo("Invalid/Expired Token!"));
    }
}