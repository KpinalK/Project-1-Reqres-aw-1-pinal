package in.reqres.userinfo;

import in.reqres.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUsersTest extends TestBase {

    @Test
    public void deleteTheUser(){
        given().log().all()
                .pathParam("id",2)
                .when()
                .delete("/users/{id}")
                .then().log().all()
                .statusCode(204);
    }
}
