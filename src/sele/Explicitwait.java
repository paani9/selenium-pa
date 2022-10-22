package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://localhost/login.do");
Thread.sleep(2000);
//webElement ele=driver.f

}
}
