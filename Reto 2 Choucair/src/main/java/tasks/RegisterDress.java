package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.Summary;

public class RegisterDress implements Task {


    public static RegisterDress The() {

        return Tasks.instrumented(RegisterDress.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Summary.PROCEED_TO_CHECKOUT),
                Click.on(Summary.CONFIRM_CHECKOUT)
        );
    }
}
