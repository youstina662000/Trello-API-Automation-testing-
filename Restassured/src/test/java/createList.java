import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class createList {
    public static String listID;
    public static void main(String[] args){
    Response response = RestAssured.given()
            .baseUri("https://api.trello.com/1/lists")
            .queryParam("token",createOrganization.APIToken)
            .queryParam("key",createOrganization.APIKey)
            .queryParam("idBoard",createBoard.boardID)
            .header("Content-Type","application/json")
            .body("{ \"name\" : \"ListNamee\" }")
            .when().post();
       response.prettyPrint();

    JsonPath path=response.jsonPath();
    listID =path.getString("id");
       System.out.println(listID);
}
}
