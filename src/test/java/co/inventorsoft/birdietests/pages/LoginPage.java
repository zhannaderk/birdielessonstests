package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.PageObject;
import co.inventorsoft.birdietests.utils.Properties;
import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject {

    @FindBy(xpath = "/html/body/app-root/app-home/app-header/header/div/div[2]/nav/button")
    private WebElement signinBtn;

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/ng-component/section/div[3]/form/button/span")
    private WebElement submitBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(Properties.getBaseUrl());
    }

    public boolean loginPageIsInitialized() {
        return signinBtn.isDisplayed();
    }

    public void waitForLoginPage() {
        DriverWaiters.wait10SecondsForVisibilityOf(driver, signinBtn);
    }

    public void clickSignInButton() {
        signinBtn.click();
    }

    public void clickEmail() {
        emailInput.click();
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clickPassword() {
        passwordInput.click();
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public ProMainDashboardPage submitLoginData() {
        submitBtn.click();
        return new ProMainDashboardPage(driver);
    }
}
