package ONEPACK;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
    @FindBy(linkText = "Success")
    private WebElement sucess;
    public WebElement sucess(){
        return sucess;
    }

}
