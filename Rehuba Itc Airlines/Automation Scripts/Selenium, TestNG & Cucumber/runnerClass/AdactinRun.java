package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="features",
		glue = "stepDefinitions",
		monochrome = true,
		dryRun = false
//		tags = "@P01"
		)
public class AdactinRun {

}
