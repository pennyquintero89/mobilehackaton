package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.interactions.GoToSearch;
import screenplay.interactions.TypeAndEnter;
import screenplay.pages.SearchPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchTheSong implements Task {

    private String song;

    public SearchTheSong(String song) {
        this.song = song;
    }

    public static SearchTheSong withName(String song){
        return instrumented(SearchTheSong.class, song);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().wasAbleTo(
                GoToSearch.page(),
                Click.on(SearchPage.SEARCH_FIELD),
                TypeAndEnter.with(SearchPage.SEARCH_QUERY_FIElD, song),
                Click.on(SearchPage.FIRST_SEARCH_RESULT));

    }
}
