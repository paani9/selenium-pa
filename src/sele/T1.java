package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T1 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU' and @type='text']")).sendKeys("selenium");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("selenium");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

}
}