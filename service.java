package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class service {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//div[@id='appnavigator']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()=' SALES']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()=' Services']")).click();
		driver.findElement(By.id("Services_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("sachin");
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("123");
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("123");
		driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("www.htttp");
		
		driver.findElement(By.id("select2-chosen-2")).click();
        WebElement sa = driver.findElement(By.id("s2id_autogen2_search"));
        sa.sendKeys("Days");
        sa.sendKeys(Keys.ENTER);
        
        driver.findElement(By.id("select2-chosen-4")).click();
        WebElement sb = driver.findElement(By.id("s2id_autogen4_search"));
        sb.sendKeys("Migration");
        sb.sendKeys(Keys.ENTER);
        
        WebElement date = driver.findElement(By.id("Services_editView_fieldName_sales_end_date"));
        date.sendKeys("26-04-2022");
	       date.sendKeys(Keys.ENTER);
	       
	       WebElement date1 = driver.findElement(By.id("Services_editView_fieldName_sales_start_date"));
	        date1.sendKeys("26-04-2022");
		       date1.sendKeys(Keys.ENTER);
		       
		       WebElement date2 = driver.findElement(By.id("Services_editView_fieldName_expiry_date"));
		        date2.sendKeys("26-04-2022");
			       date2.sendKeys(Keys.ENTER);
			       
			       WebElement date3 = driver.findElement(By.id("Services_editView_fieldName_start_date"));
			        date3.sendKeys("26-04-2022");
				       date3.sendKeys(Keys.ENTER);
				       
	    driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("100");
	    driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("50");
	    driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("500");
	    
	    driver.findElement(By.name("tax1_check")).click();
	    driver.findElement(By.name("tax3_check")).click();
	    driver.findElement(By.name("tax2_check")).click();
	    
	    driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("complit");
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	         driver.findElement(By.xpath("//a[@class='userName dropdown-toggle pull-right']")).click();
	         driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	    

	}
	
}
