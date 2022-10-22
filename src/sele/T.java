package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.twitter.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")).click();
	////////////////Thread.sleep(2000);
	////driver.findElement(By.xpath("//input[@autocomplete='username]")).sendKeys("selenium");
	//////Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ammaaaaaa");
	//Thread.sleep(2000);
	//driver.close();
	//class="css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0"

}
}
