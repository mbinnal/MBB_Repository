
package CEEOT;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//creates order through order home page create order link and adds items through plus icon in order home page
//install type as Telco and saves the order 


public class ContinueShoppingMobility extends Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		ContinueShoppingMobility a= new ContinueShoppingMobility();
		a.orderAdd();
	}
	public void orderAdd() throws IOException, InterruptedException{
		
		WebDriver driver=login();
		driver.findElement(By.id("dijit_PopupMenuBarItem_1_text")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("dijit_MenuItem_5_text")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Create Order")).click();

	ArrayList <String> tabs2=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));


	
	Thread.sleep(3000);
	driver.findElement(By.id("projectNumber")).click();
	driver.findElement(By.id("projectNumber")).sendKeys("M439955");
	
	driver.findElement(By.id("installLocation")).sendKeys("10107096");
	Thread.sleep(4000);

	driver.findElement(By.id("dijit_form_Button_0_label")).click();
	WebDriverWait wait= new WebDriverWait(driver,120);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.numberOfWindowsToBe(1));
	ArrayList <String> windows1=new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(windows1.get(0));
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".actionIconGroup > input:nth-child(5)")));
		driver.findElement(By.cssSelector(".actionIconGroup > input:nth-child(5)")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Add Items']")));
		
		driver.findElement(By.xpath("//*[@title='Add Items']")).click();
		Thread.sleep(3000);
		
		ArrayList <String> tabs3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		
		System.out.println("entered newtab");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("predictiveTxt")));
		WebElement a=driver.findElement(By.id("predictiveTxt"));
		a.sendKeys("AL7");
		Thread.sleep(5000);
		a.sendKeys(Keys.ARROW_DOWN);
		//a.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement b1=driver.findElement(By.cssSelector("#milestone"));
		
		Thread.sleep(1000);
		b1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		b1.sendKeys(Keys.ARROW_DOWN);
	
		Thread.sleep(2000);
		WebElement p=driver.findElement(By.id("programType"));

		Thread.sleep(1000);
		p.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		p.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
	driver.findElement(By.id("shipToLocDropDown")).sendKeys("10128517");
	driver.findElement(By.id("dijit_form_TextBox_1")).sendKeys("WR_-RANM-11-02135-LTE 1C-eNode B-LTEDP-QUINTERO COUNTY CLUB-10107096");
	Thread.sleep(2000);
	driver.findElement(By.id("dijit_form_Button_0_label")).click();
	Thread.sleep(1000);
	//wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	driver.close();
	driver.switchTo().window(tabs3.get(0));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Save Order']")));
	


	driver.findElement(By.xpath("//*[@title='Save Order']")).click();
	Thread.sleep(6000);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	Thread.sleep(3000);

		driver.switchTo().window(tabs3.get(0));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Continue Shopping']")));
		driver.findElement(By.xpath("//*[@title='Continue Shopping']")).click();
		
		driver.findElement(By.cssSelector("#category > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")).click();;
		Thread.sleep(2000);
			
			driver.findElement(By.id("dijit_MenuItem_16_text")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.id("criteria")).sendKeys("AL9412BBU-03");
			Thread.sleep(2000);
			driver.findElement(By.id("dijit_form_Button_0_label")).click();
			Thread.sleep(6000);
			
	        driver.findElement(By.id("cart477")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".shoppingIcon")).click();
			driver.findElement(By.id("cartActionsExpand")).click();
			Thread.sleep(2000);

			driver.findElement(By.cssSelector("#dijit_layout_ContentPane_1 > div:nth-child(1) > img:nth-child(8)")).click();
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			
	
		
		

	}
}
