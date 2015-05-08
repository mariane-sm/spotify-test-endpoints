import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Test;
import com.jayway.restassured.RestAssured;

public class ExampleTest {
	
    @Test
    public void testingRestAssured() {
    	
    	RestAssured.proxy("localhost", 3128);    
    	get("https://api.spotify.com/v1/artists/3WrFJ7ztbogyGnTHbHJFl2").then().body("name", equalTo("The Beatles"));
    } 
}


