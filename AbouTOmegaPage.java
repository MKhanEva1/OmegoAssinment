package OmegoObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserHome.BrowserOpen;

public class AbouTOmegaPage extends BrowserOpen {
	
	public static final String AboutOmegaPageTile= "Post-Trading Solutions for the Global Investment Industry | Omgeo";

	By findproduct = By.className("chzn-single chzn-single-with-drop");
	
	
	
	public void selectProductFromDopdowm( String myproduct) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait(5);
	    driver.findElement(findproduct).click();
		Thread.sleep(1000);
		Select myselect = new Select(null);
		myselect.selectByVisibleText(myproduct);
		
		
		
		
	}
	
	
	
	

}
