package co.inventorsoft.birdietests.pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver webDriver;

    @Getter
    private By imgLogo = By.xpath("/html/body/div/div[1]/header/nav/a/img");

    public MainPage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public By getImgLogo() {
        return imgLogo;
    }
}

