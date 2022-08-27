package co.com.banitsmo.certificacion.challenge.stepdefinitions;

import co.com.banitsmo.certificacion.challenge.questions.ValidatePrice;
import co.com.banitsmo.certificacion.challenge.tasks.SelectTheCourses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidateTheTotalPriceOfTheCoursesStepDefinitions {

    @Given("That {word} is on the home page")
    public void thatJuanIsOnTheHomePage(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Open.url("https://practice.automationtesting.in/shop/"));
    }

    @When("Select the courses {} and {}")
    public void selectTheCoursesAnd(String course1, String course2) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheCourses.ofThePage(course1, course2));
    }

    @Then("Validate that when entering the cart and delete {} the price is less {int}")
    public void validateThatWhenEnteringTheCartAndDeleteThePriceIsLess(String courseDelete, Integer int1) {
    OnStage.theActorInTheSpotlight().should(seeThat(ValidatePrice.isCorrect(courseDelete, int1)));
    }

}
