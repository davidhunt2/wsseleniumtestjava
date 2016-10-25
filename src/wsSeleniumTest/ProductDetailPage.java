package wsSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends CheckoutPage
{

	public ProductDetailPage()
	{
		String url = "http://www.williams-sonoma.com/products/";
	}
	
	protected void addToCart(Webdriver driver)
	{
		String addButton = ".add-to-basket";
		Webdriver addProduct = driver.findElements(By.cssSelector(addButton));
		driver.waitForVisible(addProduct);
		driver.click(addProduct);
	}
	
	protected void checkout(Webdriver driver)
	{
		String checkoutButton = "#btn-checkout";
		Webdriver checkoutButtonProduct = driver.findElements(By.ID(checkoutButton));
		driver.waitForVisible(checkoutButtonProduct);
		driver.click(checkoutButtonProduct);
	}
}