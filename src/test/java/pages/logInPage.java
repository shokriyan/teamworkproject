package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class logInPage extends BaseClass{

	@FindBy(id = "txtUsername")
	public WebElement userName;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement logInButton;
	
	@FindBy (xpath = "//img[contains(@src, 'logo')]")
	public WebElement logo;

	public logInPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean logoExist() {
		return logo.isDisplayed();
	}
	
}
