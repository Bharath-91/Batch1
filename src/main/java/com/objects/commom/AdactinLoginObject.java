package com.objects.commom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class AdactinLoginObject extends BasePage {
	
	public AdactinLoginObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
	
	public WebElement getusername() {
		return username;
	}
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement password;
	
	public WebElement getpassword() {
		return password;
	}
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement loginbutton;
	
	public void clickloginbutton() {
		loginbutton.click();
	}
	
	@FindBy(xpath = "//*[@id=\"username_show\"]")
	private WebElement welcome;
	
	public WebElement getwelcome() {
		return welcome;
		
	}
}
