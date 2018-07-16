package co.inventorsoft.birdietests.tests;

import co.inventorsoft.birdietests.pages.ProMainDashboardPage;
import co.inventorsoft.birdietests.utils.AuthenticatedBaseTest;
import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProCanLoginWithValidCredentials extends AuthenticatedBaseTest {

    @Test
    public void canLogin() throws Exception {
        ProMainDashboardPage loggedheader = new ProMainDashboardPage(driver);
        generalactions.loginDefault();
        loggedheader.waitForDashboardPage();
        Assert.assertTrue(loggedheader.proMainDashboardisInitialized(), "Dashboard is not initialized");
    }


}
