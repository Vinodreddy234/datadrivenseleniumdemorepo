package ONEPACK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends SearchPage{
    public ProductComparePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//button[@data-original-title='Compare this Product']/i[1]")
    private WebElement compareThisProduct;
    @FindBy(xpath = "//div[contains(@class,'lert-success alert-dismissible')]")
    private  WebElement messageCompareThisProduct;
    @FindBy(xpath = "//a[contains(text(),'product comparison')]")
    private WebElement productCOmparisionLink;
    @FindBy(xpath = "//strong[text()=\"Product Details\"]")
    private WebElement productDetailsmessage;
    @FindBy(xpath = "//strong[text()=\"iPhone\"]")
    private WebElement iphone;



    public WebElement  compareThisProduct(){
        return compareThisProduct;
    }
    public WebElement messageCompareThisProduct(){
        return messageCompareThisProduct;
    }
    public WebElement productCOmparisionLink(){
        return productCOmparisionLink;
    }
    public WebElement productDetailsmessage(){
        return productDetailsmessage;
    }
    public WebElement iphone(){
        return iphone;
    }
}
