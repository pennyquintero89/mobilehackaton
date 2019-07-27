package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.pages.ArtistProfilePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FollowTheArtist implements Task {

    private String artist;

    public FollowTheArtist(String artist) {
        this.artist = artist;
    }

    public static FollowTheArtist withName(String artist){
        return instrumented(FollowTheArtist.class, artist);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().wasAbleTo(
                Click.on(ArtistProfilePage.FOLLOW_BUTTON));

    }
}
