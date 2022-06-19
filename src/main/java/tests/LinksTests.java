package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LinksTests extends BaseTest {

    @BeforeMethod
    public void beforeLinkMethods() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
        getHomePage().elementsButtonClick();
        getHomePage().scrollDown();
        getElementsPage().linksClick();
    }

    @Test(priority = 1)
    public void verifyThatAfterClickingOnTheCreatedLinkDisplaysAMessage() {
        getLinks().createdLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 201 and status text Created");
    }

    @Test(priority = 2)
    public void verifyThatAfterClickingOnTheNoContentLinkDisplaysAMessage() {
        getLinks().noContentLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 204 and status text No Content");
    }

    @Test(priority = 3)
    public void verifyThatAfterClickingOnTheMovedLinkDisplaysAMessage() {
        getLinks().movedLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test(priority = 4)
    public void verifyThatAfterClickingOnTheBadRequestLinkDisplaysAMessage() {
        getLinks().badRequestLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 400 and status text Bad Request");
    }

    @Test(priority = 5)
    public void verifyThatAfterClickingOnTheUnauthorizedLinkDisplaysAMessage() {
        getLinks().unauthorizedClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 401 and status text Unauthorized");
    }

    @Test(priority = 6)
    public void verifyThatAfterClickingOnTheForbiddenLinkDisplaysAMessage() {
        getLinks().forbiddenLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 403 and status text Forbidden");
    }

    @Test(priority = 7)
    public void verifyThatAfterClickingOnTheNotFoundLinkDisplaysAMessage() {
        getLinks().invalidUrlLinkClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getLinks().getLinkResponse()));
        Assert.assertEquals(getLinks().linkResponseMessage(), "Link has responded with staus 404 and status text Not Found");
    }


}
