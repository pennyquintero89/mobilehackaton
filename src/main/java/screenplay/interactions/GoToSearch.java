package screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.pages.Dashboard;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToSearch implements Interaction {

    public static GoToSearch page() {
        return instrumented(GoToSearch.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().wasAbleTo(
                WaitUntil.the(Dashboard.SEARCH_BUTTON, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Dashboard.SEARCH_BUTTON));
    }
}
