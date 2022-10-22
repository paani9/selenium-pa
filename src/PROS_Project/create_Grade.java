package PROS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class create_Grade {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rmgtestingserver/domain/Student_Management_System/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Grade")).click();
		driver.findElement(By.id("name")).sendKeys("Grade 025");
		driver.findElement(By.xpath("//input[@placeholder='Enter admission fee']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@id='hall_charge']")).sendKeys("30");
		driver.findElement(By.xpath("//button[.='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mark_range_text_1")).sendKeys("90-100");
		Thread.sleep(2000);
		driver.findElement(By.name("mark_grade[]")).sendKeys("s");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		 Thread.sleep(2000);
		 WebElement a = driver.findElement(By.xpath("//td[.='Grade 025']"));
		 Thread.sleep(2000);
		 String b=a.getText();
		 Thread.sleep(2000);
		if(b.equals("Grade 025"))
		{ System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		Thread.sleep(2000);
		driver.quit();

}
}
