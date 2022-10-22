package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a2 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com");
	Thread.sleep(2000);
    driver.manage()





}
