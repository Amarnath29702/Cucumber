package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCucumber {

	
	

 
		public static WebDriver driver;
		
		public static void browserlunch() {
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
		}
		
		public static void launchurl(String url) {
			driver.get(url);

		}
		
		
		public static void closetap() {
		driver.close();
		}


		public static void quit() {
		driver.quit();

		}
		
		public void refreshBase1() {
			driver.navigate().refresh();
		}
		
		
		
		
		public static void currentpageurl() {
			String url =driver.getCurrentUrl();
	      System.out.println(url);
		}
		public static void currentpagetitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		
		public static void passtext(WebElement ele,String object) {
			ele.sendKeys(object);
		}
		
		public static void clickwebelement(WebElement btnelement) {
	      btnelement.click();
		}
		
		public static void max() {
			driver.manage().window().maximize();

		}
		 
		 
		

	

	
}
