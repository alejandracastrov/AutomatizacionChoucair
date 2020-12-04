package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.AddressPage;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Address implements Task {

    public static Address The() {

        return instrumented(Address.class);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AddressPage.PROCEED_TO_CHECKOUT));


    }
}
