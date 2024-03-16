package Services.SicrediAPITest.Post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ProductCreationTest {

    private static final String BASE_URL = "https://dummyjson.com";
    private static final String ENDPOINT = "/products/add";

    @Test
    public void testProductCreation() {
        given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body(createProductRequestBody())
                .when()
                .post(ENDPOINT)
                .then()
                .statusCode(201)
                .body("id", equalTo(101))
                .body("title", equalTo("Perfume Oil"))
                .body("price", equalTo(13))
                .body("stock", equalTo(65))
                .body("rating", equalTo(4.26f))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/11/thumbnail.jpg"))
                .body("description", equalTo("Mega Discount, Impression of A..."))
                .body("brand", equalTo("Impression of Acqua Di Gio"))
                .body("category", equalTo("fragrances"));
    }

    private String createProductRequestBody() {
        return "{\n" +
                "    \"title\": \"Perfume Oil\",\n" +
                "    \"description\": \"Mega Discount, Impression of A...\",\n" +
                "    \"price\": 13,\n" +
                "    \"discountPercentage\": 8.4,\n" +
                "    \"rating\": 4.26,\n" +
                "    \"stock\": 65,\n" +
                "    \"brand\": \"Impression of Acqua Di Gio\",\n" +
                "    \"category\": \"fragrances\",\n" +
                "    \"thumbnail\": \"https://i.dummyjson.com/data/products/11/thumbnail.jpg\"\n" +
                "}";
    }
}
