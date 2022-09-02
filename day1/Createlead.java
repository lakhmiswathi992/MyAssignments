package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to add the driver to code
		WebDriverManager.chromedriver().setup();
		
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//to add the Url to get opened
		driver.get("http://leaftaps.com/opentaps");
		
		//to maximze the browser
		driver.manage().window().maximize();
		
	   // to find the element
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		if(text.contains("Welcome")) {
			System.out.println("Login succesfull");
		} else {
			System.out.println("Login failed");
			
		}
		// to find the elements
		WebElement elementCrmfsa= driver.findElement(By.linkText("CRM/SFA"));
		elementCrmfsa.click();
		
		WebElement elementLeads= driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead= driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Bottles&Co");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Water");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("bottle");
		
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Samyuktha");
		
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("Marketing");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("bottles with different size");
		
		WebElement elementPrimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementPrimaryEmail.sendKeys("bottles@gmail.com");
		
		WebElement elementgeneralStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		elementgeneralStateProvince.sendKeys("AK");
		
		WebElement elementCreate = driver.findElement(By.className("smallSubmit"));
		elementCreate.click();
		
		if(driver.getTitle().contains("View Lead")){
			System.out.println("Able to view the title View lead");
			}
		else {
			System.out.println("title dont have View Lead");
			
		}
	}
}

