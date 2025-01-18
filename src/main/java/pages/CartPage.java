package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public By firstproducttitle = By.xpath("//td[contains(text(),\"i5\")]");
    public By secondproducttitle= By.xpath("//td[contains(text(),\"i7\")]");
    public By firstproductprice = By.xpath("//td[contains(text(),\"790\")]");
    public By secondproductprice = By.xpath("//td[contains(text(),\"790\")][1]");
    public By totalamount = By.id("totalp");
    public By placeoderbutton = By.xpath("//button[@class='btn btn-success']");




    public String productOneTitleValidation(){
        String firstproductname = driver.findElement(firstproducttitle).getText();


        return firstproductname;

    }
    public String productTwoTitleValidation(){
        String secondproductname = driver.findElement(secondproducttitle).getText();
        return secondproductname;

    }
    public String productOnePriceValidation(){
        String priceone = driver.findElement(firstproductprice).getText();
        return priceone;

    }public String productTwoPriceValidation(){
        String pricetwo = driver.findElement(secondproductprice).getText();
        return pricetwo;

    }
    public String getTotalAmount() {
        String total = driver.findElement(totalamount).getText();
        return total;
    }

    public PurchasePage clickOnPlaceOrderButton() {
        driver.findElement(placeoderbutton).click();
        return new PurchasePage(driver);
    }


}
