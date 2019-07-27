package screenplay.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class PlaylistsPage {

    public static Target PAGE_TITLE= Target.the("Music Title").located(MobileBy.id("com.spotify.music:id/top_tab_view_label"));
    public static Target TAB_BUTTON= Target.the("Tab Button").located(MobileBy.id("com.spotify.music:id/bottom_tab_view_label"));
    public static Target RESULTS_VIEW= Target.the("Results View").located(MobileBy.id("com.spotify.music:id/row_view"));
    public static Target PLAY_PAUSE_BUTTON= Target.the("Play / Pause Button").located(MobileBy.id("com.spotify.music:id/playPause"));
    public static Target RESULTS_VIEW_OF= Target.the("Results View Of").located(MobileBy.id("new UiSelector().resourceId(\"com.spotify.music:id/text1\").text(\"{0}\""));
    public static Target TAB_BUTTON_OF= Target.the("Music Title").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android:id/bottom_tab_view_label\").text(\"{0}\""));

    public static final String PLAYLIST = "Playlists";
    public static final String ARTISTS = "Artistas";
    public static final String ALBUMS = "Álbumes";






}
