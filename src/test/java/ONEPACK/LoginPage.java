package ONEPACK;

import org.openqa.selenium.RetrySessionRequestException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="input-email")
    private WebElement emailField;
    @FindBy(id="input-password")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement LoginButton;

    @FindBy(xpath = "//div[@id='content']/h2[text()=\"My Account\"]")
    private  WebElement HomePages;
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]")
    private WebElement WarningNoMatch;



    public WebElement emailField(){
        return emailField;
    }
    public WebElement passwordField(){
   return passwordField;
}
public WebElement LoginButton(){
        return LoginButton;
}
public WebElement HomePages(){
return HomePages;
}
public WebElement WarningNoMatch(){
        return  WarningNoMatch;
}
}
