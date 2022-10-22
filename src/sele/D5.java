package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/d5.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("pavani");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("16888887");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
	}
	

}
