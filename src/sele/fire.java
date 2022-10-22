package sele;


import org.openqa.selenium.chrome.ChromeDriver;


public class fire {
	public static void main(String[] args) 
	{
//		String key="webdriver.gecko.driver";
//		String value="./Software/geckodriver.exe";
//		System.setProperty(key,value);
//		WebDriver driver=new FirefoxDriver();
		
		String key2="webdriver.chrome.driver";
		String value2="./Software/chormedriver.exe";
		System.setProperty(key2,value2);
		ChromeDriver driver=new ChromeDriver();
		
		
		
//		driver2.get("https://twitter.com");
//		
//		Thread.sleep(2000);
//		
//		driver2.get("https://facebook.com");
//		
//		Thread.sleep(5000);
//		driver2.get("https://twitter.com");
//		
//		System.out.println(driver2.getCurrentUrl());
	}


}
