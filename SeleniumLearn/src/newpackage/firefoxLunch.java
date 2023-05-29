package newpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLunch 
{


		public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Browser\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://development1-uk.coach.com/account-login");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.findElement(By.id("login-form-email")).sendKeys("baldevkrishna2@gmail.com");
			driver.findElement(By.id("login-form-password")).sendKeys("Test@1234");
			driver.findElement(By.className("login-submit-btn")).click();
		}
		
}