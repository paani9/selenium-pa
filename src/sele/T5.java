package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T5 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.googlemaps.com");
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Rajajinagar");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysuru");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@jsaction='search;focus:.fpaneocusTooltip;blur:pane.blurTooltip']")).click();

}
}
