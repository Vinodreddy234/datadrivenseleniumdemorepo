package TWOPACK;

import ONEPACK.LoginPage;
import ONEPACK.SearchPage;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTest {
    WebDriver driver;
    @BeforeMethod
    public void setup() throws InterruptedException {
        String Browser="firefox";
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
    @Test(priority = 1)
    public void VerifySearchExistingProductName(){
        System.out.println("my work is sucessfully updated");
        SearchPage sp=new SearchPage(driver);
        sp.searchfield().sendKeys("iMac");
        sp.searchButton().click();
        String ActualText = sp.iMacItem().getText();
        Assert.assertEquals(ActualText,"iMac");
    }
    @Test(priority = 2)
public void VerifySearchNonExistingProdoct(){
        SearchPage sp=new SearchPage(driver);
        sp.searchfield().sendKeys("Fitbit");
        sp.searchButton().click();
        String actual = sp.noproduct().getText();
        Assert.assertEquals(actual,"There is no product that matches the search criteria.");

    }
    @Test(priority = 3)
    public void VerifyUsingSearchCriteriaField(){
        SearchPage sp=new SearchPage(driver);
        sp.searchButton().click();
        sp.sarchCriteriaField().sendKeys("iMac");
        sp.searchbuttonUnderSearchCriteria().click();
        Assert.assertTrue(sp.iMacItem().isDisplayed());



    }
    @Test(priority = 4)
    public void VerifySearchbyselectingthecategoryofproduct() {
        SearchPage sp = new SearchPage(driver);
        sp.searchButton().click();
        sp.sarchCriteriaField().sendKeys("iMac");

        Select category = new Select(sp.allcategory());
        category.selectByValue("27");
        sp.searchbuttonUnderSearchCriteria().click();
         Assert.assertTrue(sp.iMacItem().isDisplayed());


    }
    @Test(priority = 5)
    public void VerifyNavigateProductCamparePageFromSearchPage(){
        SearchPage sp = new SearchPage(driver);
        sp.searchButton().click();
        sp.sarchCriteriaField().sendKeys("iMac");
        sp.searchbuttonUnderSearchCriteria().click();
        sp.productCompare().click();
        Assert.assertEquals(sp.ProductComparePage().getText(),"You have not chosen any products to compare.");


    }
    @AfterMethod
    public void close(){
        driver.quit();

    }
}
