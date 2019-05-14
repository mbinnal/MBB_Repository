
package CEEOT;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//creates order through create order link on order home screen

public class CreateOrder extends Login {
	
	
	public void order() throws IOException, InterruptedException{
		WebDriver driver = login();
		driver.findElement(By.linkText("Create Order")).click();
		driver.manage().window().maximize();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(3000);
		driver.findElement(By.id("projectNumber")).click();
		driver.findElement(By.id("projectNumber")).sendKeys("A018NTW");
		driver.findElement(By.id("installLocation")).sendKeys("10909998");
		Thread.sleep(2000);
		driver.findElement(By.id("dijit_form_Button_0_label")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		/*String number = alert.getText();
		 Assert.assertTrue(number.contains("Order Created"), "Failed");
	*/
		alert.accept();
		driver.switchTo().window(tabs2.get(0));
 driver.close();
	
		

	}
	public static void main(String[] args) throws InterruptedException, IOException {
		CreateOrder a= new CreateOrder();
		a.order();
	}
}
