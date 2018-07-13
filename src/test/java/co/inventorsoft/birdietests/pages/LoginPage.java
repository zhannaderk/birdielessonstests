package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.PageObject;
import co.inventorsoft.birdietests.utils.Properties;
import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject{


    @FindBy(xpath = "/html/body/app-root/app-home/app-header/header/div/div[2]/nav/button")
    private WebElement signinBtn;
    @FindBy(className = "sign-in-form__group__input mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid ng-touched")
    private WebElement emailInput;
    @FindBy(className = "sign-in-form__group__input mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-invalid")
    private WebElement passwordInput;
    @FindBy (className = "sign-in-form__btn mat-raised-button mat-primary")
    private WebElement submitBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void open() {
       driver.get(Properties.getBaseUrl());
   }

   public boolean isInitialized (){
        return signinBtn.isDisplayed();
   }

    public void waitForLoginPage() {
        DriverWaiters.wait10SecondsForVisibilityOf(driver, signinBtn);
    }

    public void clickSignInButton () {
       signinBtn.click();
    }

    public void enterEmail(String email) {
        emailInput.sendKeys (email);
   }

   public void enterPassword(String password) {
       passwordInput.sendKeys(password);
   }

       public ProMainDashboardPage submitLoginData () {
           submitBtn.click();
           return new ProMainDashboardPage(driver);
       }

   }
