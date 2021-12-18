package org.sample;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.utility.BaseClass;

public class TestNG extends BaseClass {
@BeforeClass
private void OpenChrome() {
	launchBrowser();
	fullScreen();
	
}
@AfterClass
private void closingChrome() {
	closeChrome();
}
@BeforeMethod
private void startTime() {
	System.out.println(new Date());
launchUrl("https://www.facebook.com/");
}
@AfterMethod
private void endTime() {
	System.out.println(new Date());
}



}
