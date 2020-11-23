package testScenarios;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import conf.base;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ValidateNavigationBar extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateNavigationBar.class.getName()); 
	
	@BeforeTest
	public void initialize() throws FileNotFoundException, IOException {
		driver = initializeDriver();
		log.info("Driver has been initialized");
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validatePreferencesSection() throws IOException, InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.getLoginButton().click();
		LoginPage lp = new LoginPage(driver);
		lp.getuserIdTextbox().sendKeys("devdemo");
		lp.getpasswordTextbox().sendKeys("Drs@2020");
		lp.getloginButtonOnLoginPage().click();
		DashboardPage dp = new DashboardPage(driver);
		log.info("Landing page has been displayed");
		AssertJUnit.assertTrue(dp.getDashboardPageHeading().getText().contains("Dashboard"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(dp.getToggleNavigation()));
		dp.getToggleNavigation().click();
		Assert.assertTrue(dp.getPreferencesButton().getText().contains("Preferences"));
		dp.getPreferencesButton().click();
		Assert.assertTrue(dp.getAccountSettingsLink().getText().contains("Account Settings"));
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
