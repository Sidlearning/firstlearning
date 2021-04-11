package mylearning;
import static io.restassured.RestAssured.*;

public class ApiTest {
	
	public static void getResponseBody() {
		
	given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	getResponseBody();

	}

}
