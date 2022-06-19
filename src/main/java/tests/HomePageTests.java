package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {

    @BeforeMethod
    public void homePageBeforeMethod() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
        getHomePage().scrollDown();
    }

    @Test
    public void verifyElementsButtonSectionFunctionality() {
        getHomePage().elementsButtonClick();
        Assert.assertEquals(getHomePage().elementsTitle(), "Elements");
        Assert.assertEquals(getHomePage().pageTextMessage(), "Please select an item from left to start practice.");
    }

    @Test
    public void verifyFormsButtonSectionFunctionality() {
        getHomePage().formsButtonClick();
        Assert.assertEquals(getHomePage().titleForms(), "Forms");
        Assert.assertEquals(getHomePage().pageTextMessage(), "Please select an item from left to start practice.");
    }

    @Test
    public void verifyAlertsFrameAndWindowsButtonSectionFunctionality() {
        getHomePage().alertsFrameAndWindowsButtonClick();
        Assert.assertEquals(getHomePage().titleAlertsFrameAndWindows(), "Alerts, Frame & Windows");
        Assert.assertEquals(getHomePage().pageTextMessage(), "Please select an item from left to start practice.");

    }

    @Test
    public void verifyWidgetsButtonSectionFunctionality() {
        getHomePage().widgetsButtonClick();
        Assert.assertEquals(getHomePage().titleWidgets(), "Widgets");
        Assert.assertEquals(getHomePage().pageTextMessage(), "Please select an item from left to start practice.");

    }

    @Test
    public void verifyInteractionsButtonSectionFunctionality() {
        getHomePage().interactionsButtonClick();
        Assert.assertEquals(getHomePage().titleInteractions(), "Interactions");
        Assert.assertEquals(getHomePage().pageTextMessage(), "Please select an item from left to start practice.");

    }

    @Test
    public void verifyBookStoreApplicationButtonSectionFunctionality() {
        getHomePage().bookStoreApplicationButtonClick();
        Assert.assertEquals(getHomePage().titleBookStoreApplication(), "Book Store");
    }

}
