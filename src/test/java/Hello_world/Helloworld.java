package Hello_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Helloworld {
	
public static void main(String[] args) {
	//System.setProperty("webdriver.chome.driver","C:\\Users\\rakhy\\Downloads\\Hello_Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
     WebDriver chromedriver = new ChromeDriver(); 
      chromedriver.get("https://amazon.com");
}
	
}
