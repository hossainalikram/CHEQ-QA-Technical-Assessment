package tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import API.GetAPI;
import io.restassured.specification.RequestSpecification;
import pageObject.FormPage;
import testUtils.BaseTest;

public class Test_Form extends BaseTest{
	RequestSpecification res;
	GetAPI api = new GetAPI();
	
	@Test(dataProvider = "getData", groups = { "Regression" })
	public void FormTest(HashMap<String, String> input) throws IOException {
		FormPage fromPage = new FormPage(driver);
		fromPage.EnterContactName(api.getName().get(0), api.getName().get(1));
		fromPage.EnterContactNumber(input.get("phone"));
		fromPage.EnterPickUpDate(input.get("date"));
		fromPage.EnterPaymentMethod(input.get("payment_method"));
		fromPage.ClickRegisterButton();
		
		Assert.assertEquals(fromPage.GetSuccessText(), input.get("validation_text"));
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")
				+ "//src//test//java//testData//testdata.json");

		return new Object[][] { { data.get(0) } };
	}
	

}
