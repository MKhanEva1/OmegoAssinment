package OmegoTestCases;

import org.testng.annotations.Test;

import OmegoObjectRepository.AbouTOmegaPage;
import OmegoObjectRepository.LeadershipPage;
import OmegoObjectRepository.OmegoHomePage1;
import browserHome.BrowserOpen;

public class VerifyTextForMember extends BrowserOpen {
	
	String myBrowser = "firefox";
	String Myurl="http://www.omgeo.com/";
	String Text ="Joan Mezzanotte";
	
	@Test
	public void VerifyTextforJoan() throws InterruptedException {
		
		    BrowserStart(myBrowser );
		    getDomain(Myurl);
		    OmegoHomePage1 om = new OmegoHomePage1();
		    om.ClickOnLeadership();
		    LeadershipPage ld = new  LeadershipPage();
		    ld.ClickOnJoanMozzanoteDEtails();
		    ld.VerifyTextOfJoanMozzanote(Text);
		    driver.close();
		 	
		
		
		
		
	}
	

}
