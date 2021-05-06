package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asifs_NewCandidatePage extends BasePage {

    @FindBy(xpath = "//input[@data-testid='first-name']")
    public WebElement firstNameTextfield;

    @FindBy(xpath = "//input[@data-testid='family-name']")
    public WebElement familyNameTextfield;

    @FindBy(xpath = "//*[@data-testid='city']")
    public WebElement ciyTextfield;

    @FindBy(xpath = "//*[@data-cy='add-contact']")
    public WebElement contact_PlusIcon;

    @FindBy(xpath = "//*[@data-testid='mobile-contact-option']")
    public WebElement contact_MobileNumber;

    @FindBy(xpath = "//*[@data-testid='email-contact-option']")
    public WebElement contact_EmailAddress;

    @FindBy(xpath = "//*[@data-testid='testIdSubmit']")
    public WebElement createButton;

    public Asifs_NewCandidatePage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
