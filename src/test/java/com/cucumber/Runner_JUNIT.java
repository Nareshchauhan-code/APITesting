package com.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false, monochrome = true, features = {"src/test/resources/FeatureFiles"},
        glue = {"com.cucumber"}, plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@Login",publish = true

)
public class Runner_JUNIT {
}
