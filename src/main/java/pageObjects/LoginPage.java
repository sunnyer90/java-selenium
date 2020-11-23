package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//input[@id = 'inputEmail']")
	WebElement userIdTextbox;
	
	@FindBy(xpath="//input[@id = 'inputPassword']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButtonOnLoginPage;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getuserIdTextbox() {
		
		return userIdTextbox;
		
	}
	
	public WebElement getpasswordTextbox() {
		
		return passwordTextbox;
		
	}
	
	public WebElement getloginButtonOnLoginPage() {
		
		return loginButtonOnLoginPage;
		
	}
	

}
