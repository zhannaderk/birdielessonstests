package co.inventorsoft.birdietests.tests;

import co.inventorsoft.birdietests.pages.LoginPage;
import co.inventorsoft.birdietests.utils.AuthenticatedBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class UserCanLoginSuccessfully extends AuthenticatedBaseTest {

    private LoginPage loginPage = new LoginPage(driver);

    public UserCanLoginSuccessfully(WebDriver driver) {
        super(driver);
    }

    @BeforeClass
    public void init() {
        loginPage = new LoginPage(driver);
    }


    @Test(priority = -1)
    public void login () {
        loginPage.open();
        loginPage.fillEmailInput(login);
        loginPage.fillPasswordInput(password);
        loginPage.clickLoginButton();
        Assert.assertTrue(dashboard.isDisplayedDashboardHeader(), "Header is not displayed");
        Assert.assertEquals("Invitations", invitations.getInvitationsText(), "InvitationsPage Text is not displayed");
    }


}