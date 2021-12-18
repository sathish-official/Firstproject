package org.sample;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utility.*;
public class Sample extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		launchBrowser();
		launchUrl("https://www.techlistic.com/p/demo-selenium-practice.html");
		fullScreen();
//		screenshot("first");
//		FBLoginPojo f=new FBLoginPojo();
//		
//		passValue(f.getTxtUser(), "ASDF");
//		passValue(f.getTxtPass(), "QWER");
//		Thread.sleep(2000);
////		Actions a=new Actions(driver);
////		WebElement clic = driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']']"));
////		a.moveToElement(clic).click().build().perform();
////	clickButton(f.getBtnClick());
//		screenshot("second");
//	
	WebElement table = driver.findElement(By.xpath("//table[@border='1']"));
	
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	for (int i = 0; i < rows.size(); i++) {
		
		WebElement row = rows.get(i);
		System.out.println(row.getText());
		
		
	}
	
	}

}
