package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty" ,                            // we creat fail
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features" ,   // use feature
        glue = "com/cydeo/step_defenitions" ,        // location code - step defenitions
        dryRun = false ,                             // take slipet
        tags = "@homework"
        //tags = "@smoke and not @@WE"
        //tags = "@smoke and/or @student"

)

public class CukesRunner {
}
