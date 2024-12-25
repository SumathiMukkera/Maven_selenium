package Hello_world;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.DOMException;

public class NinjaTutorial {
	
	//WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(" https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form[@id='form-currency']//button//i")).click();
		driver.findElement(By.xpath("//button[text()='€Euro']")).click();
		driver.findElement(By.xpath("//a[text()='Canon EOS 5D']")).click();
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		WebElement selecterror = driver.findElement(By.xpath("//div[text()='Select required!']"));
		System.out.println(selecterror.getText());

		WebElement home = driver
				.findElement(By.xpath("//a[@ href='https://tutorialsninja.com/demo/index.php?route=common/home']"));
		home.click();
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		// driver.findElement(By.xpath("//a[text()='iPhone']/../../../div[3]/button[1]")).click();

		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// WebElement element =
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Success:
		// You have added ']")));
		WebElement element = driver.findElement(By.xpath("//div[text()='Success: You have added ']"));
		//WebElement element = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]"));
		String successmsg = element.getText();
		System.out.println(successmsg);
		driver.findElement(By.xpath("//div[@id='cart']//button[@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//a/strong[text()='View Cart']")).click();
		WebElement qunt = driver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@size='1']"));
		qunt.clear();
		qunt.sendKeys("3");
		WebElement update = driver
				.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]"));
		update.click();
		String Eco = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]"))
				.getText();
		System.out.println("Eco Tax value is " + Eco);
		String Vat = driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]"))
				.getText();
		System.out.println("Vat value is " + Vat);
		String error = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[2]")).getText();
		System.out.println("error msg  " + error);
		driver.findElement(By.xpath(" //span[@class='input-group-btn']//button[2]")).click();

		driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		WebElement alllaptops = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
		alllaptops.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement alllaptops = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Show AllLaptops & Notebooks']")));
		// driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=18");
		driver.findElement(By.xpath("//a[text()='HP LP3065']")).click();
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		String Msg = driver.findElement(By.xpath("//div[text()='Success: You have added ']")).getText();
		System.out.println(Msg);
		driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
		driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
		driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("ABCD123 ");
		driver.findElement(By.xpath("//input[@value='Apply Coupon']")).click();
	String err = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	System.out.println(err);
	
	driver.findElement(By.xpath("//a[text()='Use Gift Certificate '] ")).click();
	driver.findElement(By.xpath("//input[@id='input-voucher']")).sendKeys("AXDFGH123");
	driver.findElement(By.xpath("//input[@value='Apply Gift Certificate']")).click();
	String gifterr = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]")).getText();
	System.out.println(gifterr);
	
	driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
	driver.findElement(By.xpath("//div//input[@id='input-coupon']")).clear();
	driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
	
	driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
	driver.findElement(By.xpath("//*[@id=\"input-voucher\"]")).clear();
	driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
	
	driver.findElement(By.xpath("//a[text()='Checkout']")).click();
	
	driver.findElement(By.xpath("//input[@id='button-account']")).click();
    driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("ss");
    driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys ("tesr");
    driver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys ("sumamukkera@gmail.com");
    driver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys ("28345");
    driver.findElement(By.xpath("//input[@id='input-payment-password']")).sendKeys ("test123");
    driver.findElement(By.xpath("//input[@id='input-payment-confirm']")).sendKeys ("test123");
    driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys ("1234,carver City");
    driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys ("carver");
    driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys ("55151");
   Select dropdown= new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
   dropdown.selectByValue("223");
   Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']")));
   dropdown1.selectByValue("3646");
   WebElement Check = driver.findElement(By.xpath("//input[@name='agree']"));
   Check.click();
  WebElement Register = driver.findElement(By.xpath("//input[@id='button-register']"));
  Register.click();
  
  driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]")).click();
  driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")).sendKeys("testing this application");
  driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
  driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")).click(); 
  driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
	}
	

}
