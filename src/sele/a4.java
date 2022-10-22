package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a4 {
public static void main(String[] args) throws InterruptedException
{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@title='Sign In']")).click();
driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("pawanikalyani");
	driver.findElement(By.xpath("//input[@name='signin']")).click();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pl,okmijn*");

driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
	

	
	
}
}