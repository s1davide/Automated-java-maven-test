package HrmOrange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import HrmOrange.Steps.ButtonPages;
import HrmOrange.Steps.ListPages;
import HrmOrange.Steps.Questions;


public class LeavePage {
	private ButtonPages buttonPages;
	private Questions questions;
	private ListPages listPages;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'leaveList_txtEmployee_empName']")
	private WebElement inputEmployee;

	// Esto es un constructor que tiene la sesión del driver abierta
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
		this.listPages = new ListPages(driver);
	}

	public void leaveList() {
		buttonPages.btnleaveList();
	}

	public void searchEmployee(String employee, String actions) {
		System.out.println(employee);
		questions.assertWelcome();
		questions.tiempoSegundos(1);
		questions.screenShot();
		inputEmployee.sendKeys(employee);
		buttonPages.btnSearch();
		questions.tiempoSegundos(1);
		questions.screenShot();
		questions.scrollSearch(employee);
		listPages.listActions(employee, actions);
	}

}
