import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getBoardsInOrganization {
    public static void main(String[] args){

        Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/organizations/"+createOrganization.organizationID+"/boards")
                .queryParam("token",createOrganization.APIToken)
                .queryParam("key", createOrganization.APIKey)
                .when().get();

        response.prettyPrint();


    }
}
