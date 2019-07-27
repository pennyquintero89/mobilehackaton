package features.follow;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenplay.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FollowAnArtistStepDef {


    @And("^he search for the artist (.*)$")
    public void he_search_the_artist(String artist) {
        theActorInTheSpotlight().attemptsTo(SearchTheArtist.withName(artist));
    }

    @When("^he follows the artist (.*)$")
    public void he_follows(String artist) {
        theActorInTheSpotlight().attemptsTo(FollowTheArtist.withName(artist));
    }

    @When("^he unfollows the artist (.*)$")
    public void he_unfollows(String artist) {
        theActorInTheSpotlight().attemptsTo(UnfollowTheArtist.withName(artist));
    }

    @Then("^he should see that he is now following (.*)$")
    public void he_is_now_following(String artist)  {
        theActorInTheSpotlight().attemptsTo(VerifyFollowed.withName(artist));
    }

    @Then("^he should see that he is now not following (.*)$")
    public void he_is_not_now_following(String artist)  {
        theActorInTheSpotlight().attemptsTo(VerifyNotFollowing.withName(artist));
    }
}
