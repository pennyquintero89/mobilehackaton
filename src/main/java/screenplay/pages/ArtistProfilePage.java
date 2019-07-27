package screenplay.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ArtistProfilePage {

    public static Target ARTIST_IMAGE= Target.the("Artist Image").located(MobileBy.id("com.spotify.music:id/image_overlay"));
    public static Target ARTIST_NAME = Target.the("Artist Name").located(MobileBy.id("com.spotify.music:id/title"));
    public static Target FOLLOW_BUTTON = Target.the("Follow Artist Button").located(MobileBy.id("com.spotify.music:id/hubs_header_toggle_button"));
    public static Target UNFOLLOW_BUTTON = Target.the("Follow Artist Button").located(MobileBy.id("com.spotify.music:id/hubs_header_toggle_button"));
    public static Target LISTENERS_INFO = Target.the("Artist Listeners").located(MobileBy.id("com.spotify.music:id/hubs_header_metadata"));

    public static final String FOLLOWING = "SIGUIENDO";
    public static final String NOT_FOLLOWING = "SEGUIR";

}
