package wsSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends ProductDetailPage
{	
  
	public ProductPage()
	{
		String url = "http://www.williams-sonoma.com/shop/";
	}
	
	protected void clickProduct(Webdriver driver)
	{
		String product = ".product-thumb";
		Webdriver productClick = driver.findElements(By.cssSelector(product));
		driver.click(productClick);	
	}
}