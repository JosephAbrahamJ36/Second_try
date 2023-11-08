package com.reusabilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.library.Base_class;

public class Selenium_Utils extends Base_class {
	
	
	public Selenium_Utils(WebDriver driver) {
		this.driver=driver;
	}
	
public void addtext(WebElement element,String text) {
		element.sendKeys(text);
}


	public void doclick(WebElement element) {
		element.click();

	}
	public void screenshot() throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		File source= ss.getScreenshotAs(OutputType.FILE);
		
		File target= new File("src\\main\\resources\\screenshots\\screenshots.admin1.png");
		
		FileUtils.copyFile(source, target);

	}
	
	public void windowhandlingchild() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String newwindow: child) {
			driver.switchTo().window(newwindow);
		}
	}
		public void scroll(WebElement element) {
		
			JavascriptExecutor scroll=(JavascriptExecutor)driver;
			scroll.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
}
