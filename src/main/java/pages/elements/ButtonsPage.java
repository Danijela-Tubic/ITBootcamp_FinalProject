package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class ButtonsPage extends BasePage {

    private By doubleClickButton = By.id("doubleClickBtn");
    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickButton = By.id("rightClickBtn");
    private By rightClickMessage = By.id("rightClickMessage");
    private By oneClickButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By oneClickMessage = By.id("dynamicClickMessage");


    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public void doubleClickButtonClick() {
        Actions actions = new Actions(getDriver());
        WebElement doubleClick = getDriver().findElement(doubleClickButton);
        actions.doubleClick(doubleClick).perform();

    }

    public String doubleClickButtonMessage() {
        return getDriver().findElement(doubleClickMessage).getText();
    }

    public void rightClickButtonClick() {
        Actions actions = new Actions(getDriver());
        WebElement rightClick = getDriver().findElement(rightClickButton);
        actions.contextClick(rightClick).perform();
    }

    public String rightClickButtonMessage() {
        return getDriver().findElement(rightClickMessage).getText();
    }


    public void oneClickButtonClick() {
        getDriver().findElement(oneClickButton).click();
    }

    public String oneClickButtonMessage() {
        return getDriver().findElement(oneClickMessage).getText();
    }


}
