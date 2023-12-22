package au.com.carsguide.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "au/com/carsguide/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = ""
)

public class RunCukeTest extends AbstractTestNGCucumberTests {


}
