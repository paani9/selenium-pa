package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T4 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tom and Jerry");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/watch?v=t0Q2otsqC4I']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
	Thread.sleep(2000);
    driver.close();
}
}
