package stepefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestBase;

import java.util.List;


public class Test extends TestBase {
    public static String links[]=null;

    @Given("I have browser opened and url is navigated")
    public void i_have_browser_opened_and_url_is_navigated() throws InterruptedException {

        d.get("https://www.easemytrip.com/");
        List<WebElement> linkss= d.findElements(By.tagName("a"));
        int linksCount = linkss.size();
        links = new String[linksCount];



        for(int i =0; i<linkss.size(); i++){
            System.out.println("inside loop "+i);
            links[i]=linkss.get(i).getAttribute("href");
            System.out.println("links are "+linkss.get(i).getAttribute("href"));
        }

        for(int i=3; i<linksCount; i=i+2){
            System.out.println("inside second for loop "+i);
            if(!(links[i] ==null))
            d.navigate().to(links[i]);
            Thread.sleep(3000);
        }
    }
}
