package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.Payment;
import userinterface.Shipping;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pay implements Task {



    public static Pay The() {

        return instrumented(Pay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Payment.PAYMENT),
        Click.on(Payment.CONFIRM_ORDER));
    }
}
