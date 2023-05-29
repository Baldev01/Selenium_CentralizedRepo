package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeLunch 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","C:\\Browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://development1-uk.coach.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		 
	}
}