package pages.alerts;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class AlertsPage extends BasePage {
    private By allAlerts = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");
    private By buttonToSeeAlert = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By confirmAlertResult = By.id("confirmResult");
    private By promptButtonAlert = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void allAlertsClick() {
        getDriver().findElement(allAlerts).click();
    }

    public void buttonToSeeAlertClick() {
        getDriver().findElement(buttonToSeeAlert).click();
    }

    public void timerAlertButtonClick() {
        getDriver().findElement(timerAlertButton).click();
    }

    public void confirmAlertButtonClick() {
        getDriver().findElement(confirmAlertButton).click();
    }

    public boolean isConfirmMessageDisplayed() {
        return getDriver().findElement(confirmAlertResult).isDisplayed();
    }

    public void promptButtonAlertClick() {
        getDriver().findElement(promptButtonAlert).click();
    }

    public void alertSendKeys(String sendKeys) {
        getDriver().switchTo().alert().sendKeys(sendKeys);
    }

    public String getAlertText() {
        return getDriver().switchTo().alert().getText();
    }

    public void closeAlert() {
        getDriver().switchTo().alert().accept();
    }


}
