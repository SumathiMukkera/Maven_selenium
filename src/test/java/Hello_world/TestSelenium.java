package Hello_world;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TestSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String URL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath ("//label[text()='Leave Type']/../../div[2]/div[1]/div/div[1]")).click();
		WebElement personal= driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[4]//div[2]//div[1]//div//div[text()='CAN - Personal']"));
		//WebElement personal= driver.findElement(By.xpath("		//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
		personal.click();
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]
		System.out.println(personal.getText());	  
	}
	
}
