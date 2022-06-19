package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class CheckBox extends BasePage {

    private By homeButton = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]");
    private By homeArrow = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
    private By desktopArrow = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button");
    private By resultAfterDesktopButtonClick = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/span[2]");
    private By notes = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]");
    private By commands = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]");
    private By resultAfterHomeButtonClick = By.xpath("//*[@id=\"result\"]/span[2]");
    private By desktopCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");
    private By documentsCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]");
    private By downloadCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]");

    public CheckBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public boolean isCheckBoxHomeButtonDisplayed() {
        return getDriver().findElement(homeButton).isDisplayed();
    }

    public void checkBoxHomeButtonClick() {
        getDriver().findElement(homeButton).click();
    }

    public void checkBoxHomeArrowClick() {
        getDriver().findElement(homeArrow).click();
    }

    public void checkBoxDesktopClick (){
        getDriver().findElement(desktopCheckBox).click();
    }

    public void checkBoxDesktopArrowClick (){
        getDriver().findElement(desktopArrow).click();
    }

    public boolean isNotesSectionDisplayed (){
        return getDriver().findElement(notes).isDisplayed();
    }

    public boolean isCommandsSectionDisplayed (){
        return getDriver().findElement(commands).isDisplayed();
    }

    public String desktopResultMessage (){
        return getDriver().findElement(resultAfterDesktopButtonClick).getText();
    }

    public String homeResultMessage (){
        return getDriver().findElement(resultAfterHomeButtonClick).getText();
    }

    public boolean isDesktopSectionDisplayed() {
        return getDriver().findElement(desktopCheckBox).isDisplayed();
    }

    public boolean isDocumentsSectionDisplayed (){
        return getDriver().findElement(documentsCheckBox).isDisplayed();
    }

    public boolean isDownloadsSectionDisplayed (){
        return getDriver().findElement(downloadCheckBox).isDisplayed();
    }

    public boolean isResultMessageDisplayed (){
        return getDriver().findElement(resultAfterHomeButtonClick).isDisplayed();
    }

}
