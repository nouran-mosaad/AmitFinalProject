package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {
    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    private By namebox = By.id("name");
    private By countrybox = By.id("country");
    private By citybox = By.id("city");
    private By creditCardbox = By.id("card");
    private By monthbox = By.id("month");
    private By yearbox = By.id("year");
    private By purchasebutton = By.xpath("//button[@onclick='purchaseOrder()']");
    private By successpurchasemessage = By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]");
    private By okbutton = By.cssSelector(".confirm.btn.btn-lg.btn-primary");


    // Methods to perform purchase actions
    public void purchaseDetails(String name, String country, String city, String card, String month, String year) {
        driver.findElement(namebox).sendKeys(name);
        driver.findElement(countrybox).sendKeys(country);
        driver.findElement(citybox).sendKeys(city);
        driver.findElement(creditCardbox).sendKeys(card);
        driver.findElement(monthbox).sendKeys(month);
        driver.findElement(yearbox).sendKeys(year);
    }

    public void clickOnPurchaseButton() {
        driver.findElement(purchasebutton).click();
    }

    public String checkPurchaseSuccessMessage() {
        String purchassuccessmessage = driver.findElement(successpurchasemessage).getText();
        return purchassuccessmessage;
    }

    public void clickOnOkButton() {
         driver.findElement(okbutton).click();
    }
   }