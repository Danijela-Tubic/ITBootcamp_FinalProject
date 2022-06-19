package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

@Getter
public class BrokenLinksAndImages extends BasePage {

    public BrokenLinksAndImages(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    private By validLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]");
    private By invalidLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]");
    private By invalidLinkMessage = By.xpath("//*[@id=\"content\"]/div/p");

    public void validLinkClick (){
        getDriver().findElement(validLink).click();
    }

    public void invalidLinkClick (){
        getDriver().findElement(invalidLink).click();
    }

    public String invalidLinkMessageString (){
        return getDriver().findElement(invalidLinkMessage).getText();
    }


}
