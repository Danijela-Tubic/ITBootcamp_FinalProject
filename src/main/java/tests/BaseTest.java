package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.alerts.AlertsPage;
import pages.bookStoreApplication.BookStoreApplicationPage;
import pages.elements.*;
import pages.home.HomePage;


import java.time.Duration;

@Getter
public class BaseTest {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private HomePage homePage;
    private ElementsPage elementsPage;
    private ButtonsPage buttonsPage;
    private TextBoxPage textBoxPage;
    private CheckBox checkBox;
    private RadioButtonPage radioButtonPage;
    private WebTables webTables;
    private BookStoreApplicationPage bookStoreApplicationPage;
    private AlertsPage alertsPage;
    private Links links;
    private BrokenLinksAndImages brokenLinksAndImages;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tubic\\Desktop\\IT BOOTCAMP\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        this.homePage = new HomePage(driver, driverWait);
        this.elementsPage = new ElementsPage(driver, driverWait);
        this.checkBox = new CheckBox(driver, driverWait);
        this.radioButtonPage = new RadioButtonPage(driver, driverWait);
        this.webTables = new WebTables(driver, driverWait);
        this.buttonsPage = new ButtonsPage(driver, driverWait);
        this.textBoxPage = new TextBoxPage(driver, driverWait);
        this.links = new Links(driver, driverWait);
        this.brokenLinksAndImages = new BrokenLinksAndImages(driver, driverWait);
        this.bookStoreApplicationPage = new BookStoreApplicationPage(driver, driverWait);
        this.alertsPage = new AlertsPage(driver, driverWait);

    }

    public void openButtonsSteps(){
        getHomePage().elementsButtonClick();
        getHomePage().scrollDown();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getElementsPage().getButtonsElements()));
        getElementsPage().buttonsClick();
    }

    public void openCheckBoxSteps(){
        getHomePage().elementsButtonClick();
        getElementsPage().checkBoxClick();
    }

    public void openRadioButtonSteps(){
        getHomePage().elementsButtonClick();
        getElementsPage().radioBoxClick();
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

}
