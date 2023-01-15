import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getOrganizationsOfMember {
    public static void main(String[] args){

        Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/members/me/idOrganizations")
                .queryParam("token",createOrganization.APIToken)
                .queryParam("key", createOrganization.APIKey)
                .when().get();

        response.prettyPrint();


}}
