package co.inventorsoft.birdietests.tests;

import co.inventorsoft.birdietests.pages.*;
import co.inventorsoft.birdietests.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NegativeLoginTest extends BaseTest {

   private LoginPage loginfalse;

    @BeforeClass
    public void init() {
        loginfalse = new LoginPage(driver);

    }

    @Test
    public void canNotLoginWithEmptyEmailField(){
        actions.login("", "maksg123");
        loginfalse.waitForLoginPage();
       // Assert.assertTrue(loginfalse.errorInvalidEmailInputIsDisplayed);
        Assert.assertTrue(loginfalse.signInButtonIsDisplayed(), "Sign in button is not displayed");
    }
}
