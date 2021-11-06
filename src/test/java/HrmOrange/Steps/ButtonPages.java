package HrmOrange.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement btnLogin;
	
	@FindBy(how = How.ID, using = "menu_leave_viewLeaveModule")
	private WebElement btnLeave;
	//Esto es un constructor que tiene el driver activo
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	//Este metodo ejecuta el enter del teclado en el boton login
	public void btnLogin() {
		btnLogin.sendKeys(Keys.ENTER);
	}
	public void btnLogin2() {
		btnLogin.sendKeys(Keys.ENTER);
	}
	public void btnleaveList() {
		btnLeave.click();
	}
}
