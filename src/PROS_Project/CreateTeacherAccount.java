package PROS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTeacherAccount {
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
	driver.findElement(By.xpath("//span[.='Teacher']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.=' Add Teacher']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='index_number']")).sendKeys("901");
	driver.findElement(By.xpath("//input[@placeholder='Enter full name']")).sendKeys("swetha");
	driver.findElement(By.xpath("//input[@placeholder='Enter name with initials']")).sendKeys("p.swetha");
	driver.findElement(By.xpath("//input[@placeholder='Enter address']")).sendKeys("1/120,Kattereguppe,Banshankari");
	WebElement d1=driver.findElement(By.xpath("//select[.='Select Gender']"));
	Select s1=new Select(d1);
	s1.selectByVisibleText("Female");
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("234-098-9876");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swetha@gmail.com");
	driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys("C:\\Users\\SIVA KUMAR\\Desktop\\d1.jpg");
	driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
	driver.findElement(By.xpath("//span[.='Teacher']")).click();
	driver.findElement(By.xpath("//a[@href='all_teacher.php']")).click();
	WebElement d2 = driver.findElement(By.xpath("//select[@name='example1_length']"));
	Select s2=new Select(d2);
	s2.selectByVisibleText("100");
	
	Thread.sleep(2000);
	driver.close();
	}
}
