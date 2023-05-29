package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLunch 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Browser\\chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://development1-uk.coach.com/account-login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("login-form-email")).sendKeys("baldevkrishna2@gmail.com");					
	}

}
