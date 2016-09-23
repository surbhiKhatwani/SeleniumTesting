package com.first.SleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test
	public void helloWorld()
	{
		System.out.println("Hello World");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\c5241731\\Downloads\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		System.setProperty("java.net.preferIPv4Stack" , "true");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");

	}
}
