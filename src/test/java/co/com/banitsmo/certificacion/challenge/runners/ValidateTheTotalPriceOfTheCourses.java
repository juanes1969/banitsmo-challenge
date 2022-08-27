package co.com.banitsmo.certificacion.challenge.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validate_the_total_price_of_the_courses.feature",
        glue = "co.com.banitsmo.certificacion.challenge.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ValidateTheTotalPriceOfTheCourses {
}
