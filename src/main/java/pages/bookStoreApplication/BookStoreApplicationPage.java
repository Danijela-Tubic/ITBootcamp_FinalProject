package pages.bookStoreApplication;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class BookStoreApplicationPage extends BasePage {

    private By bsaPageLoginButton = By.id("login");
    private By bsaUserNameField = By.xpath("//*[@id=\"userName\"]");
    private By bsaPasswordField = By.xpath("//*[@id=\"password\"]");
    private By logoutButton = By.xpath("//*[@id='submit']");

    public BookStoreApplicationPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void loginButtonClick() {
        getDriver().findElement(bsaPageLoginButton).click();
    }

    public void enterUserName(String userName) {
        getDriver().findElement(bsaUserNameField).sendKeys(userName);
    }

    public void enterPassword(String password) {
        getDriver().findElement(bsaPasswordField).sendKeys(password);
    }

    public void bookStoreApplicationLogin(String userName, String password) {
        enterUserName(userName);
        enterPassword(password);
    }

    public void loginBtnClick() {
        getDriver().findElement(bsaPageLoginButton).click();
    }

    public boolean isLogoutButtonDisplayed() {
        return getDriver().findElement(logoutButton).isDisplayed();
    }

}
