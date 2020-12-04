package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddressPage {

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Checkout")
            .locatedBy("//button[@class='button btn btn-default button-medium']");

}
