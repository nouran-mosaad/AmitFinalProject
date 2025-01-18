package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopsPage {
    WebDriver driver;
    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By firstlaptop = By.xpath("//h4[@class='card-title']/a[@href='prod.html?idp_=8']");
    private By secondlaptop = By.xpath("//h4[@class='card-title']/a[@href='prod.html?idp_=9']");

    public FirstLapTopDescriptionPage clickOnFirstLapTop(){
        driver.findElement(firstlaptop).click();
        return new FirstLapTopDescriptionPage(driver);

    }
    public SecondLapTopDescriptionPage clickOnSecondLapTop(){
        driver.findElement(secondlaptop).click();
        return new SecondLapTopDescriptionPage(driver);

    }
}
