package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.pages.ArtistProfilePage;
import screenplay.pages.SearchPage;

public class Artist {

    public static TargetText isFollowing(){
        return TheTarget.textOf(ArtistProfilePage.FOLLOW_BUTTON);
    }
    public static TargetText firstSearchResult(){
        return TheTarget.textOf(SearchPage.SEARCH_RESULT_TITLE);
    }
}
