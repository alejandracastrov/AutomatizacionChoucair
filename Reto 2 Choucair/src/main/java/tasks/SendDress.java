package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.AddressPage;
import userinterface.Shipping;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendDress implements Task {



        public static SendDress The() {

            return instrumented(SendDress.class);
        }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Shipping.CHECKBOX_TERMS_OF_SERVICE),
                Click.on(Shipping.PROCEED_TO_CHECKOUT));


    }


}
