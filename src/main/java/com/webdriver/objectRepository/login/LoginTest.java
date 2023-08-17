package main.java.com.webdriver.objectRepository.login;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();

        // Đợi cho đến khi phần tử nhập tên người dùng xuất hiện trên trang
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(LoginPageElements.USERNAME_INPUT));

        String username = "Admin"; // Lưu tên người dùng vào biến
        String password = "admin123"; // Lưu tên người dùng vào biến
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        // Assuming successful login redirects to dashboard
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Login was not successful");

        // In ra log tên người dùng đã đăng nhập
        System.out.println("Logged in with username: " + username);
        System.out.println("Logged in with password: " + password);

        // Chờ 3 giây trước khi kết thúc testcase
        try {
            Thread.sleep(3000); // Chờ 3000 milliseconds (3 giây)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("123");
        loginPage.enterPassword("456");
        loginPage.clickLoginButton();

        // Assuming invalid login displays an error message
        String expectedErrorMessage = "Invalid credentials";
        String actualErrorMessage = loginPage.getErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message did not match");
    }
}

