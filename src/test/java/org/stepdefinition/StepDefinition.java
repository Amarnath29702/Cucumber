package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojoclass.PojoFaceBook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends PojoFaceBook{

	PojoFaceBook a;
	
	@Given("To navigate the browser")
	public void to_navigate_the_browser() {
	  
		browserlunch();
		launchurl("https://www.facebook.com/");
		max();
		
	}
	@When("To Pass the Invalid Username")
	public void to_Pass_the_Invalid_Username() {
            a = new PojoFaceBook();
			passtext( a.getNametex(), "amar");
		System.out.println("entered username");
	}

	@When("To Pass the Invalid Password")
	public void to_Pass_the_Invalid_Password() {
	   a = new PojoFaceBook();
		passtext(a.getPasstex(), "Greens@123");
		System.out.println("entered password");

	}

	@When("User has Click on Login button")
	public void user_has_Click_on_Login_button() {
	   
		clickwebelement(a.getLoginbtn());
		System.out.println("clicked loginbtn");

		
	}
}
