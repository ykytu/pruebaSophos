package co.com.prueba.expedia.step_definitions;

import co.com.prueba.expedia.model.ExpediaData;
import co.com.prueba.expedia.questions.IsShown;
import co.com.prueba.expedia.questions.itBeenSearched;
import co.com.prueba.expedia.tasks.*;
import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import co.com.prueba.expedia.util.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class SearchFlightsStepDefinition {

	private ExpediaHomePage expediaHomePage;

	@Before
	public void initialConfiguration() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^that \"([^\"]*)\" looks for the first product$")
	public void thatLooksForTheFirstProduct(String actorName) {
		OnStage.theActorCalled(actorName).wasAbleTo(OpenTheBrowser.on(expediaHomePage), GoTo.findOneWayFlights());
	}

	@When("^she completes the filter with \"([^\"]*)\"$")
	public void heCompletesTheFilterWith(List<ExpediaData> expediaData) {
		OnStage.theActorInTheSpotlight().wasAbleTo(CompleteTheForm.with(expediaData));
	}

	@When("^she add the papas to a car$")
	public void sheAddThePapasToACar() {
		//OnStage.theActorInTheSpotlight().wasAbleTo(ClickSelect.sort());
	}

	@Then("^she sees in the car the \"([^\"]*)\"$")
	public void sheSeesInTheCarThe(String arg1) {
		//OnStage.theActorInTheSpotlight()
		//.should(seeThat(itBeenSearched.theWord(), containsString(Constants.MESSAGE_VALIDATION)));
	}
}





