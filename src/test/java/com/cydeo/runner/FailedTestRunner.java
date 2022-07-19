package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt" ,   // we rerun test, we use @ because it located from another level
        glue = "com/cydeo/step_defenitions"  // location code - step definitions


)


public class FailedTestRunner {

}
