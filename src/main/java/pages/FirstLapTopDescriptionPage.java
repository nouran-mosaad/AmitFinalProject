package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstLapTopDescriptionPage {
    WebDriver driver;
    public FirstLapTopDescriptionPage(WebDriver driver) {
        this.driver = driver;
    }
    private By addtocartbutton = By.xpath("//a[@onclick='addToCart(8)']");
    private By homebutton = By.xpath("//li[@class='nav-item active']/a");


    public void clickOnAddToCartButton(){
        driver.findElement(addtocartbutton).click();

    }
    public String addToCartValidation(){
        String additionalert = driver.switchTo().alert().getText();
        //driver.switchTo().alert().accept();
       return additionalert;
    }
    public void acceptProductOneCartAlert() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.navigate().back();
    }
    public void clickOnHome(){
        driver.findElement(homebutton).click();

    }
}
