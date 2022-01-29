package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "C:\\Users\\SGTM\\IdeaProjects\\CucumberAT\\src\\test\\Features\\Sanity.feature" }, glue = {
        "stepefs",},
        plugin = { "pretty",
        "json:target/LaptopFeatureRunner.json" },
        tags={"@Sanity"})


public class TestRunner {
}
