package wsSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WSSeleniumTestJava 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        HomePage homepage = new HomePage();
        
        driver.homepage.visit();
        homepage.hoverProductLine(driver, "cookware");
        homepage.clickProductType(driver, "teakettles");
        homepage.clickProduct(driver);
        homepage.addToCart(driver);
        homepage.checkout(driver);
        
        String cartProductText = homepage.cartProductText(driver);
        homepage.saveForLater(driver);
        String saveForLaterProductText = homepage.saveForLaterProductText(driver);
        Assert.assertEquals(cartProductText, saveForLaterProductText);   
	}

}
