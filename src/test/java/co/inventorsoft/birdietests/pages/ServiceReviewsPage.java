package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceReviewsPage {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;
    @FindBy (css = "#content > div.px-0.px-md-4 > div > h1")
    private WebElement servicereviewheader;

    public ServiceReviewsPage(WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        this.leftSideBar = leftSideBar;
        PageFactory.initElements(driver, this);
    }


    public boolean isDisplayedServicereviewHeader() {

        return servicereviewheader.isDisplayed();
    }

    public void waitForServiceReview() {
        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, servicereviewheader);
    }

    public String getReviewText() {
        return servicereviewheader.getText();
    }

}
