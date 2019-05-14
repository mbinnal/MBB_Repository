    
package CEEOT;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//creates order through order home page create order link and adds items through plus icon in order home page
//install type as Telco and saves the order


public class AddItems extends Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		AddItems a= new AddItems();
		a.orderAdd();
	}
	public void orderAdd() throws IOException, InterruptedException{
		
		WebDriver driver = login();

		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Order")).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		Thread.sleep(3000);
		driver.findElement(By.id("projectNumber")).click();
		driver.findElement(By.id("projectNumber")).sendKeys("A018NTW");

		driver.findElement(By.id("installLocation")).sendKeys("10909998");
		Thread.sleep(3000);

		driver.findElement(By.id("dijit_form_Button_0_label")).click();
		Thread.sleep(5000);
	wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("first");
		driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	System.out.println("sleeeppp");
		//wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		driver.switchTo().window(tabs2.get(0));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Add Items']")));

		driver.findElement(By.xpath("//*[@title='Add Items']")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		Thread.sleep(4000);
		WebElement a = driver.findElement(By.id("predictiveTxt"));

		a.sendKeys("ATT");
		Thread.sleep(8000);
		a.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.cssSelector("#frcDropDown"));
		b.sendKeys("");
		Thread.sleep(5000);
		b.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(1000);
		b.sendKeys(Keys.ARROW_DOWN);
		DateFormat d1 = new SimpleDateFormat("MM/dd/YYYY");
		Date date = new Date();
		String s1 = d1.format(date);

		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/form/table[2]/tbody/tr[2]/td[2]/span/input"))
				.sendKeys(s1);

		Thread.sleep(6000);
		try {
			// driver.findElement(By.id("widget_dijit_form_TextBox_1")).sendKeys("");
			driver.findElement(By.cssSelector("#dijit_form_TextBox_1")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#dijit_form_TextBox_2")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#dijit_form_TextBox_3")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#dijit_form_TextBox_4")).sendKeys("1");
			Thread.sleep(1000);
		} catch (UnhandledAlertException f) {
			f.printStackTrace();
			try {
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("Alert data==" + alertText);
				alert.accept();
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		}
		driver.findElement(By.id("shipToLocDropDown")).sendKeys("11555408");
		driver.findElement(By.id("dijit_form_Button_0_label")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.close();
		Thread.sleep(1000);
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(0));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#installType > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)"))
				.click();
		driver.findElement(By.id("dijit_MenuItem_13_text")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Save Order']")).click();
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println("alert text is ==" + alert.getText());
		Assert.assertEquals(alert.getText(), "Saved Successfully", "Failed");
		driver.switchTo().alert().accept();
		driver.switchTo().window(tabs4.get(0));
		driver.close();
		
		

	}
}
