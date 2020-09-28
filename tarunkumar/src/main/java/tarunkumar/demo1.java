package tarunkumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();//max the browser
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("capgemini India");
		search.submit();
		Thread.sleep(2000);
		driver.close();
	}

}
