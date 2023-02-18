package RunnerPackage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber.html"},
        features = "src/test/java/FeatureFile",
        glue = {"StepDefPackage"}

       // monochrome = true
)

public class TestRunner {


}
