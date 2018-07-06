package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.PageObject;
import co.inventorsoft.birdietests.utils.Properties;
import co.inventorsoft.birdietests.utils.DriverWaiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject{

    private WebDriver webDriver;
    @FindBy(xpath = "/html/body/app-root/app-home/app-header/header/div/div[2]/nav/button")
    @FindBy(className = "sign-in-form__group__input mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid ng-touched")
    private WebElement emailInput;
    @FindBy(className = "sign-in-form__group__input mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-invalid")
    private WebElement passwordInput;
    @FindBy (className = "sign-in-form__btn mat-raised-button mat-primary")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


   // public LoginPage(WebDriver driver) {
      //  this.webDriver = driver;
       // PageFactory.initElements(driver, this);
   // }

    public void loginDefault() {

        login("salamandra2043@gmail.com", "12345");
    }

    /**
     * @param login
     * @param password
     */
    public void login(String login, String password) {

        //MainPage mainPage = new MainPage(driver);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(mainPage.getImgLogo())));
    }


    public void open() {

       webDriver.get(Properties.getBaseUrl());
   }

   public boolean isInitialized (){
        return loginBtn.isDisplayed();
   }

    public void waitForLoginPage() {

        DriverWaiters.wait10SecondsForVisibilityOf(webDriver, loginBtn);
    }
   public void fillEmailInput(String email) {

        emailInput.sendKeys(email);
   }

   public void fillPasswordInput(String password) {

       passwordInput.sendKeys(password);
   }

       public void clickLoginButton() {

           loginBtn.click();
       }


   }
