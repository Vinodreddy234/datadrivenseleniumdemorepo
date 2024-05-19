package ONEPACK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {

    WebDriver driver;
    public registerpage( WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "input-firstname")
   private WebElement firstnamefield;
    @FindBy(id = "input-lastname")
    private WebElement lastnamefield;
    @FindBy(id = "input-email")
    private WebElement emailfield;
    @FindBy(id="input-telephone")
    private WebElement telephonefield;
    @FindBy(id = "input-password")
    private  WebElement passwordfield;
    @FindBy(id="input-confirm")
    private WebElement passwordconfirm;
    @FindBy(name = "newsletter")
    private  WebElement SubScribefield;
    @FindBy(name = "agree")
    private WebElement polacyfield;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement continuebutton;



    public WebElement firstnamefield(){
        return  firstnamefield;
    }

    public WebElement lastnamefield(){
        return lastnamefield;
    }

    public WebElement emailfield(){
        return emailfield;
    }

    public  WebElement telephonefield(){
        return telephonefield;
    }

    public WebElement passwordfield(){
        return passwordfield;
    }

    public WebElement passwordconfirm(){
        return passwordconfirm;
    }

    public WebElement SubScribefield(){
        return SubScribefield;
    }

   public WebElement polacyfield(){
        return polacyfield;
   }

   public WebElement continuebutton(){
        return continuebutton;
   }




}
