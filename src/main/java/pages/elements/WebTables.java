package pages.elements;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

import java.util.List;
@Getter
public class WebTables extends BasePage {

    private By webTablesTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    private By addNewRecordButton = By.id("addNewRecordButton");
    private By newRecordFirstName = By.id("firstName");
    private By newRecordLastName = By.id("lastName");
    private By newRecordEmail = By.id("userEmail");
    private By newRecordAge = By.id("age");
    private By newRecordSalary = By.id("salary");
    private By newRecordDepartment = By.id("department");
    private By newRecordSubmitButton = By.id("submit");
    private By editButton = By.xpath("//*[@id=\"edit-record-4\"]");
    private By deleteButton = By.xpath("//*[@id=\"delete-record-4\"]");
    private By searchField = By.xpath("//*[@id=\"searchBox\"]");
    private By searchButton = By.xpath("//*[@id=\"basic-addon2\"]");
    private By searchResult = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div");


    public WebTables(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public String webTablesTitleString (){
        return getDriver().findElement(webTablesTitle).getText();
    }

    public boolean isNewRecordButtonDisplayed (){
        return getDriver().findElement(addNewRecordButton).isDisplayed();
    }

    public void addNewRecordButtonClick() {
        getDriver().findElement(addNewRecordButton).click();
    }

    public void enterFirstName(String firstName) {
        getDriver().findElement(newRecordFirstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getDriver().findElement(newRecordLastName).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        getDriver().findElement(newRecordEmail).sendKeys(email);
    }

    public void enterAge(String age) {
        getDriver().findElement(newRecordAge).sendKeys(age);
    }

    public void enterSalary(String salary) {
        getDriver().findElement(newRecordSalary).sendKeys(salary);
    }

    public void enterDepartment(String department) {
        getDriver().findElement(newRecordDepartment).sendKeys(department);
    }

    public void newRecordSubmitButtonClick() {
        getDriver().findElement(newRecordSubmitButton).click();
    }

    public void addNewRecordAll(String firstName, String lastName, String email, String age, String salary, String department) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);
        newRecordSubmitButtonClick();
    }

    public boolean checkIfNewRecordIsPartOfTheTable(String recordName) {
        List<WebElement> recordsInTable = getDriver().findElements(By.className("rt-table"));

            for (WebElement record : recordsInTable) {
                if (record.getText().contains(recordName)) {
                    return true;
                }
            }

            return false;
        }

        public void editButtonClick (){
        getDriver().findElement(editButton).click();
        }

        public void deleteButtonClick (){
        getDriver().findElement(deleteButton).click();
        }

        public void searchInput (String input){
        getDriver().findElement(searchField).sendKeys(input);
        }

        public void searchButtonClick (){
        getDriver().findElement(searchButton).click();
        }





    }

