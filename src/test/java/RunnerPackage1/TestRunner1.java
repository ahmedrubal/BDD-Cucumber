package RunnerPackage1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber.html"}, //this step use for reporting also we can use format keyword
        features = "src/test/java/FeatureFile", // this step use to set to path of feature files
        glue = {"StepDefPackage1"}, // this step use to set the path of stepDefination class
        dryRun = true // it will check is there all steps available in a step defination package or not
       // monochrome = true // to get nice console output
)

public class TestRunner1 {


}
