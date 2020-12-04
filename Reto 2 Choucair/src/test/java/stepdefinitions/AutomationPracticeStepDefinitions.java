package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PersonalInformation;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;
import utils.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationPracticeStepDefinitions {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("^than maria wants to enter the page new experience$")
    public void thanMariaWantsToEnterThePageNewExperience() {
        theActorCalled("Maria");
        theActorInTheSpotlight().can(BrowseTheWeb.with(WebDriver.chrome()));
    }


    @When("^the search the dress in the New Experience$")
    public void theSearchTheDressInTheNewExperience(List<PersonalInformation> personalInformation) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchDresses.ThePage(), RegisterDress.The(), SignUser.The(personalInformation), Address.The(),SendDress.The(),Pay.The());
    }

    @Then("^She finds the dress called Printed Chiffon Dress$")
    public void sheFindsTheDressCalledPrintedChiffonDress(List<String> message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(message.get(1))));

    }
}
