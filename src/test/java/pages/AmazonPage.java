package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
   @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a/span")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    public  WebElement AccountButton;


    @FindBy(xpath = "//a[@class='a-button-text']")
    public WebElement createNewAccount;

    @FindBy(xpath = "//*[@id='ap_customer_name']")
    public WebElement fullNameButton;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailButton;

    @FindBy(xpath = "//*[@id='ap_password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@id='ap_password_check']")
    public WebElement rePasswordButton;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id='cvf-aamation-challenge-iframe']")
    public  WebElement iframeElement;

   // @FindBy(xpath = "(//div[@class='a-row a-spacing-small'])[1]")
 @FindBy(xpath = "//*[@id=\"a-page\"]/div/div/div/div/div[1]/span")
    public  WebElement VerifyYazisi;








}
