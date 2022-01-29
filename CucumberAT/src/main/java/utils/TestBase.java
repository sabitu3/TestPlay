package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver d;
    public void initBrowser(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        d= new ChromeDriver();
    }

}
