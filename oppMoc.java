package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class oppMoc {

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
				driver.findElement(By.xpath("//span[text()=' Opportunities']")).click();
				driver.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD")).click();
				driver.findElement(By.name("potentialname")).sendKeys("sachin");
				driver.findElement(By.name("related_to_display")).sendKeys("Qspider");
				driver.findElement(By.name("contact_id_display")).sendKeys("Qspider");
                driver.findElement(By.id("Potentials_editView_fieldName_amount")).sendKeys("1000");
                driver.findElement(By.id("select2-chosen-2")).click();
               WebElement s = driver.findElement(By.id("s2id_autogen2_search"));
               s.sendKeys("Existing Business");
               s.sendKeys(Keys.ENTER);
               
               driver.findElement(By.id("select2-chosen-4")).click();
               WebElement sa = driver.findElement(By.id("s2id_autogen4_search"));
               sa.sendKeys("Cold Call");
               sa.sendKeys(Keys.ENTER);
               
               driver.findElement(By.id("select2-chosen-8")).click();
               WebElement sb = driver.findElement(By.id("s2id_autogen8_search"));
               sb.sendKeys("Qualification");
               sb.sendKeys(Keys.ENTER);
               
              WebElement date = driver.findElement(By.id("Potentials_editView_fieldName_closingdate"));
               date.sendKeys("26-04-2022");
      	     date.sendKeys(Keys.ENTER);
      	     
      	     driver.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("abc");
      	     driver.findElement(By.id("Potentials_editView_fieldName_probability")).sendKeys("1000");
      	     driver.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("1000");
  	         driver.findElement(By.id("campaignid_display")).sendKeys("abc");
  	         driver.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys("abcdefg");
  	   
  	         driver.findElement(By.xpath("//button[text()='Save']")).click();
  	         driver.findElement(By.xpath("//a[@class='userName dropdown-toggle pull-right']")).click();
  	         driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	}

}