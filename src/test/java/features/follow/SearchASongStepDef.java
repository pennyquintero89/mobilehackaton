package features.follow;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenplay.tasks.*;
import screenplay.utils.Constants;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchASongStepDef {


    @When("^he search for the song (.*) of (.*)$")
    public void he_search_a_song(String song, String artist) {
        theActorInTheSpotlight().remember(Constants.ARTIST, artist);
        theActorInTheSpotlight().remember(Constants.SONG, song);
        theActorInTheSpotlight().attemptsTo(SearchTheSong.withName(song));
    }

    @Then("^he should see that song exist in spotify$")
    public void he_verify()  {
        theActorInTheSpotlight().attemptsTo(VerifySongExist.withName(theActorInTheSpotlight().recall(Constants.SONG)));
    }
}
