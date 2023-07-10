package org.pojoclass;

import org.base.BaseCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFaceBook extends BaseCucumber{

	public PojoFaceBook() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement nametex;
	
	public WebElement getNametex() {
		return nametex;
	}



	@FindBy(xpath ="//input[@id='pass']")
	private WebElement passtex;
	
	public WebElement getPasstex() {
		return passtex;
	}
	
	@FindBy(xpath ="//button[@name='login']")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}



	
		
	
	
}
