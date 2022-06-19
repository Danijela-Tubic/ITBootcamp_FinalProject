package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;
@Getter
public class Links extends BasePage  {

    private By createdLink = By.id("created");
    private By noContentLink = By.id("no-content");
    private By movedLink = By.id("moved");
    private By badRequestLink = By.id("bad-request");
    private By unauthorized = By.id("unauthorized");
    private By forbiddenLink = By.id("forbidden");
    private By invalidUrlLink = By.id("invalid-url");
    private By linkResponse = By.id("linkResponse");

    public Links(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void createdLinkClick (){
        getDriver().findElement(createdLink).click();
    }

    public void noContentLinkClick (){
        getDriver().findElement(noContentLink).click();
    }

    public void movedLinkClick (){
        getDriver().findElement(movedLink).click();
    }

    public void badRequestLinkClick (){
        getDriver().findElement(badRequestLink).click();
    }

    public void unauthorizedClick (){
        getDriver().findElement(unauthorized).click();
    }

    public void forbiddenLinkClick (){
        getDriver().findElement(forbiddenLink).click();
    }

    public void invalidUrlLinkClick (){
        getDriver().findElement(invalidUrlLink).click();
    }

    public String linkResponseMessage (){
        return getDriver().findElement(linkResponse).getText();
    }

}
