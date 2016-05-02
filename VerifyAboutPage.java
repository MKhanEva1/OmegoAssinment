package OmegoTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OmegoObjectRepository.AbouTOmegaPage;

import OmegoObjectRepository.OmegoHomePage1;
import browserHome.BrowserOpen;


public class VerifyAboutPage extends BrowserOpen {
	
	String browser= "firefox";
	String domain= "http://www.omgeo.com/";
	String title = "Post-Trade Processing Solutions | Omgeo";
	
	AbouTOmegaPage abouTOmegaPage;
	OmegoHomePage1 omegoHomePage1;
	
@Test
	public void Aboutlinkpageverified() throws Exception{
		
	BrowserStart(browser);
	getDomain(domain);
	Thread.sleep(10000);
	String homePageTitle = driver.getTitle();
	//System.out.println(homePageTitle +">>>>>>>>>>>>>>>>>>>");
	//System.out.println(title +">>>>>>>>>>>>>>>>>>>");
	Assert.assertEquals(homePageTitle, title);
	omegoHomePage1.ClicOnAboutLink();
	
	String title = driver.getTitle();
	Assert.assertEquals(title, abouTOmegaPage.AboutOmegaPageTile);
	//driver.close();

		
		
	}
	
	
	
	

}
