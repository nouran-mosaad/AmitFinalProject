package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseSteps {
    public WebDriver driver;
    public HomePage homePage;
    public LaptopsPage laptopsPage;
    public FirstLapTopDescriptionPage firstLapTopDescriptionPage;
    public SecondLapTopDescriptionPage secondLapTopDescriptionPage;
    public CartPage cartPage;
    public PurchasePage purchasePage;


    @BeforeMethod
    public void HomePage() {
        driver.get("https://demoblaze.com/");
    }
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        HomePage();
    }



    @AfterClass
    public void Close() {
        driver.quit();
    }


}