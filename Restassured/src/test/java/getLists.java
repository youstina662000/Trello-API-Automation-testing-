import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getLists {
    public static void main(String[] args){

        Response response = RestAssured.given()
                .baseUri("https://api.trello.com/1/boards/")
                .basePath(createBoard.boardID+"/lists")
                .queryParam("token",createOrganization.APIToken)
                .queryParam("key", createOrganization.APIKey)
                .when().get();

        response.prettyPrint();


    }
}
