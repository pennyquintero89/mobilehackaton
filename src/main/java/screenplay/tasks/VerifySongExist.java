package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import screenplay.pages.ArtistProfilePage;
import screenplay.pages.SearchPage;
import screenplay.questions.Artist;
import screenplay.questions.Song;
import screenplay.utils.Constants;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VerifySongExist implements Task {


    public VerifySongExist(String song) {
        this.song = song;
    }

    private String song;

    public static VerifySongExist withName(String song){
        return instrumented(VerifySongExist.class, song);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().should(
               seeThat(the(SearchPage.SEARCH_RESULT_TITLE), isVisible()),
               seeThat(Song.name(), containsString(song)),
               seeThat(Song.artistName(), containsString(theActorInTheSpotlight().recall(Constants.ARTIST)))
        );

    }
}
