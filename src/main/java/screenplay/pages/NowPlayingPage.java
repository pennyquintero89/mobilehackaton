package screenplay.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class NowPlayingPage {

    public static Target SONG_COVER= Target.the("Song Cover").located(MobileBy.id("comcom.spotify.music:id/image"));
    public static Target SONG_NAME= Target.the("Song name").located(MobileBy.id("com.spotify.music:id/marquee_track_info_view_title"));
    public static Target SONG_ARTIST= Target.the("Song Artist").located(MobileBy.id("com.spotify.music:id/marquee_track_info_view_subtitle"));
    public static Target PLAY_PAUSE_BUTTON= Target.the("Play / pause Button").located(MobileBy.id("com.spotify.music:id/play_pause_button"));
    public static Target NEXT_BUTTON= Target.the("Next Song Button").located(MobileBy.id("com.spotify.music:id/next_button"));
    public static Target PREVIOUS_BUTTON= Target.the("Previous Song Button").located(MobileBy.id("com.spotify.music:id/previous_button"));
    public static Target SHUFFLE_BUTTON= Target.the("Shuffle Song Button").located(MobileBy.id("com.spotify.music:id/shuffle_button"));
    public static Target SONG_OPTION_BUTTON= Target.the("Shuffle Song Button").located(MobileBy.id("com.spotify.music:id/context_menu_button"));

    public static Target ADD_TO_PLAYLIST_BUTTON= Target.the("Add to Playlist Button").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"Agregar a playlist\""));
    public static Target ADD_TO_QUEUE_BUTTON= Target.the("Add to Queue Button").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"Agregar a la cola\""));





}
