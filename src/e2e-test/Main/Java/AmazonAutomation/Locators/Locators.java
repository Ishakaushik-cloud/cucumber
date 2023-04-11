package AmazonAutomation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
    @FindBy(id = "ap_email")
    public WebElement username;
    @FindBy(id = "continue")
    public
    WebElement continueButton;
    @FindBy(id = "ap_password")
    public
    WebElement password;
    @FindBy(id = "signInSubmit")
    public
    WebElement submitbutton;
    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    public
    WebElement fullName;
    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    public
    WebElement phoneNumber;
    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    public
    WebElement postalCode;
    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    public
    WebElement address1;
    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    public
    WebElement address2;
    @FindBy(id = "address-ui-widgets-enterAddressCity")
    public
    WebElement city;
    @FindBy(xpath = "//*[@id=\\\"address-ui-widgets-form-submit-button\\\"]/span/input")
    public
    WebElement button;
    @FindBy(xpath = "twotabsearchtextbox")
    public
    WebElement search;
    @FindBy(id = "nav-search-submit-button")
    public
    WebElement sub;
    @FindBy(xpath = "//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div[12]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
    public
    WebElement getSubmit;
    @FindBy(xpath = "add-to-cart-button")
    public
    WebElement cart;
}
