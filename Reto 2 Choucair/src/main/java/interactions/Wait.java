package interactions;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {

    private int seconds;
    public Wait(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

    }

    public static Wait aWhile(int seconds) {
        return Tasks.instrumented(Wait.class, seconds);
    }

}