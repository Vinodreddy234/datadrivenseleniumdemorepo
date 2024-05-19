package TWOPACK;

import ONEPACK.homepage;
import ONEPACK.registerpage;
import Utilitys.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Date;

public class registertest {
    WebDriver driver;
   @Test(priority = 1)
    public void ManditoryFieldsOnly(){

        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        registerpage  rp=new registerpage(driver);
        rp.firstnamefield().sendKeys("vinodreddy");
        rp.lastnamefield().sendKeys("suram");
        rp.emailfield().sendKeys(utilities.genarateWithEmailTimeStamp());
        rp.telephonefield().sendKeys("234567789");
        rp.passwordfield().sendKeys("12345");
        rp.passwordconfirm().sendKeys("12345");
        rp.polacyfield().click();
        rp.continuebutton().click();



    }
    @Test(priority = 2)
    public void AccountRegisterByAllFields(){

        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerpage  rp=new registerpage(driver);
        rp.firstnamefield().sendKeys("vinodreddy");
        rp.lastnamefield().sendKeys("suram");
        rp.emailfield().sendKeys(utilities.genarateWithEmailTimeStamp());
        rp.telephonefield().sendKeys("234567789");
        rp.passwordfield().sendKeys("12345");
        rp.passwordconfirm().sendKeys("12345");
        rp.SubScribefield().click();
        rp.polacyfield().click();
        rp.continuebutton().click();
        driver.quit();



    }
    @Test(priority = 3)
    public void VerifyProperNotificationDontProvideAnyFields(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerpage  rp=new registerpage(driver);
        rp.continuebutton().click();


    }
    @Test
    public void InvalidEmailAddress(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerpage  rp=new registerpage(driver);
        rp.firstnamefield().sendKeys("vinodreddy");
        rp.lastnamefield().sendKeys("suram");
        rp.emailfield().sendKeys(" vinodreddy@gmailvinod");
        rp.telephonefield().sendKeys("234567789");
        rp.passwordfield().sendKeys("12345");
        rp.passwordconfirm().sendKeys("12345");
        rp.SubScribefield().click();
        rp.polacyfield().click();
        rp.continuebutton().click();



    }
    @Test
    public void InvalidPhoneNumber(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerpage  rp=new registerpage(driver);
        rp.firstnamefield().sendKeys("vinodreddy");
        rp.lastnamefield().sendKeys("suram");
        rp.emailfield().sendKeys( utilities.genarateWithEmailTimeStamp());
        rp.telephonefield().sendKeys("abcdf123");
        rp.passwordfield().sendKeys("12345");
        rp.passwordconfirm().sendKeys("12345");
        rp.SubScribefield().click();
        rp.polacyfield().click();
        rp.continuebutton().click();

    }
    @Test
public void VerifyPrivacypolicyButtonClickedornot(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerpage  rp=new registerpage(driver);

        Assert.assertFalse(rp.polacyfield().isSelected());

}
@Test
public void spaceasaccepting() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    registerpage rp = new registerpage(driver);
    rp.firstnamefield().sendKeys("vinodreddy");
    rp.lastnamefield().sendKeys("suram");
    rp.emailfield().sendKeys(utilities.genarateWithEmailTimeStamp());
    rp.telephonefield().sendKeys("2345   43");
    rp.passwordfield().sendKeys("12345");
    rp.passwordconfirm().sendKeys("12345");
    rp.SubScribefield().click();
    rp.polacyfield().click();
    rp.continuebutton().click();


}
@AfterMethod
    public void close(){
       driver.quit();
}

}
