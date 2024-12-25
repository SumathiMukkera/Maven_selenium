package Hello_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Saucedemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	
	WebElement loginbutton = driver.findElement(By.name("login-button"));
	loginbutton.click();
	
	driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
	WebElement addcart = driver.findElement(By.id("add-to-cart"));
	addcart.click();
	
	driver.get("https://www.saucedemo.com/inventory-item.html?id=5");
	WebElement addcart1 = driver.findElement(By.id("add-to-cart"));
	addcart1.click();
	
	driver.get("https://www.saucedemo.com/cart.html");
	WebElement checkoutbtn = driver.findElement(By.name("checkout"));
	checkoutbtn.click();
	
	WebElement firstname = driver.findElement(By.id("first-name"));
	firstname.sendKeys("Sumathi");
	
	WebElement lastname = driver.findElement(By.id("last-name"));
	lastname.sendKeys("Mukkera");
	
	WebElement zipcode = driver.findElement(By.id("postal-code"));
	zipcode.sendKeys("55315");
	
	WebElement continuebtn = driver.findElement(By.id("continue"));
	continuebtn.click();
	
	WebElement finishbtn = driver.findElement(By.id("finish"));
	finishbtn.click();

	WebElement backhome = driver.findElement(By.id("back-to-products"));
	backhome.click();
	
	WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
	menu.click();
	Thread.sleep(1000);
	WebElement logout =driver.findElement(By.linkText("Logout"));
	logout.click();
	
	
}
}
