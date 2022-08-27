package co.com.banitsmo.certificacion.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target DELETE_ITEM = Target.the("Item delete").locatedBy("//tbody/tr/td/a[contains(text(),'{0}')]//ancestor::tr/td[1]/a");
    public static final Target PRICE_TOTAL = Target.the("Item delete").locatedBy("//tbody/tr/th[contains(text(),'Total')]//following::td//span[@class='woocommerce-Price-amount amount']");
    public static final Target LOADING = Target.the("Loading").located(By.xpath("(//div[@class='blockUI blockOverlay'])[1]"));
}
