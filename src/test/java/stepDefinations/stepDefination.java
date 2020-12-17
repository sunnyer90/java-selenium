package stepDefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import conf.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testScenarios.SuccessfulLogin;

public class stepDefination extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(SuccessfulLogin.class.getName()); 
	
	
	@Given("^Initialize the browser$")
	public void initialize_browser() throws FileNotFoundException, IOException{
		driver = initializeDriver();			
	}
	
	@When("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_Site(String arg1){
		driver.get(prop.getProperty(arg1));
	}
	
	@And("^User clicks on Login button$")
	public void login_button_click(){
		HomePage hp = new HomePage(driver);
		hp.getLoginButton().click();
	}
	
	@And("^User enters \"([^\"]*)\" as Username and \"([^\"]*)\" as Password followed by clicking on Login button$")
	public void enter_credentials(String username, String password){
		LoginPage lp = new LoginPage(driver);
		lp.getuserIdTextbox().sendKeys(username);
		lp.getpasswordTextbox().sendKeys(password);
		lp.getloginButtonOnLoginPage().click();
	}
	
	@Then("^Verify that user is able to see dashboard page$")
	public void user_validates_landing_page() {
		DashboardPage dp = new DashboardPage(driver);
		Assert.assertTrue(dp.getDashboardPageHeading().getText().contains("Dashboard"));
	}
	
	@And("^Close the browser$")
	public void browser_close(){
		driver.quit();
	}
	
}
