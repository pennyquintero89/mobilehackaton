package screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TypeAndEnter implements Interaction {

    private Target target;
    private String keyword;

    public TypeAndEnter(Target target, String keyword) {
        this.target = target;
        this.keyword = keyword;
    }

    public static TypeAndEnter with(Target target, String keyword){
        return instrumented(TypeAndEnter.class, target, keyword);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(target),
                Enter.theValue(keyword)
                        .into(target)
        );
    }
}
