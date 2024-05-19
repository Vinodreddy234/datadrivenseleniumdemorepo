package TWOPACK;

import ONEPACK.LoginPage;
import ONEPACK.ProductComparePage;
import ONEPACK.SearchPage;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductCompareTest {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        String Browser="chrome";
        if(Browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (Browser.equals("firefox")) {
            driver=new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage loginPage=new LoginPage(driver);

        loginPage.emailField().sendKeys("suramvinod275@gmail.com");

        loginPage.passwordField().sendKeys("12345");

        loginPage.LoginButton().click();
    }
    @Test
    public void VerifyAddingTheProductForComparisionFromProductDsiplayPage() throws InterruptedException {

        SearchPage sp=new SearchPage(driver);
        sp.searchfield().sendKeys("iMac");
        sp.searchButton().click();

        ProductComparePage pcp=new ProductComparePage(driver);
        Assert.assertTrue(pcp.compareThisProduct().isDisplayed());
        pcp.compareThisProduct().click();
        Assert.assertTrue(pcp.compareThisProduct().isDisplayed());
        Thread.sleep(3000);
        pcp.productCOmparisionLink().click();
        Assert.assertEquals(pcp.productDetailsmessage().getText(),"Product Details");

    }
    @Test
    public void VerifyTwoProductsAddedToComparisonPage() throws InterruptedException {
        SearchPage sp=new SearchPage(driver);
        sp.searchfield().sendKeys("iMac");
        sp.searchButton().click();

        ProductComparePage pcp=new ProductComparePage(driver);
        Assert.assertTrue(pcp.compareThisProduct().isDisplayed());
        pcp.compareThisProduct().click();


       sp.searchfield().clear();
       sp.searchfield().sendKeys("iphone");
       sp.searchButton().click();

       pcp.compareThisProduct().click();
        Thread.sleep(3000);
        pcp.productCOmparisionLink().click();
       Thread.sleep(2000);
       Assert.assertTrue(pcp.iphone().isDisplayed());


    }
}
