package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {
		public static void main(String[] args)throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/t2.html");
				Thread.sleep(4000);
				driver.findElement(By.id("a1")).click();
			}
		
		}



