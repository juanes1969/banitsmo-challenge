package co.com.banitsmo.certificacion.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banitsmo.certificacion.challenge.userinterfaces.HomePage.*;

public class SelectTheCourses implements Task {

    private final String course1;
    private final String course2;

    public SelectTheCourses(String course1, String course2) {
        this.course1 = course1;
        this.course2 = course2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COURSE.of(course1)));
        actor.attemptsTo(Click.on(COURSE.of(course2)));
        actor.attemptsTo(Click.on(CART_CONTENTS));
    }

    public static SelectTheCourses ofThePage(String course1, String course2) {

        return Tasks.instrumented(SelectTheCourses.class, course1, course2);
    }

}
