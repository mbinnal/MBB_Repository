package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1May12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.24.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        WebElement link = driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label"));
        //System.out.println();  
        
        System.out.println(link.getText());
	}

}
