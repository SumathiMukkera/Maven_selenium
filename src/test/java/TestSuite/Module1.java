package TestSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import javax.management.openmbean.ArrayType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Module1<ArrayT> {

	@Test
	public void test001() {
		
		System.out.println("print this test cases of test1");
	}
	@Test
	public void test002() {
		
		System.out.println("print this test cases of test2");
			}
  @DataProvider
  public Object[][] data001(){
	  
	  Object[][] data = {{"Sumathi.barupati9@gmail.com","Ayush@2013"},{"sumathim.crm@gmail.com","Ayaan$2018"}};
	  return data;
  }
  
  @Test(dataProvider="data001")
  public void dataprovider(String Username, String Password) {
	  
	  System.out.println(Username +" "+ Password);
  }
  @DataProvider(name="data002")
  public Object[] data002() {
	  
	 Object[] data2 ={"Sumathi.barupati9@gmail.com", "Ayush@2013"};
	 
	return data2;
	  
  }
  
  @Test(dataProvider="data002")
  public  void printdata(String index[]) {
	  
	  System.out.println(index[0]);
  }

}

