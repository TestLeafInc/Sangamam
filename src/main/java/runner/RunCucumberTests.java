package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					dryRun = false, 
					features= {"src/main/java/features"},
					glue= {"pages","hooks"},
					monochrome = true
				
				)
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
