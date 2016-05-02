package browserHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserOpen {
	public static WebDriver driver;
	
	
	public static WebDriver BrowserStart(String browsername){
		if (browsername.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome"))
			
			{driver=new ChromeDriver();}
		
		
			else if (browsername.equalsIgnoreCase("IE"))
				{driver= new InternetExplorerDriver();}
				
			else{
				System.out.println("No driver found");
			}
		//driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void getDomain(String URL){
		driver.get(URL);
	}
	public static boolean isTextPresent(String text, WebElement ele){
		boolean textPresent = false;
		if((ele.getText().trim()).equalsIgnoreCase(text)){
			textPresent= true;
		}
		return textPresent;
	}
	public void afterClass() {

		driver.quit();

		}
		
	}
	
	
	


