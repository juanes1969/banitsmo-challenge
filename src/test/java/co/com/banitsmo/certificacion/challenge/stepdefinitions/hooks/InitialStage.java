package co.com.banitsmo.certificacion.challenge.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class InitialStage {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
}
