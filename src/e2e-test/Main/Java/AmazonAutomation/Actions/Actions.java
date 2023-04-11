package AmazonAutomation.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import AmazonAutomation.Locators.Locators;
public class Actions {
    private Locators locators;
    private WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
        locators = PageFactory.initElements(driver, Locators.class);
    }
    public void continueButtonClick() {
        locators.continueButton.submit();
    }
    public void set_Username(String usern){locators.username.sendKeys(usern);}
    public void set_Password(String usern){locators.password.sendKeys(usern);}
    public void submit(){locators.submitbutton.submit();}
    public void set_FullName(String fullName){locators.fullName.sendKeys(fullName);}
    public void set_PhoneNumber(String number){locators.phoneNumber.sendKeys(number);}
    public void set_PostalCode(String number){locators.postalCode.sendKeys(number);}
    public void set_address1(String number,String number1,String city){locators.address1.sendKeys(number);
    locators.address2.sendKeys(number1);
    locators.city.sendKeys(city);
    }
    public void clickbutton(){
        locators.button.click();
    }

    public void search(String item){
        locators.search.sendKeys(item);
    }
    public void enter(){
        locators.sub.click();
    }
    public void done(){
        locators.getSubmit.click();
    }
    public void addToCart(){
        locators.cart.click();
    }

}
