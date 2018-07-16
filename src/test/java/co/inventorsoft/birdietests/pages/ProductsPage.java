package co.inventorsoft.birdietests.pages;

import co.inventorsoft.birdietests.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {

    public ProductsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/app-products-table/div[2]/div/button")
    private WebElement addnewlessonicon;

    @FindBy (className = "mat-dialog-container ng-tns-c36-125 ng-trigger ng-trigger-slideDialog ng-star-inserted")
    private WebElement addnewlessonmodal;

    @FindBy (className = "mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid")
    private WebElement titleinput;

    @FindBy(className = "mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-invalid")
    private WebElement priceinput;

    @FindBy (className = "birdie-modal__footer__btn ng-star-inserted")
    private WebElement addnewlessonbtn;

    public boolean productsPageIsInitialized() {
        return addnewlessonbtn.isDisplayed();
    }

    public void clickAddNewLessonIcon (){
          addnewlessonicon.click();
    }

public boolean addNewLessonModalIsDisplayed() {
        return addnewlessonmodal.isDisplayed();
    }

    public void clickAndClearTitleInput() {
        titleinput.clear();
    }

    public void enterNewTitle() {
       titleinput.sendKeys("random");
    }

    public void clickPriceInput() {
        priceinput.click();
    }

    public void clickAddNewLessonBtn() {
        addnewlessonbtn.click();
    }


}
