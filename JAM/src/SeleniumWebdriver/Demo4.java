package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        
        driver.manage().window().maximize();
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement e:links)
        {
        	String linktext= e.getText();
        	System.out.println(linktext);
        }

       /* 
        for(int i=0;i<links.size();i++)
        {
        driver.navigate().to(e);
        Thread.sleep(3000);
        }*/
	}

}
