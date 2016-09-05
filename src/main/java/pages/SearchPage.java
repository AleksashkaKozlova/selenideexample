package pages;

/**
 * Created by Lenovo on 8/15/2016.
 */

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SearchPage {
    public ResultsPage searchFor(String text){
        $(By.id("lst-ib")).setValue(text).pressEnter();
        return page(ResultsPage.class);
    }
}