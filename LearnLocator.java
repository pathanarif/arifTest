import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {
	
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.get("https://demoqa.com/automation-practice-form");
		
		webDriver.manage().window().maximize();
		
		// Using Id locator
		
		WebElement firstName=webDriver.findElement(By.id("firstName"));
		
		firstName.sendKeys("Arif");
		
		
	    WebElement lastName=webDriver.findElement(By.id("lastName"));
		
	    lastName.sendKeys("Pathan");
		
	//    WebElement email =webDriver.findElement(By.className("mr-sm-2 form-control"));
		
	//	email.sendKeys("Pathan");
	   

		// Using Name locator
		
		WebElement male=webDriver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		
		
		male.click();
	
	}

}
