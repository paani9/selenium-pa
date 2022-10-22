package sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dp2 {
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.name("NewWindow")).click();
	Set<String> whs = driver.getWindowHandles();
	String p_id = driver.getWindowHandle();
	System.out.println(p_id);
	int count=whs.size();
	System.out.println(count);
	
	for(String b:whs)
	{driver.switchTo().window(b);
		String c = driver.getTitle();
	System.out.println(c);
	
    System.out.println(b);
    if(p_id.equals(b))
    {
   
    }
    else
    {
    	 driver.close();
    }
	}
}
}
