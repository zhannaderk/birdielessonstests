package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyProfilePage {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;
    @FindBy(css = "#content > div.px-0.px-md-4 > h1")
    private WebElement companyrpofileheder;

    public CompanyProfilePage(WebDriver driver, LeftSideBar leftSideBar){
        this.leftSideBar = leftSideBar;
        this.webDriver = driver;
        PageFactory.initElements(driver, this);

    }

    public boolean isDisplayedCompanyProfileHeader() {
        return companyrpofileheder.isDisplayed();
    }

    public void waitForCompanyProfile() {
        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, companyrpofileheder);
    }

    public String getProfileText() {
        return companyrpofileheder.getText();
    }
}
