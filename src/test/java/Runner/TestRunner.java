package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\Documents\\Assignment_cucu_ng\\src\\test\\resources\\Form\\Simple_Form.feature"
, glue = "FillUp")

public class TestRunner extends AbstractTestNGCucumberTests {

}
