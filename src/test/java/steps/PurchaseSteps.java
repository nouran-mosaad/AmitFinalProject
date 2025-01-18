package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;

import static org.testng.AssertJUnit.assertTrue;

public class PurchaseSteps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    LaptopsPage laptopsPage;
    FirstLapTopDescriptionPage firstLapTopDescriptionPage;
    SecondLapTopDescriptionPage secondLapTopDescriptionPage;
    CartPage cartPage;
    PurchasePage purchasePage;


    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        homePage = new HomePage(driver);

    }
    @When("user log in with username and password")
    public void user_log_in_with_username_and_password() throws InterruptedException {

        homePage.clickOnLogInLink();

        Thread.sleep(1000);
        homePage.insertLogInUsername("TestNour321");
        homePage.insertLogInPassword("123456");
        Thread.sleep(1000);
        homePage.clickOnLogInButton();
        Thread.sleep(2000);

    }
    @Then("user should see a welcome message")
    public void user_should_see_a_welcome_message () {

        String actualresult = homePage.successfullyLogInMessage();
        String expectedresult = "Welcome";

        Assert.assertTrue(actualresult.contains(expectedresult));

    }
    @When("user add the first laptop to the cart")
    public void user_add_the_first_laptop_to_the_cart() throws InterruptedException {
        laptopsPage = new LaptopsPage(driver);
        firstLapTopDescriptionPage = new FirstLapTopDescriptionPage(driver);

        homePage.clickOnLaptopsButton();
        Thread.sleep(1000);

         laptopsPage.clickOnFirstLapTop();
        Thread.sleep(2000);
        firstLapTopDescriptionPage.clickOnAddToCartButton();
        Thread.sleep(1000);
    }
    @Then("user should see a validation message product one added")
    public void i_should_see_a_validation_message_product_one_added() throws InterruptedException {
        String actualresultt = firstLapTopDescriptionPage.addToCartValidation();
        String expectedresultt = "Product added";
        assertTrue(actualresultt.contains(expectedresultt));
        firstLapTopDescriptionPage.acceptProductOneCartAlert();
        Thread.sleep(1000);
        firstLapTopDescriptionPage.clickOnHome();
    }
    @When("user add the second laptop to the cart")
    public void i_add_the_second_laptop_to_the_cart() throws InterruptedException {
     secondLapTopDescriptionPage = new SecondLapTopDescriptionPage(driver);
        homePage.clickOnLaptopsButton();
        Thread.sleep(1000);

        laptopsPage.clickOnSecondLapTop();
        Thread.sleep(2000);
        secondLapTopDescriptionPage.clickOnAddToCartButton2();
        Thread.sleep(1000);
    }
    @Then("user should see a validation message product two added")
    public void user_should_see_a_validation_message_product_two_added() throws InterruptedException {
        String actualresult2 = secondLapTopDescriptionPage.addToCart2Validation();
        String expectedresult2 = "Product added";
        assertTrue(actualresult2.contains(expectedresult2));
        secondLapTopDescriptionPage.acceptProductTwoCartAlert();
        Thread.sleep(1000);
    }
    @When("user go to the cart")
    public void user_go_to_the_cart() throws InterruptedException {

       secondLapTopDescriptionPage.clickOnCartLink();

        Thread.sleep(1000);
    }
    @Then("the cart should contain the products Sony vaio i5 and Sony vaio i7")
    public void the_cart_should_contain_the_products_Sony_vaio_i5_and_Sony_vaio_i7 () throws InterruptedException {
        cartPage = new CartPage(driver);
        String actualtitle1 = cartPage.productOneTitleValidation();
        String expectedtitle1 = "Sony vaio i5";
        assertTrue(actualtitle1.contains(expectedtitle1));

        String actualtitle2 = cartPage.productTwoTitleValidation();
        String expectedtitle2 = "Sony vaio i7";
        assertTrue(actualtitle2.contains(expectedtitle2));
        Thread.sleep(1000);
    }
    @Then("the prices should be 790 and 790")
    public void the_prices_should_be_790_and_790() {

        String actualprice1 = cartPage.productOnePriceValidation();
        String expectedprice1 = "790";
        assertTrue(actualprice1.contains(expectedprice1));


        String actualprice2 = cartPage.productTwoPriceValidation();
        String expectedprice2 = "790";
        assertTrue(actualprice2.contains(expectedprice2));
    }
    @Then("the total amount should be 1580")
    public void the_total_amount_should_be_1580() {
        String expectedTotal = "1580";
        String actualTotal = cartPage.getTotalAmount();
        assertTrue(actualTotal.contains(expectedTotal));
    }
    @When("user place the order with details")
    public void user_place_the_order_with_details() throws InterruptedException {
        purchasePage = new PurchasePage(driver);
         cartPage.clickOnPlaceOrderButton();
        Thread.sleep(1000);
        purchasePage.purchaseDetails("nouran", "Egypt", "Cairo", "123456", "10", "2025");
        Thread.sleep(2000);
        purchasePage.clickOnPurchaseButton();
    }
    @Then("user should see a success message Thank you for your purchase")
    public void user_should_see_a_success_message_Thank_you_for_your_purchase() {
        String actualmessage = purchasePage.checkPurchaseSuccessMessage();
        String expectedmessage = "Thank you for your purchase!";
        assertTrue(actualmessage.contains(expectedmessage));

    }
    @Then("user confirm the purchase")
    public void user_confirm_the_purchase() {
        purchasePage.clickOnOkButton();
    }

}
