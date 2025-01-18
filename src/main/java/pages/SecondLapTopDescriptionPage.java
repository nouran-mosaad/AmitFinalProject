package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondLapTopDescriptionPage {
    WebDriver driver;
    public SecondLapTopDescriptionPage(WebDriver driver) {

        this.driver = driver;
    }

    private By addtocartbutton2 = By.xpath("//a[@onclick='addToCart(9)']");
    private By cartlink = By.id("cartur");



    public void clickOnAddToCartButton2(){
        driver.findElement(addtocartbutton2).click();

    }
    public String addToCart2Validation(){
        String additionalert2 = driver.switchTo().alert().getText();
        //driver.switchTo().alert().accept();
        return additionalert2;
    }
    public void acceptProductTwoCartAlert() throws InterruptedException {
        driver.switchTo().alert().accept();
    }

    public CartPage clickOnCartLink() throws InterruptedException {
        driver.findElement(cartlink).click();
        return new CartPage(driver);
    }


}
