package SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("txtUsername")).sendKeys("linda.anderson");

        String value = driver.findElement(By.id("txtUsername")).getAttribute("value");
        System.out.println(value);
        
        driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[contains(text(),'Performance')]")).click();
        
        Thread.sleep(4000);
        //driver.findElement(By.partialLinkText("Recru")).click();
        Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement e:links)
        {
        	String linktext= e.getText();
        	System.out.println(linktext);
        }
        
        
	}

}
