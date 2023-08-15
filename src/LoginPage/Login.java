package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login {
    public static void main(String[] args) throws IOException {

        // Đọc tệp tin cấu hình
        Properties properties = new Properties();
        FileInputStream configFile = new FileInputStream("src/LoginPage/configLogin.properties");
        properties.load(configFile);

        // Đọc giá trị của chromedriver.path từ tệp tin cấu hình
        String chromedriverPath = properties.getProperty("chromedriver.path");

        // Khởi tạo ChromeDriver với đường dẫn đã đọc
        System.setProperty("webdriver.chrome.driver", chromedriverPath);
        WebDriver driver = new ChromeDriver();

        // Mở trang web cần kiểm tra
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // In ra URL của trang hiện tại
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        //Mazimize current window
        driver.manage().window().maximize();

        // Đợi cho đến khi phần tử xuất hiện trên trang
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration.ofSeconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

        // Nhập thông tin đăng nhập
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));

        String username = "Admin";
        String password = "admin123";

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // In ra giá trị của username
        System.out.println("Username: " + username);
        System.out.println("Username: " + password);

        // Nhấn nút đăng nhập
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Đợi một chút để kiểm tra kết quả
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Đóng trình duyệt
        driver.quit();
    }
}
