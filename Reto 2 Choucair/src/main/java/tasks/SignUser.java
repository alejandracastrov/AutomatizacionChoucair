package tasks;

import model.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SignInPage;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignUser implements Task {


  private List<PersonalInformation> personalInformation;


    public SignUser(List<PersonalInformation> personalInformation) {
        this.personalInformation = personalInformation;
    }

    public static SignUser The(List<PersonalInformation> personalInformation) {

        return instrumented(SignUser.class,personalInformation);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(personalInformation.get(0).getEmail()).into(SignInPage.EMAIL),
                Click.on(SignInPage.BTN_CREATE_AN_ACCOUNT),
                Click.on(SignInPage.TITLE),
                Enter.theValue(personalInformation.get(0).getFirst_Name()).into(SignInPage.FIRST_NAME),
                Enter.theValue(personalInformation.get(0).getLast_name()).into(SignInPage.LAST_NAME),
                Click.on(SignInPage.EMAIL_2),
                Enter.theValue(personalInformation.get(0).getPassword()).into(SignInPage.PASSWORD),
                Click.on(SignInPage.INPUT_DAY_OF_BIRTH.of(personalInformation.get(0).getDay())),
                Click.on(SignInPage.INPUT_MONTH_OF_BIRTH.of(personalInformation.get(0).getMonth())),
                Click.on(SignInPage.INPUT_YEAR_OF_BIRTH.of(personalInformation.get(0).getYear())),
                Enter.theValue(personalInformation.get(0).getAddress()).into(SignInPage.ADDRESS),
                Enter.theValue(personalInformation.get(0).getCity()).into(SignInPage.CITY),
                Click.on(SignInPage.INPUT_STATE.of(personalInformation.get(0).getState())),
                Enter.theValue(personalInformation.get(0).getPostal_code()).into(SignInPage.POSTAL_CODE),
                Click.on(SignInPage.INPUT_COUNTRY),
                Enter.theValue(personalInformation.get(0).getMobile_phone()).into(SignInPage.MOBILE_PHONE),
                Enter.theValue(personalInformation.get(0).getAddress3()).into(SignInPage.ADDRESS3),
                Click.on(SignInPage.BTN_REGISTER)


);



    }
}
