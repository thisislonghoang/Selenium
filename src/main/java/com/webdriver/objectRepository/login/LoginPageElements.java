package main.java.com.webdriver.objectRepository.login;

import org.openqa.selenium.By;
public class LoginPageElements {
    public static final By USERNAME_INPUT = By.xpath("//input[@placeholder='Username']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@placeholder='Password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");
    public static final By ERROR_MESSAGE = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
}
