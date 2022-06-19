package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksAndImagesTests extends BaseTest {

    @BeforeMethod
    public void beforeBrokenAndValidLinkMethods () {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
        getHomePage().elementsButtonClick();
        getHomePage().scrollDown();
        getElementsPage().brokenLinksAndImagesClick();
    }

    @Test
    public void verifyThatValidLinkRedirectsToHomePage (){
        getElementsPage().brokenLinksAndImagesClick();
        getBrokenLinksAndImages().validLinkClick();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void verifyThatInvalidLinkRedirectsToThePageWithMessage (){
        getHomePage().scrollDown();
        getBrokenLinksAndImages().invalidLinkClick();
        Assert.assertTrue(getBrokenLinksAndImages().invalidLinkMessageString().contains("This page returned a 500 status code."));
    }
}
