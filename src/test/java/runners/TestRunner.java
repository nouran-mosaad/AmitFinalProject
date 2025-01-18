package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\finalprojectcucumber\\src\\main\\resources\\features" , glue = "steps", plugin = {"pretty" ,"html:target/reports/report.html" , "json:target/reports/report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
