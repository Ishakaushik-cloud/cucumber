package AmazonAutomation.StepDesign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import AmazonAutomation.Actions.Actions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private WebDriver driver;

private Actions actions;
    @Given("Open up chrome and launch amazon website")
    public void openUpChromeAndLaunchAmazonWebsite() {
        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\ishak\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        driver = new ChromeDriver();
        driver.get("http://www.amazon.in/");
        actions=new Actions(driver);
    }

    @When("Enter valid credentials")
    public void enterValidCredentials() {
        driver.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_post");
        actions.set_Username("8810202280");
      //  driver.findElement(By.id("ap_email")).sendKeys("8810202280");
        actions.continueButtonClick();
       // driver.findElement(By.id("continue")).submit();
        actions.set_Password("ishakaushik");
       // driver.findElement(By.id("ap_password")).sendKeys("ishakaushik");
    }

    @And("User is logged in")
    public void userIsLoggedIn() {
       // driver.findElement(By.id("signInSubmit")).submit();
        actions.submit();
    }

    @When("The user adds the address in address section")
    public void theUserAddsTheAddressInAddressSection() {
       // driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("xxxxx");
        actions.set_FullName("xxxxx");
        actions.set_PhoneNumber("1234567890");
        actions.set_PostalCode("625016");
       // driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("1234567890");
       // driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("625016");
//        driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("AddressLine1");
//        driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("AddressLine2");
//        driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("City");
        actions.set_address1("AddressLine1","AddressLine2","City");
        driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
     //   actions.clickbutton();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/a/addresses");
        System.out.println("Successfully performed the operation of adding address");
    }

    @When("The user search for iphonex")
    public void theUserSearchForIphonex() {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone x");
 //       actions.search("Iphone x");
        driver.findElement(By.id("nav-search-submit-button")).click();
     //   actions.enter();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @And("Selects appropriate item")
    public void selectsAppropriateItem() {
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[12]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
     //   actions.done();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    @Then("The item will be added to the cart")
    public void theItemWillBeAddedToTheCart() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-button")).click();
     //   actions.addToCart();
    }
}
