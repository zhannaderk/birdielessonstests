package co.inventorsoft.birdietests.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import co.inventorsoft.birdietests.utils.PageObject;

public class ProMainDashboardPage extends PageObject {



        @FindBy(className = "avatar__img avatar__img--horizontal avatar__img--horizontal--4_3")
        private WebElement avatarheader;

        public ProMainDashboardPage(WebDriver driver) {
            super(driver);
        }

        public boolean isInitialized() {
            return avatarheader.isDisplayed();
        }

    }
