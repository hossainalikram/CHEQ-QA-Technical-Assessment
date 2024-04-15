package testUtils;

import java.io.IOException;
import java.time.Duration;

import utils.SeleniumUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest extends SeleniumUtils {

	@BeforeMethod
	public void ConfigureAppium() throws IOException {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		
		driver.get(getGlobalValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
