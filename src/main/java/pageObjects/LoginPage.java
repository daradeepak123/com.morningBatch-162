package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.SeleniumHelpers;





public class LoginPage {
	WebDriver ldriver;
	
	
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//input[@name='username']") 
	public WebElement uname;

	@FindBy(xpath="//input[@name='password']")
	public WebElement Pwd;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login_btn;
	
	
	public void login()
	{		
		SeleniumHelpers.sendDataElement(ldriver, uname, "Admin", "Username tb");
		SeleniumHelpers.sendDataElement(ldriver, Pwd, "admin123", "passeord tb");
		SeleniumHelpers.clickElement(ldriver, login_btn, "loginButton");
	
	}
	
	
	
	

}
