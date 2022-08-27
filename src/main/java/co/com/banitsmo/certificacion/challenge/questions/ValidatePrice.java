package co.com.banitsmo.certificacion.challenge.questions;

import co.com.banitsmo.certificacion.challenge.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.banitsmo.certificacion.challenge.userinterfaces.CartPage.*;

public class ValidatePrice implements Question<Boolean> {

    private final String courseDeleted;
    private final int price;

    public ValidatePrice(String courseDeleted, int price) {
        this.courseDeleted = courseDeleted;
        this.price = price;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String totalPriceObtained;
        Integer priceTotalObtained;

        actor.attemptsTo(Click.on(DELETE_ITEM.of(courseDeleted)));

        actor.attemptsTo(WaitUntil.the(LOADING, WebElementStateMatchers.isNotVisible()));

        actor.attemptsTo(Scroll.to(PRICE_TOTAL));
        totalPriceObtained = PRICE_TOTAL.resolveFor(actor).getText();

        totalPriceObtained = totalPriceObtained.substring(1, 6).replace(".0", "");


        priceTotalObtained = Integer.parseInt(totalPriceObtained);
        if (priceTotalObtained < price) {
            return true;
        }
        return false;
    }

    public static ValidatePrice isCorrect(String courseDeleted, Integer price) {
        return new ValidatePrice(courseDeleted, price);
    }
}
