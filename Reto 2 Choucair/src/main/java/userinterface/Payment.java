package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Payment {

    public static final Target PAYMENT = Target.the("Order Processing")
            .locatedBy("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");

    public static final Target CONFIRM_ORDER = Target.the("Confirm Order")
            .locatedBy("//*[@id=\"cart_navigation\"]/button");

    public static final Target MESSAGE_ORDER = Target.the("COMPLETE_ORDER")
            .locatedBy("//*[@id='center_column']/div/p/strong");
}
