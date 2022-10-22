package sele;
import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class screens {
public static void main(String[] args) throws IOException, InterruptedException
{
    System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("D:\\sshots\\google.jpeg");
	FileUtils.copyFile(src,dst);

}

}