package in.reqres.myfirsttest;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {

    @Test
    public void getAllUsersInfo(){
        Response response = given()
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
