package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		cd.findElement(By.name("email")).sendKeys("steebalaji579@gmail.com");
		cd.findElement(By.name("pass")).sendKeys("balaji3108");
		cd.findElement(By.name("login")).click();
		
		
		
	}

}
