package co.com.banitsmo.certificacion.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target COURSE = Target.the("Course selenium ruby").locatedBy("//ul/li/a/h3[contains(text(),'{0}')]//following::a[1]");
    public static final Target CART_CONTENTS = Target.the("Car contents shop").located(By.xpath("//a//span[contains(text(),'items')]"));
}
