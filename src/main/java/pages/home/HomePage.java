package pages.home;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class HomePage extends BasePage {

    private By elementsButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By elementsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By formsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By alertsFrameAndWindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By alertsFramaAndWindowsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By widgetsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By interactionsTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By bookStoreApplication = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");
    private By bookStoreApplicationTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");

    private By textMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)");
    }

    public String pageTextMessage() {
        return getDriver().findElement(textMessage).getText();
    }

    public void elementsButtonClick() {
        getDriver().findElement(elementsButton).click();
    }

    public String elementsTitle() {
        return getDriver().findElement(elementsTitle).getText();
    }

    public void formsButtonClick() {
        getDriver().findElement(forms).click();
    }

    public String titleForms() {
        return getDriver().findElement(formsTitle).getText();
    }

    public void alertsFrameAndWindowsButtonClick() {
        getDriver().findElement(alertsFrameAndWindows).click();
    }

    public String titleAlertsFrameAndWindows() {
        return getDriver().findElement(alertsFramaAndWindowsTitle).getText();
    }

    public void widgetsButtonClick() {
        getDriver().findElement(widgets).click();
    }

    public String titleWidgets() {
        return getDriver().findElement(widgetsTitle).getText();
    }

    public void interactionsButtonClick() {
        getDriver().findElement(interactions).click();
    }

    public String titleInteractions() {
        return getDriver().findElement(interactionsTitle).getText();
    }

    public void bookStoreApplicationButtonClick() {
        getDriver().findElement(bookStoreApplication).click();
    }

    public String titleBookStoreApplication() {
        return getDriver().findElement(bookStoreApplicationTitle).getText();
    }

}
