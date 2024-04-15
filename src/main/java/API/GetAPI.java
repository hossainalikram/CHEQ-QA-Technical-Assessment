package API;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import utils.SeleniumUtils;

public class GetAPI extends SeleniumUtils{
	
	public ArrayList<String> getName() throws IOException
	{
		response = given().spec(requestSpecification()).when().get("/api/");
		String firstName=getJsonPath(response,"results[0].name.first");
		String lastName=getJsonPath(response,"results[0].name.last");
		
		ArrayList<String> name= new ArrayList<String>();
		
		name.add(firstName);
		name.add(lastName);
		
		return name;
	}

}
