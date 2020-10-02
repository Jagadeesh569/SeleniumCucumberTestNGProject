package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features="src/test/java/features",
	    glue="stepDefinations",
	    plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
	    monochrome=true
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

		
}
