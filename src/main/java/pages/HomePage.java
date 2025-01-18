package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private By signuplink = By.id("signin2");
    private By usernamebox = By.xpath("//input[@id='sign-username']");
    private By passwordbox = By.id("sign-password");
    private By signupbutton = By.xpath("//button[@onclick='register()']");
    private By loginlink = By.id("login2");
    private By loginusernamebox =By.id("loginusername");
    private By loginpasswordbox =By.id("loginpassword");
    private By loginbutton =By.xpath("//button[@onclick='logIn()']");
    private By successfullyloginmessage =By.id("nameofuser");
    private By laptopsbutton = By.xpath("//a[@onclick=\"byCat('notebook')\"]");




    public void clickOnSignUpLink(){
        driver.findElement(signuplink).click();

    }
    public void insertUsername(String username) {
        driver.findElement(usernamebox).sendKeys(username);
    }

    public void insertPassword(String password) {
        driver.findElement(passwordbox).sendKeys(password);

    }
    public void clickOnSignUpButton(){
        driver.findElement(signupbutton).click();

    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().getText();
    }
    public void clickOnLogInLink(){
        driver.findElement(loginlink).click();

    }
    public void insertLogInUsername(String username) {
        driver.findElement(loginusernamebox).sendKeys(username);
    }
    public void insertLogInPassword(String password) {
        driver.findElement(loginpasswordbox).sendKeys(password);

    }
    public void clickOnLogInButton(){
        driver.findElement(loginbutton).click();

    }

    public String successfullyLogInMessage(){
        String message = driver.findElement(successfullyloginmessage).getText();
        return message;
    }

    public LaptopsPage clickOnLaptopsButton(){
        driver.findElement(laptopsbutton).click();
        return new LaptopsPage(driver);

    }

}


