import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteOrganization {
    public static void main(String[] args){

        Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/organizations/"+createOrganization.organizationID)
                .queryParam("token",createOrganization.APIToken)
                .queryParam("key", createOrganization.APIKey)
                .when().delete();

        response.prettyPrint();


    }
}
