package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import co.inventorsoft.birdietests.utils.PageObject;

public class ProMainDashboardPage extends PageObject {


    @FindBy(xpath = "/html/body/app-root/app-dashboard-layout/div/app-header/header/div/div[2]/app-main-nav/nav")
    public WebElement loggedheader;

    public ProMainDashboardPage(WebDriver driver) {
        super(driver);
    }

    public void waitForDashboardPage() {
        DriverWaiters.wait10SecondsForVisibilityOf(driver, loggedheader);
    }

    public boolean proMainDashboardisInitialized() {
        return loggedheader.isDisplayed();
    }

}
