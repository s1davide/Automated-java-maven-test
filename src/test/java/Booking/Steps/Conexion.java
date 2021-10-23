package Booking.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;

public class Conexion {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver95.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.booking.com/index.es.html");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
//		WebElement searchInput = driver.findElement(By.id("ss"));
//		searchInput.sendKeys("Ucrania");
//		searchInput.submit();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
//		WebElement fiveStarsFilter = driver.findElement(By.id("__bui-102"));
//		System.out.println("Executed action");
//		fiveStarsFilter.click();		
		return this.driver;

	}
	

}
