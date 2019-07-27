package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.pages.ArtistProfilePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UnfollowTheArtist implements Task {

    private String artist;

    public UnfollowTheArtist(String artist) {
        this.artist = artist;
    }

    public static UnfollowTheArtist withName(String artist) {
        return instrumented(UnfollowTheArtist.class, artist);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().wasAbleTo(
                Click.on(ArtistProfilePage.UNFOLLOW_BUTTON));

    }
}
