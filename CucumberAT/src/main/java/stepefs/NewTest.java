package stepefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.TestBase;

public class NewTest extends TestBase {

    @Given("I am doing some test")
    public void i_am_doing_some_test() throws InterruptedException {
        d.get("https://demoqa.com/automation-practice-form");
        d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sabitu");
        d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gautam");
        d.findElement(By.id("userEmail")).sendKeys("sabitu3@gmail.com");
        d.findElement(By.xpath("//label[text()='Male']")).click();
        d.findElement(By.id("userNumber")).sendKeys("9716733142");
        d.findElement(By.id("dateOfBirthInput")).click();
        Thread.sleep(3000);
        d.findElement(By.xpath("//div[@class='react-datepicker__month-container']//div[text()='19']")).click();
//        d.findElement(By.id("subjectsContainer")).click();
//        Thread.sleep(1000);
//        d.findElement(By.xpath("//*[text()='Hindi']")).click();

            d.findElement(By.xpath("//label[text()='Sports']")).click();
            Thread.sleep(3000);
        WebElement el= d.findElement(By.xpath("//div[text()='Select State']"));
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("arguments[0].scrollIntoView();",el);
        el.click();

            d.findElement(By.xpath("//div[@class=' css-11unzgr']//div[text()='Haryana']")).click();
        Thread.sleep(3000);

    }
}
