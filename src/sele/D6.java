package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D6{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/d6.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("pavani");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("16888887");
		Thread.sleep(2000);
		driver.findElement(By.className("             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ")).click();
	}
}