package co.inventorsoft.birdietests.tests;

import co.inventorsoft.birdietests.pages.DashboardPage;
import co.inventorsoft.birdietests.pages.LoginPage;
import co.inventorsoft.birdietests.utils.AuthenticatedBaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuccessLoginTest extends AuthenticatedBaseTest {

    private DashboardPage dashboard;
    private LoginPage loginpage;

    @BeforeClass
    public void init() {
        dashboard = new DashboardPage(driver);
        loginpage = new LoginPage(driver);
    }

    @Test (priority = -1)
    public void canLogin() throws Exception {
        actions.loginDefault();
        Assert.assertTrue(dashboard.isDisplayedDashboardHeader(), "Dashboard is not displayed");
    }




}
