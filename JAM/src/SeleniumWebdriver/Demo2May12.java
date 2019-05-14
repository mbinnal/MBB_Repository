package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2May12 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
	 			"C:/Mahantesh/Selen/geckodriver-v0.24.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/MBB_Automation_Traning/test.html");
        driver.manage().window().maximize();

	}

}
