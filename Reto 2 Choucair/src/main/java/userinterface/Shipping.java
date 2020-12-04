package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Shipping {

    public static final Target CHECKBOX_TERMS_OF_SERVICE = Target.the("where do we write TERMS_OF_SERVICE")
            .located(By.id("cgv"));
    public static final Target PROCEED_TO_CHECKOUT = Target.the("Checkout")
            .locatedBy("//button[@class='button btn btn-default standard-checkout button-medium']");
}
