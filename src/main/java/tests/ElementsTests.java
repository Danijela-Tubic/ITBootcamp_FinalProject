package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTests extends BaseTest {

    @BeforeMethod
    public void elementsBeforeMethod() {
        getDriver().navigate().to("https://demoqa.com/");
        getDriver().manage().window().maximize();
    }

    String firstName = "Ivan";
    String lastName = "Ivanović";
    String fullName = "Ivan Ivanović";
    String email = "ivan.ivanovic@gmail.com";
    String currentAddress = "Bulevar oslobođenja 13";
    String permanentAddress = "Bulevar oslobođenja 13";
    String age = "23";
    String salary = "1200";
    String department = "QA";

    @Test
    public void verifyThatTextBoxFeatureWorks() {
        getHomePage().elementsButtonClick();
        getElementsPage().textBoxClick();
        Assert.assertEquals(getElementsPage().getTextBoxTitle(), "Text Box");
        getTextBoxPage().fillTextBox(fullName, email, currentAddress, permanentAddress);
        getHomePage().scrollDown();
        getTextBoxPage().submitButtonClick();
        Assert.assertTrue(getTextBoxPage().isInformationFieldDisplayed());
        Assert.assertTrue(getTextBoxPage().informationFieldNameText().contains(fullName));

    }

    @Test
    public void verifyThatHomeSectionInCheckBoxPageCanBeSelected() {
        openCheckBoxSteps();
        Assert.assertEquals(getElementsPage().getCheckBoxTitle(), "Check Box");
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getCheckBox().getHomeButton()));
        Assert.assertTrue(getCheckBox().isCheckBoxHomeButtonDisplayed());
        getCheckBox().checkBoxHomeButtonClick();
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(getCheckBox().getResultAfterHomeButtonClick()));
        Assert.assertTrue(getCheckBox().isResultMessageDisplayed());
        Assert.assertTrue(getCheckBox().homeResultMessage().contains("home"));

    }

    @Test
    public void verifyThatFirstArrowInCheckBoxPageWorks() {
        openCheckBoxSteps();
        getCheckBox().checkBoxHomeArrowClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getCheckBox().getDesktopCheckBox()));
        Assert.assertTrue(getCheckBox().isDesktopSectionDisplayed());
        Assert.assertTrue(getCheckBox().isDocumentsSectionDisplayed());
        Assert.assertTrue(getCheckBox().isDownloadsSectionDisplayed());
    }

    @Test
    public void verifyThatDesktopSectionInCheckBoxCanBeSelected() {
        openCheckBoxSteps();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getCheckBox().getHomeButton()));
        Assert.assertTrue(getCheckBox().isCheckBoxHomeButtonDisplayed());
        getCheckBox().checkBoxHomeArrowClick();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getCheckBox().getDesktopCheckBox()));
        getCheckBox().checkBoxDesktopClick();
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(getCheckBox().getResultAfterDesktopButtonClick()));
        Assert.assertTrue(getCheckBox().desktopResultMessage().contains("desktop"));
        getCheckBox().checkBoxDesktopArrowClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getCheckBox().getNotes()));
        Assert.assertTrue(getCheckBox().isNotesSectionDisplayed());
        Assert.assertTrue(getCheckBox().isCommandsSectionDisplayed());
    }

    @Test
    public void verifyThatClickOnRadioButtonsSectionWorks() {
        openRadioButtonSteps();
        Assert.assertEquals(getRadioButtonPage().radioButtonTitle(), "Radio Button");
        Assert.assertEquals(getRadioButtonPage().radioButtonMessage(), "Do you like the site?");
    }

    @Test
    public void verifyYesButtonFunctionality() {
        openRadioButtonSteps();
        getRadioButtonPage().radioButtonYesClick();
        Assert.assertEquals(getRadioButtonPage().radioButtonAfterClickMessage(), "You have selected Yes");
        Assert.assertFalse(getRadioButtonPage().isRadioButtonImpressiveSelected());

    }

    @Test
    public void verifyImpressiveButtonFunctionality() {
        openRadioButtonSteps();
        getRadioButtonPage().radioButtonImpressiveClick();
        Assert.assertEquals(getRadioButtonPage().radioButtonAfterClickMessage(), "You have selected Impressive");
        Assert.assertFalse(getRadioButtonPage().isRadioButtonYesSelected());
    }

    @Test
    public void verifyThatNoButtonCannotBeSelected() {
        openRadioButtonSteps();
        Assert.assertFalse(getRadioButtonPage().isRadioButtonNoNotClickable());
    }

    @Test
    public void verifyWebTablesButtonFunctionality() {
        getHomePage().elementsButtonClick();
        getElementsPage().webTablesClick();
        Assert.assertEquals(getWebTables().webTablesTitleString(), "Web Tables");
        Assert.assertTrue(getWebTables().isNewRecordButtonDisplayed());

    }

    @Test
    public void verifyAddUserButtonFunctionality() {

        getHomePage().elementsButtonClick();
        getElementsPage().webTablesClick();
        getWebTables().addNewRecordButtonClick();
        getWebTables().addNewRecordAll(firstName, lastName, email, age, salary, department);
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));
    }

    @Test
    public void verifyEditFunctionalityInWebTable() {
        getHomePage().elementsButtonClick();
        getElementsPage().webTablesClick();
        getWebTables().addNewRecordButtonClick();
        getWebTables().addNewRecordAll(firstName, lastName, email, age, salary, department);
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));
        getWebTables().editButtonClick();
        getWebTables().enterFirstName("Petar");
        getWebTables().newRecordSubmitButtonClick();
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable("Petar"));

    }

    @Test
    public void verifyDeleteFunctionalityInWebTablePage () {
        getHomePage().elementsButtonClick();
        getElementsPage().webTablesClick();
        getWebTables().addNewRecordButtonClick();
        getWebTables().addNewRecordAll(firstName, lastName, email, age, salary, department);
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));
        getWebTables().deleteButtonClick();
        Assert.assertFalse(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));
    }

    @Test
    public void verifySearchFunctionalityInTheWebTablePage() {
        getHomePage().elementsButtonClick();
        getElementsPage().webTablesClick();
        getWebTables().addNewRecordButtonClick();
        getWebTables().addNewRecordAll(firstName, lastName, email, age, salary, department);
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));
        getWebTables().searchInput(firstName);
        getWebTables().searchButtonClick();
        Assert.assertTrue(getWebTables().checkIfNewRecordIsPartOfTheTable(firstName));

    }

    @Test
    public void verifyDoubleClickButtonFunctionality() {
        openButtonsSteps();
        getButtonsPage().doubleClickButtonClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getButtonsPage().getDoubleClickMessage()));
        Assert.assertEquals(getButtonsPage().doubleClickButtonMessage(), "You have done a double click");
    }

    @Test
    public void verifyRightClickButtonFunctionality() {
        openButtonsSteps();
        getButtonsPage().rightClickButtonClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getButtonsPage().getRightClickMessage()));
        Assert.assertEquals(getButtonsPage().rightClickButtonMessage(), "You have done a right click");
    }

    @Test
    public void verifyClickMeButtonFunctionality() {
        openButtonsSteps();
        getDriverWait().until(ExpectedConditions.elementToBeClickable(getButtonsPage().getOneClickButton()));
        getButtonsPage().oneClickButtonClick();
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(getButtonsPage().getOneClickMessage()));
        Assert.assertEquals(getButtonsPage().oneClickButtonMessage(), "You have done a dynamic click");
    }


}
