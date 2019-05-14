package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.name("userName")).sendKeys("sunil");
        driver.findElement(By.name("password")).sendKeys("sunil");
        driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
       
        if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
        	
        {
        	driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
        	
        	/*WebElement DD = driver.findElement(By.name("passCount"));
        	Select sel = new Select(DD);
        	List<WebElement> data = sel.getOptions();
        	
        	
        	
        	System.out.println(data.size());	
        	
        	for (int i=0;i<data.size();i++) 
        	{
        		System.out.println(data.get(i).getText());
        	}
        	
        	sel.selectByValue("2");
        	
        	*/
        	
        	
        	WebElement DD = driver.findElement(By.name("fromPort"));
        	Select sel = new Select(DD);
        	List<WebElement> data = sel.getOptions();
        	
        	
        	
        	System.out.println(data.size());	
        	
        	for (int i=0;i<data.size();i++) 
        	{
        		System.out.println(data.get(i).getText());
        	}
        	
        	sel.selectByValue("Frankfurt");
        	
        	
        }
	}

}
