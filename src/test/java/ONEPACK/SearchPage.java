package ONEPACK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends LoginPage  {

    public SearchPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(name = "search")
    private WebElement searchfield;
    @FindBy(xpath = "//*[contains(@class,'fa-search')]")
    private WebElement searchButton;

    @FindBy(linkText = "iMac")
    private WebElement iMacItem;
    @FindBy(xpath = "//p[contains(text(),'There is no product that matches the search ')]")
    private WebElement noproduct;

    @FindBy(id = "input-search")
    private WebElement sarchCriteriaField;
    @FindBy(id = "button-search")
    private WebElement searchbuttonUnderSearchCriteria;

    @FindBy(name = "category_id")
    private WebElement allcategory;

    @FindBy(id = "compare-total")
    private WebElement productCompare;
    @FindBy(xpath = "//p[contains(text(),'You have not chosen any products to')]")
    private WebElement ProductComparePage;

    public WebElement emailField() {
        return super.emailField();
    }

    public WebElement searchfield(){
        return searchfield;
    }
    public WebElement searchButton(){
        return searchButton;
    }


    public WebElement iMacItem(){
        return iMacItem;
    }
    public WebElement noproduct(){
        return noproduct;
    }
    public WebElement sarchCriteriaField(){
        return sarchCriteriaField;
    }
    public WebElement searchbuttonUnderSearchCriteria(){
        return searchbuttonUnderSearchCriteria;
    }

    public WebElement allcategory(){
        return allcategory;
    }

    public WebElement productCompare(){
        return productCompare;
    }
    public WebElement ProductComparePage(){
        return ProductComparePage;
    }

}
