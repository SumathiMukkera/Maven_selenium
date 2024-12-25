package window_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailLoginTest {
    WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        // Set the path to your ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\Oracle\\Java\\javapath");
        ChromeOptions chrome = new ChromeOptions();
        chrome.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chrome.setAcceptInsecureCerts(true);
        chrome.setScriptTimeout(Duration.ofSeconds(30));
        //chrome.addArguments("--incognito");
        driver = new ChromeDriver(chrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); 
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.selenium.dev/");
        driver.navigate().back();
        //Thread.sleep(Duration.ofSeconds(5));
        driver.navigate().forward();
        System.out.println(driver.getPageSource());
        
           }

    @Test
    public void loginToGmail() throws InterruptedException {
        driver.get("https://accounts.google.com/signin/");
        driver.findElement(By.xpath("//a[@aria-label='Sign in']"));

        // Enter the email
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("sumathi.barupati9@gmail.com");

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        Thread.sleep(2000); // Wait for the password field to appear

        // Enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Ayush@2013");

        WebElement loginButton = driver.findElement(By.id("passwordNext"));
        loginButton.click();

        Thread.sleep(5000); // Wait for the inbox to load
    }

  }
