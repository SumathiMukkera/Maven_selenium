package Hello_world;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Browserstack {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://bstackdemo.com/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//div[text()='Select Username']"));
		username.click();
		WebElement selectuser = driver.findElement(By.xpath("//div[text()='demouser']"));
		selectuser.click();

		WebElement password = driver.findElement(By.xpath("//div[text()='Select Password']"));
		password.click();
		WebElement selectpass = driver.findElement(By.xpath("//div[text()='testingisfun99']"));
		selectpass.click();

		WebElement loginbtn = driver.findElement(By.id("login-btn"));
		loginbtn.click();

		driver.findElement(By.xpath("//span[text()='Apple']")).click();

		WebElement iphone = driver.findElement(By.xpath("//div[@id='1']//div[4]"));
		iphone.click();

		driver.findElement(By.className("float-cart__close-btn")).click();

		WebElement iphone2 = driver.findElement(By.xpath("//div[@id='8']/div[4]"));
		iphone2.click();

		driver.findElement(By.xpath("//span[text()= 'Samsung']")).click();

		WebElement samsung = driver.findElement(By.xpath("//div[@id='10']/div[4]"));
		samsung.click();

		driver.findElement(By.className("float-cart__close-btn")).click();

		WebElement samsung2 = driver.findElement(By.xpath("//div[@id='12']/div[4]"));
		samsung2.click();

		driver.findElement(By.className("buy-btn")).click();

		WebElement fName = driver.findElement(By.id("firstNameInput"));
		fName.sendKeys("test");

		WebElement lName = driver.findElement(By.id("lastNameInput"));
		lName.sendKeys("N");

		WebElement add = driver.findElement(By.id("addressLine1Input"));
		add.sendKeys("123 ave");

		WebElement state = driver.findElement(By.id("provinceInput"));
		state.sendKeys("Mn");

		WebElement zip = driver.findElement(By.id("postCodeInput"));
		zip.sendKeys("55444");
		
		driver.findElement(By.id("checkout-shipping-continue")).click();
		
		WebElement ordernumber =driver.findElement(By.xpath("//div[@class='checkout-form']/div[2]/strong"));
		System.out.println("your order number is = "+ordernumber.getText());
		
		driver.findElement(By.xpath("//button[text()='Continue Shopping »']")).click();
		driver.findElement(By.xpath("//a[@id='logout']")).click();

	}

}
