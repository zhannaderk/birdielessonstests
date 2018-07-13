package co.inventorsoft.birdietests.tests;

import co.inventorsoft.birdietests.pages.LoginPage;
import co.inventorsoft.birdietests.pages.ProMainDashboardPage;
import co.inventorsoft.birdietests.utils.AuthenticatedBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProCanLoginWithValidCredentials extends AuthenticatedBaseTest {


    private ProMainDashboardPage loggedheader;

    @BeforeClass
    public void init() {
       loggedheader = new ProMainDashboardPage(driver);
    }

    @Test
    public void canLogin() throws Exception {
        generalactions.loginDefault();
        Assert.assertTrue(loggedheader.isInitialized(), "Dashboard is not initialized");
    }


}
