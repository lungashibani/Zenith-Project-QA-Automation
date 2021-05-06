package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asifs_LoginPage extends BasePage {

    @FindBy(id = "loginId")
    public WebElement emailTextField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@class='blue button']")
    public WebElement submitButton;

    public Asifs_LoginPage(WebDriver newDriver, WebDriverWait newWait) {
        super(newDriver, newWait);
    }

    public void OpenPage() {
        webDriver.get("https://sit.digitalzenith.io/");
    }
}
