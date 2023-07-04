package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AmazonLogin extends ReusableMethods{

    AmazonPage page=new AmazonPage();
    ReusableMethods reusable=new ReusableMethods();

    @Given("User clicks  AmazonUrl")
    public void user_clicks_amazon_url() {
        Driver.getDriver().get(ConfigurationReader.getPropery("AmazonUrl"));


    }
    @Then("User clicks start here button")
    public void user_clicks_start_here_button() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(page.AccountButton).perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(page.signinButton));

        page.signinButton.click();

    }
        @Then("User clicks create New Account Button")
        public void user_clicks_create_new_account_button() {
           page.createNewAccount.click();
        }


    @Then("User clicks Your name button")
    public void user_clicks_your_name_button() {
        page.fullNameButton.click();

    }
    @Then("User writes a right fullname")
    public void user_writes_a_right_fullname() {
        page.fullNameButton.sendKeys(ConfigurationReader.getPropery("fullName"));
    }
    @Then("User clicks Mobile number or email button")
    public void user_clicks_mobile_number_or_email_button() {
         page.emailButton.click();
    }
    @Then("User writes a right email")
    public void user_writes_a_right_email() {
        page.emailButton.sendKeys(ConfigurationReader.getPropery("email"));

    }
    @Then("User clicks Password button")
    public void user_clicks_password_button() {
        page.passwordButton.click();

    }
    @Then("User writes a right password")
    public void user_writes_a_right_password() {
        page.passwordButton.sendKeys(ConfigurationReader.getPropery("password"));

    }
    @Then("User clicks Re-enter password button")
    public void user_clicks_re_enter_password_button() {
        page.rePasswordButton.click();

    }
    @Then("User writes a right password re-enter Button")
    public void user_writes_a_right_password_re_enter_button() {
      page.rePasswordButton.sendKeys(ConfigurationReader.getPropery("re-password"));
    }
    @Then("User clicks Continue button")
    public void user_clicks_continue_button() {
        page.continueButton.click();

    }

    @Then("Users verify account text")
    public void users_verify_account_text() {

        Driver.getDriver().switchTo().frame(page.iframeElement);

        String actualData=page.VerifyYazisi.getText();
       String expectedData="Solve this puzzle to protect your account";
       Assert.assertEquals(expectedData,actualData);
       waitFor(3);


       Driver.closeDriver();

    }





}
