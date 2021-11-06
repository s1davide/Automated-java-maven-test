package HrmOrange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import HrmOrange.Steps.ButtonPages;


public class LoginPage {
	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement inputUserName;
	
	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement inputPassword;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}
	public void loginOrange (String user, String pass) {
		inputUserName.sendKeys(user);
		inputPassword.sendKeys(pass);
		buttonPages.btnLogin();
	}
}
