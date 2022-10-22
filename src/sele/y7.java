package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class y7 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/D7.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssselector("input[id='search-container']")).sendKeys("KGF trailer");
		Thread.sleep(2000);//src="https://i.ytimg.com/vi/t0Q2otsqC4I/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCFcrz2zM6mPUmJiCsC7c7suOzSug"
		driver.findElement(By.name("password")).sendKeys("16888887");
		Thread.sleep(2000);
		driver.findElement(By.className("             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ")).click();
	}
}

