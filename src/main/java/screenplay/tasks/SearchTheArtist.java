package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.interactions.GoToSearch;
import screenplay.interactions.TypeAndEnter;
import screenplay.pages.SearchPage;
import screenplay.questions.Artist;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchTheArtist implements Task {

    private String artist;

    public SearchTheArtist(String artist) {
        this.artist = artist;
    }

    public static SearchTheArtist withName(String artist){
        return instrumented(SearchTheArtist.class, artist);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().wasAbleTo(
                GoToSearch.page(),
                Click.on(SearchPage.SEARCH_FIELD),
                TypeAndEnter.with(SearchPage.SEARCH_QUERY_FIElD, artist),
                Click.on(SearchPage.FIRST_SEARCH_RESULT));

    }
}
