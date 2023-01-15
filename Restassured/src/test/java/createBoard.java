import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class createBoard {
    public static  String  boardID;
    public static void main(String[] args){

        Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/boards/")
                .queryParam("idOrganization",createOrganization.organizationID)
                .queryParam("token",createOrganization.APIToken)
                .queryParam("key", createOrganization.APIKey)
                .queryParam("name","First")
                .header("Content-Type","application/json")
                .body("{ \"name\" : \"First\" }")
                .when().post();

        response.prettyPrint();

        JsonPath path=response.jsonPath();
       boardID =path.getString("id");
        System.out.println(boardID);

    }
}
