package co.inventorsoft.birdietests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftSideBar {

    private WebDriver webDriver;
    @FindBy(id = "dashboard")
    private WebElement dashboard;
    @FindBy(id = "invitations")
    private WebElement invitations;
    @FindBy(id = "service-reviews")
    private WebElement servicereviews;
    @FindBy(id = "integration")
    private WebElement integration;
    @FindBy(id = "company-profile")
    private WebElement companyprofile;
    @FindBy(xpath = "//*[@id=\"public-page\"]")
    private WebElement publicprofile;

    public LeftSideBar (WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDashboard() {
        dashboard.click();
    }

    public void clickInvitations() {
        invitations.click();
    }

    public void clickServiceReview() {
        servicereviews.click();
    }

    public void clickIntegration() {
        integration.click();
    }

    public void clickProfile() {
        companyprofile.click();
    }

    public void clickPublicProfile() {
        publicprofile.click();

    }

}
