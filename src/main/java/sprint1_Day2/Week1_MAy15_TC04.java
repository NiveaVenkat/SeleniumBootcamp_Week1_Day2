package sprint1_Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week1_MAy15_TC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://login.salesforce.com");
		//Maximize the screen
		driver.manage().window().maximize();
		
		//Entering credentials and login
	    driver.findElement(By.id("username")).sendKeys("mars@testleaf.com");
	    driver.findElement(By.id("password")).sendKeys("BootcampSel$123");
	    driver.findElement(By.id("Login")).click();
	    
	    //Click on toggle menu button from the left corner
	    driver.findElement(By.xpath("//div[@role='navigation']")).click();
	    
	    //Click view All and click Sales from App Launcher
	    driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Sales");
	    driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
	    
	    //Creating the JavascriptExecutor interface object and click on accounts object
	    JavascriptExecutor js = (JavascriptExecutor)driver;		
	    js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='Leads']")));
	    
	    WebElement LeadNew = driver.findElement(By.xpath("//a[@title='New']"));
	    LeadNew.click();
	    
	   WebElement Salutationdropdown = driver.findElement(By.xpath("//label[text()='Salutation']"));
	   Salutationdropdown.click();
	   WebElement SelectSalutationdropdown =driver.findElement(By.xpath("//span[@title='Mr.']"));
	   SelectSalutationdropdown.click();
	  
	   WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	   LastName.sendKeys("Kumar");
	   
	   WebElement Comapanyname = driver.findElement(By.xpath("//input[@name='Company']"));
	   Comapanyname.sendKeys("TestLeaf");
	   
	   WebElement LeadSave = driver.findElement(By.xpath("//button[text()='Save']"));
	   LeadSave.click();
	    
	   WebElement element = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
       
       String text=element.getText();
       
       System.out.println(text);
       String expectedHeading = "+Created";
       
       if(expectedHeading.equalsIgnoreCase(expectedHeading))
         	System.out.println("The expected heading is same as actual heading");
   		else
         	System.out.println("The expected heading doesn't match the actual heading");
//    
	}
		
		
	}


