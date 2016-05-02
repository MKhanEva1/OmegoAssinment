package OmegoObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LeadershipPage {
	WebDriver driver;
	By JoanMezzanote = By.partialLinkText("joan-mezzanotte-bio");
	By element = By.id("simplemodal-container");
	
	
	
	public void ClickOnJoanMozzanoteDEtails() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(JoanMezzanote).click();
			
	}
	

	public void VerifyTextOfJoanMozzanote(String text ) throws InterruptedException{
	
	Thread.sleep(2000);
	driver.switchTo().frame((WebElement) By.id("simplemodal-data"));
	WebElement rawText=	driver.findElement(element);
	String actualText=  rawText.getText();
	Assert.assertEquals(actualText, text);
	driver.close();
	driver.switchTo().defaultContent();
	
	
		
		
		
		
	}



}
