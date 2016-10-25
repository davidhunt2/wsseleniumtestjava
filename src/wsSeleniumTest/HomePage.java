package wsSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends ProductPage
{
	
	private WebElement element = null;
	private String url;
	
  
	public HomePage()
	{
		String url = "http://www.williams-sonoma.com/";
	}
	
	protected void visit(Webdriver driver)
	{
		String overlay = ".stickyOverlayMask";
		String overlayMin = ".stickyOverlayMinimizeButton";
		Webdriver overlayScreen = driver.findElement(By.cssSelector(overlay));
		Webdriver overlayClose = driver.findElement(By.cssSelector(overlayMin));
	    if (isVisible(overlayScreen)) 
	    {
	        click(overlayClose)
	    };
	    driver.get(url);		
	}
	
	protected void hoverProductLine(Webdriver driver, String productLine)
	{
		String cookware = ".topnav-cookware";
		Webdriver productLineHover = driver.findElements(By.cssSelector(productLine));
		driver.moveToObject(productLineHover);	
	}
	
	protected void clickProductType(Webdriver driver, String productType)
	{
		String teaKettles = "Tea Kettles";
		Webdriver productTypeClick = driver.findElements(By.cssSelector(productType));
		driver.click(productTypeClick);	
	}
}
