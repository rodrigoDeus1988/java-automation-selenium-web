package testRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/",
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm",
                "pretty","json:target/json-cucumber-reports/cucumber.json",
                "html:target/json-cucumber-reports-html/",
                "junit:target/xml-junit/junit.xml"},
        glue = {"steps", "hooks"},
        dryRun = false


)
public class RunnerTest {
}
