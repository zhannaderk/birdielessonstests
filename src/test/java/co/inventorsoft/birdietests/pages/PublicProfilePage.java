package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublicProfilePage {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;
    @FindBy(className = "company-name")
    private WebElement publicprofileheader;

    public PublicProfilePage(WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        this.leftSideBar = leftSideBar;
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayedPublicProfileHeader() {

        return publicprofileheader.isDisplayed();
    }


    public void waitForPublicProfile() {
        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, publicprofileheader);
    }
}


