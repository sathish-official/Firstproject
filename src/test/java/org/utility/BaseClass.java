package org.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void fullScreen() {
		driver.manage().window().maximize();
	}
	public static void passValue(WebElement ele,String pass) {
		ele.sendKeys(pass);
	}
	public static void  clickButton(WebElement ele ) {
		// TODO Auto-generated method stub
ele.click();
	}
	public static void closeChrome() {
		driver.close();
	}
	public static TakesScreenshot tk;
	public static void screenshot(String name) throws IOException {
                tk=(TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File fi=new File("C:\\Users\\Sathishkumar\\eclipse-workspace\\Demo\\target\\Screenshot\\"+name+".jpg");
		
		
		FileUtils.copyFile(temp, fi);
	}
	

}
