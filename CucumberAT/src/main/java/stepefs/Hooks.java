package stepefs;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.TestBase;

public class Hooks extends TestBase {

    @Before
    public void setup(){
        initBrowser();
        d.manage().window().maximize();
    }

    @After
    public void tearDown(){
        d.close();
    }


}
