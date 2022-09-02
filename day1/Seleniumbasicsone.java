package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumbasicsone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to add driver code that is specific to the browser
		WebDriverManager.chromedriver().setup();
		// to open the browser
		ChromeDriver driver = new ChromeDriver();
		//to open the web application using the URL
		driver.get("http://leaftaps.com/opentaps");
		// to maximize the screen of the browser 
		driver.manage().window().maximize();
		//to close the browser
		// driver.close();
		

	}

}
