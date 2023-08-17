package test.java.com.webdriver.testcase.webdriver.tc001;

import main.java.com.webdriver.objectRepository.login.LoginTest;

public class ChangeInformationGift {
    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.setUp(); // Gọi phương thức setUp() để thiết lập môi trường
        loginTest.testValidLogin(); // Gọi phương thức kiểm thử từ lớp LoginTest
        loginTest.tearDown(); // Gọi phương thức tearDown() để kết thúc môi trường
    }
}
