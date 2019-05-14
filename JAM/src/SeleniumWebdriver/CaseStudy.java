package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//Launching sample website
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		String underconsTitle = "Under Construction: Mercury Tours";
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		String[] linktext = new String[(link.size())];
		
		int i =0;
		
		//Extract the link Text or each link Elements
		
		for (WebElement e:link)
			
		{
			linktext[i] =e.getText();
			i++;
			
		}
		
		
		//Test weather each link is working or not working
		
		for (String t:linktext)
		{
			Thread.sleep(3000);
			driver.findElement(By.linkText(t)).click();
			
			if (driver.getTitle().contains(underconsTitle))
			
			{
				System.out.println("\"" + t+ "\" + is underconstruction");
			}
			
			else
				
			{
				System.out.println("\"" + t+ "\" + is working");
			}
			
			driver.navigate().back();
		}
		
		
		
		
	}

}
