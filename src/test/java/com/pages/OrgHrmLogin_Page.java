package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Base_class;
import com.reusabilities.Selenium_Utils;

public class OrgHrmLogin_Page extends Base_class{
	Selenium_Utils su;
	public OrgHrmLogin_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement USERNAME;
	@FindBy(name = "password")
	WebElement PASSWORD;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SUBMIT;
	@FindBy(xpath = "(//span[@title='Unassigned'])[2]")
	WebElement scrolldown;
	
	
	public void logindetails() throws InterruptedException, IOException {
		su=new Selenium_Utils(driver);
		Thread.sleep(4000);
		su.addtext(USERNAME, "Admin");
		su.addtext(PASSWORD, "admin123");
		su.doclick(SUBMIT);
		Thread.sleep(4000);
		su.scroll(scrolldown);
		su.screenshot();
	}
}
