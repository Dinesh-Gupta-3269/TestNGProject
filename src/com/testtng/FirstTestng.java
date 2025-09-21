package com.testtng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestng {
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drgup\\eclipse-workspace\\TestNGProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=7S_tz1z_5bA");
		driver.close();
	}

}
