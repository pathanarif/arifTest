import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForm {
	
	public static void main(String[] args) {
		
		WebElement firstName,lastName,email,genderMale,genderFemale,genderOther,submitButton;
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.get("https://demoqa.com/automation-practice-form");
		
		webDriver.manage().window().maximize();
		
		
		// Locator Find element by id
		
		firstName=webDriver.findElement(By.id("firstName"));
		lastName=webDriver.findElement(By.id("lastName"));
		submitButton=webDriver.findElement(By.id("submit"));
		
		// Find element by xPath
		
		genderMale=webDriver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		genderFemale=webDriver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));
		genderOther=webDriver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]"));
		
		// Find element by Class name
		
		//email=webDriver.findElement(By.className("col-md-9 col-sm-12"));
		
		firstName.sendKeys("Arif");
		lastName.sendKeys("Pathan");
	//	email.sendKeys("abc@gmail.com");
		genderMale.click();
		submitButton.submit();
		
		
	}

}
