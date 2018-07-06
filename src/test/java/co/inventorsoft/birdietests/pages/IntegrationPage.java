package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationPage {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;

    @FindBy(css = "#content > div.px-0.px-md-4 > h1")
    private WebElement integrationheader;


    public IntegrationPage(WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        this.leftSideBar = leftSideBar;
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayedIntegrationHeader() {

        return integrationheader.isDisplayed();
    }

    public void waitForIntegration() {
        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, integrationheader);
    }


    public String getIntegrationText() {
        return integrationheader.getText();
    }
}
