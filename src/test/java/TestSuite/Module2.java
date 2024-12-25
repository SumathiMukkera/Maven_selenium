package TestSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2 {

	@BeforeClass
	public void beforeaclass() {
		System.out.println("excetute before a class");
	}

	@AfterClass
	public void afteraclass() {
		System.out.println("excetute after a class");
	}

	@BeforeMethod
	public void beforeexecution() {

		System.out.println("execute before a method");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("execute before a test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}

	@Test
	public void test001() {

		System.out.println("print this test cases of test1");
	}

	@Test
	public void test004() {
		System.out.println("please excecute this test case 4");
	}

	@Test
	public void test005() {
		System.out.println("please excecute this test case 5");
	}

	@AfterMethod
	public void aftermethod() {

		System.out.println("execute after a method");
	}

}
