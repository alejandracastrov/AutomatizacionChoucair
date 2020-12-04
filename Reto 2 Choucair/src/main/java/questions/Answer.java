package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Payment;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer tothe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message_order = Text.of(Payment.MESSAGE_ORDER).viewedBy(actor).asString();
        if(question.equals(message_order))
        {
            result=true;
        }
        else{
            result  =false;
        }

        return result;
    }
}
