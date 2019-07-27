package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.pages.ArtistProfilePage;
import screenplay.pages.SearchPage;

public class Song {

    public static TargetText name(){
        return TheTarget.textOf(SearchPage.SEARCH_RESULT_TITLE);
    }
    public static TargetText artistName(){
        return TheTarget.textOf(SearchPage.SEARCH_RESULT_TYPE);
    }
}
