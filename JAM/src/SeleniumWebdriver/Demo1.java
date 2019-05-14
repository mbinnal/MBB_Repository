package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.manage().window().maximize();
        String ExpectedTittle = "OrganeHRM" ;
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input.button")).click();
        
        String ActualTittle = driver.getTitle();
        
        if (ExpectedTittle.equals(ActualTittle)) {
        	
        	System.out.println("IF the title is same then do logout");
        	Thread.sleep(3000);
        	driver.findElement(By.id("//*[@id=welcome")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.linkText("Logout")).click();
        	driver.close();
        }
        else 
        	
        {
        	System.out.println("Tittle is not same");
        	driver.close();
        }
        
        
        //driver.close();
       // driver.quit();
	}

}
