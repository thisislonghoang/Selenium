import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExample {
    public static void main(String[] args) {

        // Khởi tạo WebDriver và mở trình duyệt
        System.setProperty("webdriver.chrome.driver", "/Applications/Katalon Studio Engine.app/Contents/Eclipse/configuration/resources/drivers/chromedriver_mac/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Mở trang web cần kiểm tra
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Điền thông tin đăng nhập
        //driver.findElement(By.id("username")).sendKeys("your_username");
        //driver.findElement(By.id("password")).sendKeys("your_password");

        // Nhấn nút đăng nhập
        //driver.findElement(By.id("loginButton")).click();

         //Đợi một chút để kiểm tra kết quả
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//           e.printStackTrace();
//        }

        // Đóng trình duyệt
//        driver.quit();
    }
}
