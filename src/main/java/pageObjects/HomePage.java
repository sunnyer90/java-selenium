package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href = '/login']")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@id = 'inputEmail']")
	WebElement userIdTextbox;
	
	@FindBy(xpath="//input[@id = 'inputPassword']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButtonOnLoginPage;
	
	@FindBy(xpath="//div/h2[@class='page-heading']")
	WebElement dashboardPageHeading;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getLoginButton() {
		
		return loginButton;
		
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
	
	public WebElement getDashboardPageHeading() {
		
		return dashboardPageHeading;
		
	}
	
	

}
