package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import screenplay.pages.ArtistProfilePage;
import screenplay.questions.Artist;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class VerifyFollowed implements Task {


    public VerifyFollowed() {

    }

    public static VerifyFollowed withName(String artist){
        return instrumented(VerifyFollowed.class, artist);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
       theActorInTheSpotlight().should(
               seeThat(Artist.isFollowing(), equalTo(ArtistProfilePage.FOLLOWING))
        );

    }
}
