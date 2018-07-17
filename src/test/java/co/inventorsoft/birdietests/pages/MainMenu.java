package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends PageObject {

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/app-root/app-dashboard-layout/div/app-header/header/div/div[2]/app-main-nav/nav/a[4]")
    private WebElement myproducts;

    @FindBy()
    private WebElement home;

    @FindBy()
    private WebElement calendar;

    @FindBy()
    private WebElement onlinelessons;

    @FindBy()
    private WebElement students;

    @FindBy()
    private WebElement birdie365;

}
