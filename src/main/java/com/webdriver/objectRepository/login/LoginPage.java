package main.java.com.webdriver.objectRepository.login;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(LoginPageElements.USERNAME_INPUT).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginPageElements.PASSWORD_INPUT).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(LoginPageElements.LOGIN_BUTTON).click();
    }
    public String getErrorMessage() {
        return driver.findElement(LoginPageElements.ERROR_MESSAGE).getText();
    }
}
