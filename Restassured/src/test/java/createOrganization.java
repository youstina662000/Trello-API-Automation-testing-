import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class createOrganization {
    public static String organizationID;
    public static String APIToken="ATTA99e6c3748ff9c5df26d9162760e4eddff2bd1670290e61b6f077a1634ffca9510F28C096";
    public static String APIKey="7b4b55baa12d2f7617d315ed46ab6946";
    public static void main(String[] args){

       Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/organizations").queryParam("token",APIToken)

                .queryParam("key",APIKey)
               .header("Content-Type","application/json")
                .body("{ \"displayName\" : \"display\" }")
                .when().post();
       response.prettyPrint();

        JsonPath path=response.jsonPath();
      organizationID =path.getString("id");
       System.out.println(organizationID);
    }

}
