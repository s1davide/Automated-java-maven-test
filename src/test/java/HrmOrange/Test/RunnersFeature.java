package HrmOrange.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "HrmOrange.Definitions" }, tags = {"@Lista"})

public class RunnersFeature {

}