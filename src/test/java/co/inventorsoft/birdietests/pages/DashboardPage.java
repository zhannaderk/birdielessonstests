package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    private WebElement dashboardheader;


    public DashboardPage(WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        this.leftSideBar = leftSideBar;
        PageFactory.initElements(driver, this);
    }

    public DashboardPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayedDashboardHeader() {

        return dashboardheader.isDisplayed();
    }

    public String getDashboardText() {
        return dashboardheader.getText();
    }

    public void waitForDashboard() {

        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, dashboardheader);
    }


    public LeftSideBar getLeftSideBar() {
        return leftSideBar;
    }
}











