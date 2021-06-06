package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) {
		
		// Comment this code
		WebDriverManager.edgedriver().setup();
		EdgeDriver browser = new EdgeDriver();
		browser.get("http://leaftaps.com/opentaps");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.className("decorativeSubmit")).click();
		browser.findElement(By.className("decorativeSubmit")).click();
		//browser.close();
		browser.quit();
		
	}

}
