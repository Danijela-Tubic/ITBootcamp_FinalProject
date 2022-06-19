package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class ElementsPage extends BasePage {

    private By textBox = By.id("item-0");
    private By textBoxTitle = By.xpath(("//*[@id=\"app\"]/div/div/div[1]"));
    private By checkBox = By.id("item-1");
    private By checkBoxTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    private By radioBox = By.xpath("//*[@id=\"item-2\"]");
    private By textMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]");
    private By webTables = By.id("item-3");
    private By buttonsElements = By.xpath("//*[@id=\"item-4\"]");
    private By links = By.xpath("//*[@id=\"item-5\"]");
    private By brokenLinksAndImages = By.xpath("//*[@id=\"item-6\"]");


    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void textBoxClick() {
        getDriver().findElement(textBox).click();
    }

    public String getTextBoxTitle() {
        return getDriver().findElement(textBoxTitle).getText();
    }

    public void checkBoxClick() {
        getDriver().findElement(checkBox).click();
    }

    public String getCheckBoxTitle() {
        return getDriver().findElement(checkBoxTitle).getText();
    }

    public void radioBoxClick() {
        getDriver().findElement(radioBox).click();
    }

    public void webTablesClick() {
        getDriver().findElement(webTables).click();
    }

    public void buttonsClick() {
        getDriver().findElement(buttonsElements).click();
    }

    public void linksClick() {
        getDriver().findElement(links).click();
    }

    public void brokenLinksAndImagesClick() {
        getDriver().findElement(brokenLinksAndImages).click();
    }



}
