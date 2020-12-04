package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Summary {

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Checkout")
            .locatedBy("//a[@class='btn btn-default button button-medium']");
    public static final Target CONFIRM_CHECKOUT = Target.the("Checkout")
            .locatedBy("//a[@class='button btn btn-default standard-checkout button-medium']");
}
