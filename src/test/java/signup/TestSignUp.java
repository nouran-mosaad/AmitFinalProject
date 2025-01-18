package signup;


import base.BaseSteps;

import static org.testng.AssertJUnit.assertTrue;

public class TestSignUp extends BaseSteps {

  @org.testng.annotations.Test()
    public void signUpSuccessfully() throws InterruptedException {
      homePage.clickOnSignUpLink();
      Thread.sleep(1000);
      homePage.insertUsername("TestNour2211");
      // Thread.sleep(3000);
      homePage.insertPassword("123456");
      Thread.sleep(1000);
      homePage.clickOnSignUpButton();
     Thread.sleep(1000);
      homePage.acceptAlert();

  }
    }
