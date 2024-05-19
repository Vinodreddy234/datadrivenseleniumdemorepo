package TWOPACK;

import ONEPACK.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    WebDriver driver;
    @Test
public void VerifyWithValidCredentials(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        LoginPage loginPage=new LoginPage(driver);
        loginPage.emailField().sendKeys("suramvinod275@gmail.com");
        loginPage.passwordField().sendKeys("Vinod@123");
        loginPage.LoginButton().click();

        Assert.assertTrue(loginPage.HomePages().isDisplayed());
    System.out.println("viswa sucessfully updated");


}
@Test(priority = 1)
public void VerifyingInvalidCredentials(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    LoginPage loginPage=new LoginPage(driver);
    loginPage.emailField().sendKeys("xyzabc123@gmail.com");
    loginPage.passwordField().sendKeys("xyzabc123");
    loginPage.LoginButton().click();
    String Actualtext = loginPage.WarningNoMatch().getText();
    Assert.assertEquals(Actualtext,"Warning: No match for E-Mail Address and/or Password.");


}
@Test(priority = 2)
public void VerifyWithKeyBoadTabKey(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    LoginPage loginPage=new LoginPage(driver);


}
@Test(priority = 3)
public void VerifyEmailAndPasswordTextField(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    LoginPage loginPage=new LoginPage(driver);
    String actual = loginPage.emailField().getText();
    System.out.println(actual);
}
@Test(priority = 4)
public void VerifyPasswordFieldTextCopiedorNot(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    LoginPage loginPage=new LoginPage(driver);

    loginPage.passwordField().sendKeys("12345");


}
@Test(priority = 5)
    public void VerifyLoggingAfterChangeingThePassword(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    LoginPage loginPage=new LoginPage(driver);
    loginPage.emailField().sendKeys("suramvinod275@gmail.com");
    loginPage.passwordField().sendKeys("12345");
    loginPage.LoginButton().click();
    driver.findElement(By.linkText("Password")).click();
    driver.findElement(By.id("input-password")).sendKeys("12345");
    driver.findElement(By.id("input-confirm")).sendKeys("12345");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
     driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
    driver.findElement(By.linkText("Login")).click();

    loginPage.emailField().sendKeys("suramvinod275@gmail.com");
    loginPage.passwordField().sendKeys("6789");
    loginPage.LoginButton().click();






}
@AfterMethod
public void teardown(){
        driver.quit();

}


}
