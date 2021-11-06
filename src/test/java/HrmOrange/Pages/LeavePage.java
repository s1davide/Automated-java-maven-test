package HrmOrange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import HrmOrange.Steps.ButtonPages;

public class LeavePage {
	private ButtonPages buttonPages;
	public LeavePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}
	public void leaveList () {
		buttonPages.btnleaveList();
	}
	
}
