package OmegoTestCases;
import org.testng.annotations.Test;

import OmegoObjectRepository.AbouTOmegaPage;
import OmegoObjectRepository.OmegoHomePage1;
import browserHome.BrowserOpen;

public class VeriifyAlertPage extends BrowserOpen {
	String Browser = "firefox";
	String MyUrL = "http://www.omgeo.com/";
	String expected = "";
	String expectedproduct="Alert";
 
	
	@Test
	
	public void verificationOfOmgeoAlertPage() throws InterruptedException{
		
	    BrowserStart(Browser);
	    getDomain(MyUrL);
	    OmegoHomePage1 myhome = new OmegoHomePage1();
		myhome.ClicOnAboutLink();
        AbouTOmegaPage mytabout = new AbouTOmegaPage();
         mytabout.selectProductFromDopdowm(expectedproduct);
         driver.close();
         
		
		
	}


	
	}
	
	


