package HrmOrange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ListPages {
	private WebDriver driver;
	public ListPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void listActions(String employee, String actions) {
		WebElement searchTable = driver.findElement(By.xpath("//tr/td/a[contains(text(),'" + employee
		+ "')]/../../td[8]//select/option[text() = '" + actions + "']"));
		searchTable.click();
		}
}
