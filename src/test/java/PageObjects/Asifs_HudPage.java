package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asifs_HudPage extends BasePage{

    @FindBy(xpath = "//*[@data-testid='universalPlus']")
    public WebElement universalPlusIcon;

    @FindBy(xpath = "//*[@data-testid='createCandidate']")
    public WebElement universalPlusIcon_CreateCandidate;

    @FindBy(xpath = "//*[@data-cy='created_candidate_snackbar']")
    public WebElement notification_CreatedCandidate;

    public Asifs_HudPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }
}
