package purchase;

import base.BaseSteps;
import org.testng.Assert;
import pages.*;

import static org.testng.AssertJUnit.assertTrue;

public class TestPurchaseProcess extends  BaseSteps {

    @org.testng.annotations.Test
    public void addFirstProduct() throws InterruptedException {
        homePage.clickOnLogInLink();
        Thread.sleep(1000);
        homePage.insertLogInUsername("testttnour1234");
        homePage.insertLogInPassword("123456");
        Thread.sleep(1000);
        homePage.clickOnLogInButton();
        Thread.sleep(2000);

        String actualresult = homePage.successfullyLogInMessage();
        String expectedresult = "Welcome";

        Assert.assertTrue(actualresult.contains(expectedresult));


        LaptopsPage laptopsPage = homePage.clickOnLaptopsButton();
        Thread.sleep(1000);

        FirstLapTopDescriptionPage firstLapTopDescriptionPage = laptopsPage.clickOnFirstLapTop();
        Thread.sleep(2000);
        firstLapTopDescriptionPage.clickOnAddToCartButton();
        Thread.sleep(1000);
        String actualresultt = firstLapTopDescriptionPage.addToCartValidation();
        String expectedresultt = "Product added";
        assertTrue(actualresultt.contains(expectedresultt));
        firstLapTopDescriptionPage.acceptProductOneCartAlert();
        Thread.sleep(1000);
        firstLapTopDescriptionPage.clickOnHome();
        //Thread.sleep(2000);
         homePage.clickOnLaptopsButton();
            Thread.sleep(1000);

            SecondLapTopDescriptionPage secondLapTopDescriptionPage = laptopsPage.clickOnSecondLapTop();
            Thread.sleep(2000);
            secondLapTopDescriptionPage.clickOnAddToCartButton2();
            Thread.sleep(1000);
            String actualresult2 = secondLapTopDescriptionPage.addToCart2Validation();
            String expectedresult2 = "Product added";
            assertTrue(actualresult2.contains(expectedresult2));
            secondLapTopDescriptionPage.acceptProductTwoCartAlert();
            Thread.sleep(1000);


               CartPage cartPage = secondLapTopDescriptionPage.clickOnCartLink();

                Thread.sleep(1000);
             String actualtitle1 = cartPage.productOneTitleValidation();
                String expectedtitle1 = "Sony vaio i5";
                assertTrue(actualtitle1.contains(expectedtitle1));

                String actualtitle2 = cartPage.productTwoTitleValidation();
                String expectedtitle2 = "Sony vaio i7";
                assertTrue(actualtitle2.contains(expectedtitle2));

                Thread.sleep(1000);
                String actualprice1 = cartPage.productOnePriceValidation();
                String expectedprice1 = "790";
                assertTrue(actualprice1.contains(expectedprice1));


                String actualprice2 = cartPage.productTwoPriceValidation();
                String expectedprice2 = "790";
                assertTrue(actualprice2.contains(expectedprice2));
                String expectedTotal = "1580";
                String actualTotal = cartPage.getTotalAmount();
               assertTrue(actualTotal.contains(expectedTotal));

                PurchasePage purchasePage = cartPage.clickOnPlaceOrderButton();
                Thread.sleep(1000);
                purchasePage.purchaseDetails("nouran", "Egypt", "Cairo", "123456", "10", "2025");
                Thread.sleep(2000);
                purchasePage.clickOnPurchaseButton();
                String actualmessage = purchasePage.checkPurchaseSuccessMessage();
                String expectedmessage = "Thank you for your purchase!";
                assertTrue(actualmessage.contains(expectedmessage));
                purchasePage.clickOnOkButton();


            }
    }





