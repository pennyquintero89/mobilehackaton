package screenplay.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {

    public static Target PAGE_TITLE= Target.the("Search Page Title").located(MobileBy.id("com.spotify.music:id/header_title"));
    public static Target SEARCH_FIELD= Target.the("Search Field").located(MobileBy.id("com.spotify.music:id/find_search_field"));
    public static Target CATEGORY_TITLE= Target.the("Category Title").located(MobileBy.id("com.spotify.music:id/find_title_text"));
    public static Target SEARCH_QUERY_FIElD= Target.the("Search Query Title").located(MobileBy.id("com.spotify.music:id/query"));
    public static Target SEARCH_RESULT_LABELS= Target.the("Search Results Labels").located(MobileBy.id("com.spotify.music:id/labels"));
    public static Target SEARCH_RESULT_ROWS= Target.the("Search Query result Rows").located(MobileBy.id("com.spotify.music:id/row_view"));
    public static Target SEARCH_RESULT_TITLE= Target.the("Search Result Title").located(MobileBy.id("com.spotify.music:id/text1"));
    public static Target FIRST_SEARCH_RESULT= Target.the("First Search Result Title").located(MobileBy.id("com.spotify.music:id/labels"));
    public static Target SEARCH_RESULT_TYPE= Target.the("Search Result Type").located(MobileBy.id("com.spotify.music:id/text2"));
    public static Target SEARCH_RESULT_TYPE_OF= Target.the("Search Result Type").located(MobileBy.id("new UiSelector().resourceId(\"com.spotify.music:id/text2\").text(\"{0}\""));
    public static Target SEARCH_RESULT_NO_RESULTS= Target.the("Search Query Title").located(MobileBy.id("com.spotify.music:id/empty"));
    public static Target SEARCH_RESULT_NO_RESULTS_TITLE= Target.the("Search Query Title").located(MobileBy.id("com.spotify.music:id/title"));


    public static final String SEARCH_RESULT_SEARCH_SOMETHING_TITLE_TEXT = "Busca en Spotify";
    public static final String SEARCH_RESULT_NO_RESULTS_TITLE_TEXT = "No se encontraron resultados para {0}";



}
