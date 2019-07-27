package screenplay.pages;


import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;


public class Dashboard  {

    //public static Target SEARCH_BUTTON= Target.the("Search Button").located(id("com.spotify.music:id/search_tab"));
    //public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));
    public static Target SEARCH_BUTTON= Target.the("Search Button").located(MobileBy.id("com.spotify.music:id/search_tab"));
   // public static Target SEARCH_BUTTON= Target.the("Search Button").located(MobileBy.ById("com.spotify.music:id/search_tab"));
    //public static Target SEARCH_BUTTON= Target.the("Search Button").locatedBy(id("com.spotify.music:id/search_tab"));
  /*  public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));
    public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));
    public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));
    public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));
    public static Target SEARCH_BUTTON= Target.the("Search Button").located(By.id("com.spotify.music:id/search_tab"));*/
    //public static Target HOME_BUTTON = Target.the("Home Button").located(By.id("com.spotify.music:id/home_tab"));
    //public static Target LIBRARY_BUTTON = Target.the("Library Button").located(By.id("com.spotify.music:id/your_library_tab"));

}
