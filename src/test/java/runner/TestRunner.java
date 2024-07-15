package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",// il intereseaza folderul
        glue = "stepDefinition"
)

public class TestRunner extends AbstractTestNGCucumberTests {


}
