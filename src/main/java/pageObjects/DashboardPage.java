package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//div/h2[@class='page-heading']")
	WebElement dashboardPageHeading;
	
	@FindBy(xpath="//nav/a[@class = 'sidebar-toggle']/span")
	WebElement toggleNavigation;
	
	@FindBy(xpath="//li/a/span[text() = 'Dashboard']")
	WebElement dashboardButton;
	
	@FindBy(xpath="//li/a/span[text() = 'Preferences']")
	WebElement preferencesButton;
	
	@FindBy(xpath="//li/a[text() = 'Account Settings']")
	WebElement accountSettingsLink;
	
	@FindBy(xpath="//li/a[text() = 'Change Password']")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//li/a[text() = 'DocuSign Configuration']")
	WebElement docusignConfigLink;
	
	@FindBy(xpath="//li/a[text() = 'Labor Rules Settings']")
	WebElement laborRuleSettingsLink;
	
	@FindBy(xpath="//li/a[text() = 'Manage Goal Settings']")
	WebElement manageGoalSettingsLink;
	
	@FindBy(xpath="//li/a[text() = 'Manage User Privileges']")
	WebElement manageUserPrivilegesLink;
	
	@FindBy(xpath="//li/a/span[text() = 'Manage Users']")
	WebElement manageUsersLink;
	
	
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDashboardPageHeading() {
		
		return dashboardPageHeading;
		
	}
	
	public WebElement getToggleNavigation() {
		
		return toggleNavigation;
		
	}
	
	public WebElement getDashboardButton() {
		
		return dashboardButton;
		
	}

	public WebElement getPreferencesButton() {
		
		return preferencesButton;
		
	}
	
	public WebElement getAccountSettingsLink() {
		
		return accountSettingsLink;
		
	}
	
	public WebElement getChangePasswordLink() {
		
		return changePasswordLink;
		
	}
	
	public WebElement getDocusignConfigLink() {
		
		return docusignConfigLink;
		
	}
	
	public WebElement getlaborRuleSettingsLink() {
		
		return laborRuleSettingsLink;
		
	}
	
	public WebElement getManageGoalSettingsLink() {
		
		return manageGoalSettingsLink;
		
	}
	
	public WebElement getManageUserPrivilegesLink() {
		
		return manageUserPrivilegesLink;
		
	}
	
	public WebElement getManageUsersLink() {
		
		return manageUsersLink;
		
	}
}
