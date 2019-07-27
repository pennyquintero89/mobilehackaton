package screenplay.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class PlaylistPageDetail {

    public static Target PLAYLIST_COVER= Target.the("Playlist Cover").located(MobileBy.id("com.spotify.music:id/cover_art_image"));
    public static Target PLAYLIST_TITLE= Target.the("Playlist Title").located(MobileBy.id("android:id/text1"));
    public static Target PLAYLIST_BACK_BUTTON= Target.the("Playlist Title").located(MobileBy.id("com.spotify.music:id/header_content_first_page"));
    public static Target FOLLOWING_STATE_BUTTON= Target.the("Following Button").located(MobileBy.id("com.spotify.music:id/follow_button"));
    public static Target FOLLOWERS_STATE_INFO= Target.the("Following Button").located(MobileBy.id("android:id/text2"));
    public static Target RANDOM_BUTTON= Target.the("Random Play Button").located(MobileBy.id("com.spotify.music:id/accessory"));
    public static Target SONGS_VIEWS_OF= Target.the("Song View").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"{0}\""));
    public static Target PLAYLIST_OPTIONS_BUTTON_OF= Target.the("Playlist Options Button of").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").text(\"{0}\""));
    public static Target PLAYLIST_OPTIONS_BUTTON= Target.the("Playlist Options Button").located(MobileBy.id("com.spotify.music:id/glue_overflow"));



    public static final String FOLLOWING = "SIGUIENDO";
    public static final String FOLLOW = "SEGUIR";
    public static final String FOLLOWERS = "{} SEGUIDORES";
    public static final String SEARCH_IN_PLAYLIST = "Buscar en la playlist";
    public static final String SORT_IN_PLAYLIST = "Ordenar playlist";






}
