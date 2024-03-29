package Services.SicrediAPITest.GET;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SingleProductSearchTest {

    private static final String BASE_URL = "https://dummyjson.com";

    @Test
    public void testSingleProductSearch() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 1)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("iPhone 9"))
                .body("description", equalTo("An apple mobile which is nothing like apple"))
                .body("price", equalTo(549))
                .body("discountPercentage", equalTo(12.96f))
                .body("rating", equalTo(4.69f))
                .body("stock", equalTo(94))
                .body("brand", equalTo("Apple"))
                .body("category", equalTo("smartphones"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/1/thumbnail.jpg"))
                .body("images.size()", equalTo(5))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/1/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/1/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/1/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/1/4.jpg"))
                .body("images[4]", equalTo("https://i.dummyjson.com/data/products/1/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 2)
                .then()
                .statusCode(200)
                .body("id", equalTo(2))
                .body("title", equalTo("iPhone X"))
                .body("description", equalTo("SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ..."))
                .body("price", equalTo(899))
                .body("discountPercentage", equalTo(17.94f))
                .body("rating", equalTo(4.44f))
                .body("stock", equalTo(34))
                .body("brand", equalTo("Apple"))
                .body("category", equalTo("smartphones"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/2/thumbnail.jpg"))
                .body("images.size()", equalTo(4))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/2/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/2/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/2/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/2/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 3)
                .then()
                .statusCode(200)
                .body("id", equalTo(3))
                .body("title", equalTo("Samsung Universe 9"))
                .body("description", equalTo("Samsung's new variant which goes beyond Galaxy to the Universe"))
                .body("price", equalTo(1249))
                .body("discountPercentage", equalTo(15.46f))
                .body("rating", equalTo(4.09f))
                .body("stock", equalTo(36))
                .body("brand", equalTo("Samsung"))
                .body("category", equalTo("smartphones"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/3/thumbnail.jpg"))
                .body("images.size()", equalTo(1))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/3/1.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 4)
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("title", equalTo("OPPOF19"))
                .body("description", equalTo("OPPO F19 is officially announced on April 2021."))
                .body("price", equalTo(280))
                .body("discountPercentage", equalTo(17.91))
                .body("rating", equalTo(4.3))
                .body("stock", equalTo(123))
                .body("brand", equalTo("OPPO"))
                .body("category", equalTo("smartphones"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/4/thumbnail.jpg"))
                .body("images.size()", equalTo(4))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/4/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/4/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/4/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/4/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 5)
                .then()
                .statusCode(200)
                .body("id", equalTo(5))
                .body("title", equalTo("Huawei P30"))
                .body("description", equalTo("Huawei’s re-badged P30 Pro New Edition was officially unveiled yesterday in Germany and now the device has made its way to the UK."))
                .body("price", equalTo(499))
                .body("discountPercentage", equalTo(10.58))
                .body("rating", equalTo(4.09))
                .body("stock", equalTo(32))
                .body("brand", equalTo("Huawei"))
                .body("category", equalTo("smartphones"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/5/thumbnail.jpg"))
                .body("images.size()", equalTo(3))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/5/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/5/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/5/3.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 6)
                .then()
                .statusCode(200)
                .body("id", equalTo(6))
                .body("title", equalTo("MacBook Pro"))
                .body("description", equalTo("MacBook Pro 2021 with mini-LED display may launch between September, November"))
                .body("price", equalTo(1749))
                .body("discountPercentage", equalTo(11.02))
                .body("rating", equalTo(4.57))
                .body("stock", equalTo(83))
                .body("brand", equalTo("Apple"))
                .body("category", equalTo("laptops"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/6/thumbnail.jpg"))
                .body("images.size()", equalTo(4))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/6/1.png"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/6/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/6/3.png"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/6/4.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 7)
                .then()
                .statusCode(200)
                .body("id", equalTo(7))
                .body("title", equalTo("Samsung Galaxy Book"))
                .body("description", equalTo("Samsung Galaxy Book S (2020) Laptop With Intel Lakefield Chip, 8GB of RAM Launched"))
                .body("price", equalTo(1499))
                .body("discountPercentage", equalTo(4.15))
                .body("rating", equalTo(4.25))
                .body("stock", equalTo(50))
                .body("brand", equalTo("Samsung"))
                .body("category", equalTo("laptops"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/7/thumbnail.jpg"))
                .body("images.size()", equalTo(4))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/7/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/7/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/7/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/7/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 8)
                .then()
                .statusCode(200)
                .body("title", equalTo("Microsoft Surface Laptop 4"))
                .body("description", equalTo("Style and speed. Stand out on HD video calls backed by Studio Mics. Capture ideas on the vibrant touchscreen."))
                .body("price", equalTo(1499))
                .body("discountPercentage", equalTo(10.23))
                .body("rating", equalTo(4.43))
                .body("stock", equalTo(68))
                .body("brand", equalTo("Microsoft Surface"))
                .body("category", equalTo("laptops"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/8/thumbnail.jpg"))
                .body("images.size()", equalTo(5))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/8/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/8/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/8/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/8/4.jpg"))
                .body("images[4]", equalTo("https://i.dummyjson.com/data/products/8/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 9)
                .then()
                .statusCode(200)
                .body("title", equalTo("Infinix INBOOK"))
                .body("description", equalTo("Infinix Inbook X1 Ci3 10th 8GB 256GB 14 Win10 Grey – 1 Year Warranty"))
                .body("price", equalTo(1099))
                .body("discountPercentage", equalTo(11.83))
                .body("rating", equalTo(4.54))
                .body("stock", equalTo(96))
                .body("brand", equalTo("Infinix"))
                .body("category", equalTo("laptops"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/9/thumbnail.jpg"))
                .body("images.size()", equalTo(5))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/9/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/9/2.png"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/9/3.png"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/9/4.jpg"))
                .body("images[4]", equalTo("https://i.dummyjson.com/data/products/9/thumbnail.jpg"));

        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 10)
                .then()
                .statusCode(200)
                .body("title", equalTo("HP Pavilion 15-DK1056WM"))
                .body("description", equalTo("HP Pavilion 15-DK1056WM Gaming Laptop 10th Gen Core i5, 8GB, 256GB SSD, GTX 1650 4GB, Windows 10"))
                .body("price", equalTo(1099))
                .body("discountPercentage", equalTo(6.18))
                .body("rating", equalTo(4.43))
                .body("stock", equalTo(89))
                .body("brand", equalTo("HP Pavilion"))
                .body("category", equalTo("laptops"))
                .body("thumbnail", equalTo("https://i.dummyjson.com/data/products/10/thumbnail.jpg"))
                .body("images.size()", equalTo(4))
                .body("images[0]", equalTo("https://i.dummyjson.com/data/products/10/1.jpg"))
                .body("images[1]", equalTo("https://i.dummyjson.com/data/products/10/2.jpg"))
                .body("images[2]", equalTo("https://i.dummyjson.com/data/products/10/3.jpg"))
                .body("images[3]", equalTo("https://i.dummyjson.com/data/products/10/thumbnail.jpeg"));
    }

    @Test
    public void testProductNotFound() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 0)
                .then()
                .statusCode(404)
                .body("message", equalTo("Product with id '0' not found"));


        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 123)
                .then()
                .statusCode(404)
                .body("message", equalTo("Product with id '123' not found"));


        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 500)
                .then()
                .statusCode(404)
                .body("message", equalTo("Product with id '500' not found"));


        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 1000)
                .then()
                .statusCode(404)
                .body("message", equalTo("Product with id '1000' not found"));


        given()
                .baseUri(BASE_URL)
                .when()
                .get("/products/{id}", 9999)
                .then()
                .statusCode(404)
                .body("message", equalTo("Product with id '9999' not found"));

    }
}