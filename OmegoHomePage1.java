/**
 * 
 */
package OmegoObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author helal khan
 *
 */
public class OmegoHomePage1 {
	
	  WebDriver driver;
	  By AboutLink = By.linkText("About");
	  By leadership= By.xpath("//a[@href='/leadership_team']");
	   
	  
	  
	  
	public void ClicOnAboutLink() throws InterruptedException{
		Thread.sleep(2000);
	for(int i=0;i<31;i++)
		try {
			Thread.sleep(2000);
		driver.findElement(AboutLink).click();
		   System.out.println("About link is found ");
	}
    catch (Exception e){	
   System.out.println("About link is not found ");
   }
	}
	
	
	public void ClickOnLeadership(){
		
		driver.findElement(leadership).click();
		
	}
	
    }
	
	
	
   


