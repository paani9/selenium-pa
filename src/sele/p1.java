package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) throws InterruptedException {
		
	
//href="#contact_user"
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://122.166.192.191:9003/with-dogs/17.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@href='#contact_user'])")).click();
}
}
