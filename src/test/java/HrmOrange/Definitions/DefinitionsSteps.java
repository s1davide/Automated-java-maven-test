package HrmOrange.Definitions;

import org.openqa.selenium.WebDriver;

import HrmOrange.Pages.LeavePage;
import HrmOrange.Pages.LoginPage;
import HrmOrange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private LeavePage leavePage = new LeavePage(driver);

	@Given("^abrir el navegador$")
	public void openNavigator() {
		this.conexion = new Conexion();
		this.driver = this.conexion.openNavigator();

	}
	
	@And("^ingresar el usuario (.*) y la contraseña (.*)$")
	public void loginOrange(String user, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginOrange( user, pass);
	}
	
	@When("^Ingresar a la opcion leave list$")
	public void leaveList() {
		this.leavePage = new LeavePage(driver);
		this.leavePage.leaveList();
	}
}