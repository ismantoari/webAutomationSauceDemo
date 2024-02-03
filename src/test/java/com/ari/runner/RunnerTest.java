package com.ari.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/cucumber.html","json:reports/cucumber.json"},
        features ={"src/test/resources"},
        tags = "@login or @sort or @atc or @cartpage or @checkout or @informationPage or @checkoutOverviewFinish",
        glue = {"com.ari.stepdef"}

)
public class RunnerTest {
}
