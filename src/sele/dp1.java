package sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dp1 {
	
		public static void main(String[] args) throws InterruptedException
		{
			
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		Set<String> whs = driver.getWindowHandles();
		int count=whs.size();
		System.out.println(count);
		
		for(String b:whs)
		{driver.switchTo().window(b);
			String c = driver.getTitle();
		System.out.println(c);
		
        System.out.println(b);
        
        driver.close();
        }
}
}
