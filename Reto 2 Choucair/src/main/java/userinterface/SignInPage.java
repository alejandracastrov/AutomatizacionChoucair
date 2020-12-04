package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignInPage {

    public static final Target EMAIL = Target.the("where do we write the Email")
            .located(By.id("email_create"));
    public static final Target BTN_CREATE_AN_ACCOUNT = Target.the("where do we write create an account")
            .located(By.id("SubmitCreate"));
    public static final Target TITLE = Target.the("where do we write Gender")
            .located(By.id("id_gender2"));
    public static final Target FIRST_NAME = Target.the("where do we write First Name")
            .located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("where do we write Last Name")
            .located(By.id("customer_lastname"));
    public static final Target EMAIL_2 = Target.the("where do we write second email")
            .located(By.id("email"));
    public static final Target PASSWORD = Target.the("where do we write password")
            .located(By.id("passwd"));
    public static final Target INPUT_DAY_OF_BIRTH = Target.the("where do we write the day of birth")
            .locatedBy("#days option[value='{0}']");
    public static final Target INPUT_MONTH_OF_BIRTH = Target.the("where do we write the day of birth")
            .locatedBy("#months option[value='{0}']");
    public static final Target INPUT_YEAR_OF_BIRTH = Target.the("where do we write the year of birth")
            .locatedBy("#years option[value='{0}']");
    public static final Target ADDRESS = Target.the("where do we write address")
            .located(By.id("address1"));
    public static final Target ADDRESS2 = Target.the("where do we write address2")
            .located(By.id("address2"));
    public static final Target CITY = Target.the("where do we write city")
            .located(By.id("city"));
    public static final Target INPUT_STATE = Target.the("where do we write the state")
            .locatedBy("#id_state option[value='{0}']");
    public static final Target POSTAL_CODE = Target.the("where do we write postcode")
            .located(By.id("postcode"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write country")
            .locatedBy("#id_country option[value='21']");
    public static final Target PHONE = Target.the("where do we write postcode")
            .located(By.id("phone"));
    public static final Target MOBILE_PHONE = Target.the("where do we write mobile_phone")
            .located(By.id("phone_mobile"));
    public static final Target ADDRESS3 = Target.the("where do we write ADDRESS3")
            .located(By.id("alias"));
    public static final Target BTN_REGISTER = Target.the("BTN REGISTER")
            .located(By.id("submitAccount"));




}
