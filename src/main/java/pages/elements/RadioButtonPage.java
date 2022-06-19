package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class RadioButtonPage extends BasePage {

    private By radioButtonTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By radioButtonMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[1]");
    private By radioButtonYes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By radioButtonAfterClickMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By radioButtonImpressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By radioButtonNo = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label");

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public String radioButtonTitle() {
        return getDriver().findElement(radioButtonTitle).getText();
    }

    public String radioButtonMessage() {
        return getDriver().findElement(radioButtonMessage).getText();
    }

    public void radioButtonYesClick() {
        getDriver().findElement(radioButtonYes).click();
    }

    public boolean isRadioButtonYesSelected (){
        return getDriver().findElement(radioButtonYes).isSelected();
    }

    public boolean isRadioButtonImpressiveSelected (){
        return getDriver().findElement(radioButtonImpressive).isSelected();
    }

    public String radioButtonAfterClickMessage() {
        return getDriver().findElement(radioButtonAfterClickMessage).getText();

    }

    public void radioButtonImpressiveClick() {
        getDriver().findElement(radioButtonImpressive).click();
    }

    public boolean isRadioButtonNoNotClickable() {
        return !getDriver().findElement(radioButtonNo).isEnabled();
    }

}
