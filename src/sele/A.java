package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class A {
public static void main(String[] args) throws InterruptedException
{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.instagram.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("123456789");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A1234567890");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.close();
}
}
