package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookStoreApplicationTests extends BaseTest {

    @BeforeMethod
    public void bsaBeforeMethod() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
    }

    @Test
    public void verifyLoginFunctionalityWithValidData() {

        String username = "Marko_Ma";
        String password = "Markomarkovic1!";

        getHomePage().scrollDown();
        getHomePage().bookStoreApplicationButtonClick();
        getBookStoreApplicationPage().loginButtonClick();
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(getBookStoreApplicationPage().getBsaUserNameField()));
        getBookStoreApplicationPage().bookStoreApplicationLogin(username, password);
        getBookStoreApplicationPage().loginBtnClick();
        Assert.assertTrue(getBookStoreApplicationPage().isLogoutButtonDisplayed());

    }

}
