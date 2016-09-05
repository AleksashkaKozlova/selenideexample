import org.testng.annotations.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Lenovo on 8/15/2016.
 */
public class GoogleSearchTest {
    @Test
    public void searchTest(){
        SearchPage searchPage = open("https://google.ru/", SearchPage.class);
        searchPage.searchFor("selenium").
                getElements().shouldHaveSize(11);
    }
}
