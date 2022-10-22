package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a1 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/a1.html");
Thread.sleep(2000);
WebElement ele1=driver.findElement(By.xpath("//input[@value='Pavani']"));
WebElement ele2=driver.findElement(By.xpath("//input[@name='pwd']"));
ele1.sendKeys(Keys.CONTROL+"ac");
Thread.sleep(2000);

ele2.sendKeys(Keys.CONTROL+"av");
	}
}





















