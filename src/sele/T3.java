package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T3 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.Twitter.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("selenium");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(2000);
driver.close();
	
}
}
