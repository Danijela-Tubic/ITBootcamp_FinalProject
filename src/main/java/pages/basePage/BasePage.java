package pages.basePage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

@Getter
@AllArgsConstructor
@Setter

public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    @BeforeClass
    public void beforeClassWait (){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
    }

}
