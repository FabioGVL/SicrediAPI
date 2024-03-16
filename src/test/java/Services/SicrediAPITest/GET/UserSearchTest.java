package Services.SicrediAPITest.GET;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserSearchTest {

    private static final String BASE_URI = "https://dummyjson.com/";
    private static final String ENDPOINT = "/users";
    private static final int USER_ID_TO_SEARCH = 1;
    private static final int USER2_ID_TO_SEARCH = 2;

    @BeforeEach
    public void setUp() {
        baseURI = BASE_URI;
    }

    @Test
    public void testUser1SearchById() {
        given()
                .pathParam("id", USER_ID_TO_SEARCH)
                .when()
                .get(ENDPOINT + "/{id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(USER_ID_TO_SEARCH))
                .body("firstName", equalTo("Terry"))
                .body("lastName", equalTo("Medhurst"))
                .body("maidenName", equalTo("Smitham"))
                .body("age", equalTo(50))
                .body("gender", equalTo("male"))
                .body("email", equalTo("atuny0@sohu.com"))
                .body("phone", equalTo("+63 791 675 8914"))
                .body("username", equalTo("atuny0"))
                .body("password", equalTo("9uQFF1Lh"))
                .body("birthDate", equalTo("2000-12-25"))
                .body("image", equalTo("https://robohash.org/hicveldicta.png"))
                .body("bloodGroup", equalTo("A−"))
                .body("height", equalTo(189))
                .body("weight", equalTo(75.4f))
                .body("eyeColor", equalTo("Green"))
                .body("hair.color", equalTo("Black"))
                .body("hair.type", equalTo("Strands"))
                .body("domain", equalTo("slashdot.org"))
                .body("ip", equalTo("117.29.86.254"))
                .body("address.address", equalTo("1745 T Street Southeast"))
                .body("address.city", equalTo("Washington"))
                .body("address.coordinates.lat", equalTo(38.867033f))
                .body("address.coordinates.lng", equalTo(-76.979235f))
                .body("address.postalCode", equalTo("20020"))
                .body("address.state", equalTo("DC"))
                .body("macAddress", equalTo("13:69:BA:56:A3:74"))
                .body("university", equalTo("Capitol University"))
                .body("bank.cardExpire", equalTo("06/22"))
                .body("bank.cardNumber", equalTo("50380955204220685"))
                .body("bank.cardType", equalTo("maestro"))
                .body("bank.currency", equalTo("Peso"))
                .body("bank.iban", equalTo("NO17 0695 2754 967"))
                .body("company.address.address", equalTo("629 Debbie Drive"))
                .body("company.address.city", equalTo("Nashville"))
                .body("company.address.coordinates.lat", equalTo(36.208114f))
                .body("company.address.coordinates.lng", equalTo(-86.58621199999999f))
                .body("company.address.postalCode", equalTo("37076"))
                .body("company.address.state", equalTo("TN"))
                .body("company.department", equalTo("Marketing"))
                .body("company.name", equalTo("Blanda-O'Keefe"))
                .body("company.title", equalTo("Help Desk Operator"))
                .body("ein", equalTo("20-9487066"))
                .body("ssn", equalTo("661-64-2976"))
                .body("userAgent", equalTo("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/534.24 (KHTML, like Gecko) Chrome/12.0.702.0 Safari/534.24"));
    }

    @Test
    public void testUser2SearchById() {
        given()
                .pathParam("id", USER2_ID_TO_SEARCH)
                .when()
                .get(ENDPOINT + "/{id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(USER2_ID_TO_SEARCH))
                .body("firstName", equalTo("Sheldon"))
                .body("lastName", equalTo("Quigley"))
                .body("maidenName", equalTo("Cole"))
                .body("age", equalTo(28))
                .body("gender", equalTo("male"))
                .body("email", equalTo("hbingley1@plala.or.jp"))
                .body("phone", equalTo("+7 813 117 7139"))
                .body("username", equalTo("hbingley1"))
                .body("password", equalTo("CQutx25i8r"))
                .body("birthDate", equalTo("2003-08-02"))
                .body("image", equalTo("https://robohash.org/doloremquesintcorrupti.png"))
                .body("bloodGroup", equalTo("O+"))
                .body("height", equalTo(187))
                .body("weight", equalTo(74f))
                .body("eyeColor", equalTo("Brown"))
                .body("hair.color", equalTo("Blond"))
                .body("hair.type", equalTo("Curly"))
                .body("domain", equalTo("51.la"))
                .body("ip", equalTo("253.240.20.181"))
                .body("address.address", equalTo("6007 Applegate Lane"))
                .body("address.city", equalTo("Louisville"))
                .body("address.coordinates.lat", equalTo(38.1343013f))
                .body("address.coordinates.lng", equalTo(-85.6498512f))
                .body("address.postalCode", equalTo("40219"))
                .body("address.state", equalTo("KY"))
                .body("macAddress", equalTo("13:F1:00:DA:A4:12"))
                .body("university", equalTo("Stavropol State Technical University"))
                .body("bank.cardExpire", equalTo("10/23"))
                .body("bank.cardNumber", equalTo("5355920631952404"))
                .body("bank.cardType", equalTo("mastercard"))
                .body("bank.currency", equalTo("Ruble"))
                .body("bank.iban", equalTo("MD63 L6YC 8YH4 QVQB XHIK MTML"))
                .body("company.address.address", equalTo("8821 West Myrtle Avenue"))
                .body("company.address.city", equalTo("Glendale"))
                .body("company.address.coordinates.lat", equalTo(33.5404296f))
                .body("company.address.coordinates.lng", equalTo(-112.2488391f))
                .body("company.address.postalCode", equalTo("85305"))
                .body("company.address.state", equalTo("AZ"))
                .body("company.department", equalTo("Services"))
                .body("company.name", equalTo("Aufderhar-Cronin"))
                .body("company.title", equalTo("Senior Cost Accountant"))
                .body("ein", equalTo("52-5262907"))
                .body("ssn", equalTo("447-08-9217"))
                .body("userAgent", equalTo("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/534.30 (KHTML, like Gecko) Ubuntu/11.04 Chromium/12.0.742.112 Chrome/12.0.742.112 Safari/534.30"));

    }
}