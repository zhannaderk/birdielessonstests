package co.inventorsoft.birdietests.utils;

import co.inventorsoft.birdietests.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
 //   public void loginDefault() {

  //      login("salamandra2043@gmail.com", "12345");
  //  }
  public void login (String email, String password) {
      LoginPage loginpage = new LoginPage(driver);
      loginpage.open();
      loginpage.waitForLoginPage();
      loginpage.clickSignInButton();
      loginpage.clickEmail();
      loginpage.enterEmail(email);
      loginpage.clickPassword();
      loginpage.enterPassword(password);
      loginpage.submitLoginData();

  }

}
