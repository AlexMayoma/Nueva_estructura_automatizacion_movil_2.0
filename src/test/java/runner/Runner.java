package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/NuevaEstructura/Sprint1/HU1.feature",
        glue = "NuevaEstructura"
)
public class Runner {}
