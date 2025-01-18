package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LaptopsPage;

public class SignupSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    LaptopsPage laptopsPage;


    @Given("user opens Demoblaze homepage and click on Sign Up link")
    public void user_opens_demoblaze_homepage_and_click_on_sign_up_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage = new HomePage(driver);
        homePage.clickOnSignUpLink();
        Thread.sleep(3000);

    }
    @When("user enters valid user name and valid password and click on Sign Up button")
    public void user_enters_valid_user_name_and_valid_password_and_click_on_sign_up_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        homePage.insertUsername("TestNour22111");
        // Thread.sleep(3000);
        homePage.insertPassword("123456");
        Thread.sleep(2000);
        homePage.clickOnSignUpButton();


    }
    @Then("Sign Up Successful message should be displayed")
    public void sign_sp_successful_message_should_be_displayed() throws InterruptedException {

        // Write code here that turns the phrase above into concrete actions



        Thread.sleep(1000);
        homePage.acceptAlert();

    }





}
