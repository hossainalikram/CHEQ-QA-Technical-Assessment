package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='ContactName']")
	WebElement ContactName;

	@FindBy(xpath = "//input[@name='contactnumber']")
	WebElement ContactNumber;

	@FindBy(xpath = "//input[@name='pickupdate']")
	WebElement Date;

	@FindBy(xpath = "//select[@name='payment']")
	WebElement Payment;
	
	@FindBy(xpath = "//button[text()=' Register ']")
	WebElement RegBtn;
	
	@FindBy(xpath = "//p")
	List<WebElement> ValidateText;


	public void EnterContactName(String first_name, String last_name) {
		ContactName.clear();
		String contact_name = first_name + " " + last_name;
		ContactName.sendKeys(contact_name);
	}
	
	public void EnterContactNumber(String phone) {
		ContactNumber.sendKeys(phone);
	}
	
	public void EnterPickUpDate(String date) {
		Date.sendKeys(date);
	}
	
	public void EnterPaymentMethod(String payment_method) {
		Select method = new Select(Payment);
		method.selectByVisibleText(payment_method);
	}
	
	public void ClickRegisterButton() {
		RegBtn.click();
	}
	
	public String GetSuccessText() {
		return ValidateText.get(1).getText();
	}
}
