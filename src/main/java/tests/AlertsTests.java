package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {

    @BeforeMethod
    public void alertsBeforeMethod() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
        getHomePage().alertsFrameAndWindowsButtonClick();
        getHomePage().scrollDown();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getAlertsPage().getAllAlerts()));
        getAlertsPage().allAlertsClick();
    }

    @Test(priority = 1)
    public void verifyThatAlertPopsUpAfterClick() {
        getAlertsPage().buttonToSeeAlertClick();
        Assert.assertEquals(getAlertsPage().getAlertText(), "You clicked a button");
        getAlertsPage().closeAlert();
    }

    @Test(priority = 2)
    public void verifyThatAlertPopsUpAfterFiveSeconds() {
        getAlertsPage().timerAlertButtonClick();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getAlertsPage().getAlertText(), "This alert appeared after 5 seconds");
        getAlertsPage().closeAlert();
    }

    @Test(priority = 3)
    public void verifyThatConfirmBoxWorks() {
        getAlertsPage().confirmAlertButtonClick();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getAlertsPage().getAlertText(), "Do you confirm action?");
        getAlertsPage().closeAlert();
        Assert.assertTrue(getAlertsPage().isConfirmMessageDisplayed());
    }

    @Test(priority = 4)
    public void verifyThatPromptBoxWorks() {
        getAlertsPage().promptButtonAlertClick();
        getDriverWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getAlertsPage().getAlertText(), "Please enter your name");
        getAlertsPage().alertSendKeys("Danijela");
        getAlertsPage().closeAlert();
        Assert.assertEquals(getDriver().findElement(By.id("promptResult")).getText(), "You entered Danijela");
    }

}
