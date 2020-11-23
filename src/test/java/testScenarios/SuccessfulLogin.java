package testScenarios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import conf.base;

import org.testng.AssertJUnit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class SuccessfulLogin extends base {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(SuccessfulLogin.class.getName()); 
	
	@BeforeTest
	public void initialize() throws FileNotFoundException, IOException {
		driver = initializeDriver();
		log.info("Driver has been initialized");
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.getLoginButton().click();
		LoginPage lp = new LoginPage(driver);
		lp.getuserIdTextbox().sendKeys("devdemo");
		lp.getpasswordTextbox().sendKeys("Drs@2020");
		lp.getloginButtonOnLoginPage().click();
		DashboardPage dp = new DashboardPage(driver);
		log.info("Landing page has been displayed");
		Assert.assertTrue(dp.getDashboardPageHeading().getText().contains("Dashboard"));
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
