package com.ari.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features ={"src/test/resources"},
        tags = "@login",
        glue = {"stepdef"}

)
public class RunnerTest {
}
