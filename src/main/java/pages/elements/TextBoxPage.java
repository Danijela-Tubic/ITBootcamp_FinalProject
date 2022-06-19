package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class TextBoxPage extends BasePage {


    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By currentAddressField = By.id("currentAddress");
    private By permanentAddressField = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By informationField = By.xpath("//*[@id=\"output\"]/div");
    private By informationFieldName = By.id("name");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void enterFullName(String fullName) {
        getDriver().findElement(fullNameField).sendKeys(fullName);
    }

    public void enterEmail(String email) {
        getDriver().findElement(emailField).sendKeys(email);
    }

    public void enterCurrentAddress(String currentAddress) {
        getDriver().findElement(currentAddressField).sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        getDriver().findElement(permanentAddressField).sendKeys(permanentAddress);
    }

    public void submitButtonClick() {
        getDriver().findElement(submitButton).click();
    }

    public void fillTextBox(String fullName, String email, String currentAddress, String permanentAddress) {
        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
    }

    public boolean isInformationFieldDisplayed() {
        return getDriver().findElement(informationField).isDisplayed();
    }

    public String informationFieldNameText() {
        return getDriver().findElement(informationFieldName).getText();
    }

}
