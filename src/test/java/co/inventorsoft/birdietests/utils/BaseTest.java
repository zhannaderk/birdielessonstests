package co.inventorsoft.birdietests.utils;
//import myprojects.automation.assignment4.utils.logging.EventHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseTest {
   // protected EventFiringWebDriver driver;

    protected static WebDriver driver;



    public BaseTest(WebDriver driver) {
        this.driver = driver;

    }

    /**
     * @param browser Driver type to use in tests.
     *
     * @return New instance of {@link WebDriver} object.
     */
    private WebDriver getDriver(String browser) {
        switch (browser) {
            case "firefox":
                System.setProperty(
                        "webdriver.gecko.driver",
                        getResource("/geckodriver"));
                return new FirefoxDriver();
//            case "ie":
//            case "internet explorer":
//                System.setProperty(
//                        "webdriver.ie.driver",
//                        getResource("/IEDriverServer.exe"));
//                return new InternetExplorerDriver();
            case "chrome":
            default:
                System.setProperty(
                        "webdriver.chrome.driver",
                        getResource("/chromedriver"));
                return new ChromeDriver();
        }
    }

    /**
     * @param resourceName The name of the resource
     * @return Path to resource
     */
    private String getResource(String resourceName) {
        try {
            return Paths.get(BaseTest.class.getResource(resourceName).toURI()).toFile().getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return resourceName;
    }


    /**
     * Prepares {@link WebDriver} instance with timeout and browser window configurations.
     * Driver type is based on passed parameters to the automation project,
     * creates {@link ChromeDriver} instance by default.
     */
    @BeforeClass
    @Parameters("browser")
    // TODO use parameters from pom.xml to pass required browser type

    /**
     * Waits until page loader disappears from the page
     */
    //public void waitForContentLoad() {
        // TODO implement generic method to wait until page content is loaded

    public void setUp(String browser) {
        driver = new EventFiringWebDriver(getDriver(browser));
//        driver.register(new EventHandler());


        /**
         * Manage driver instance before test class execution.
         */

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

    }

    @AfterMethod

    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    /**
     * Closes driver instance after test class execution.
     */
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

