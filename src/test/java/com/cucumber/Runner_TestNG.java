package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun = true, monochrome = true, features = {"src/test/resources/FeatureFiles"}, glue = {"com.cucumber"}, plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@Login", publish = true

)
public class Runner_TestNG extends AbstractTestNGCucumberTests {


}
