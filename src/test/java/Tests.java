import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class Tests {

    @Test
    public void testExample(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        System.setProperty("selenide.browser", "chrome");
        //System.setProperty("webdriver.chrome.driver", file);
        Configuration.startMaximized = true;
      //  Configuration.holdBrowserOpen = true;
        open("https://google.com");
        $(By.id("lst-ib")).setValue("selenium").pressEnter();
        $$(By.cssSelector(".rc")).shouldHaveSize(11);
        $$(By.cssSelector(".rc")).get(0).find(By.cssSelector("a"))
                .shouldHave(Condition.text("Selenium — Википедия"));

    }

    @Test
    public void downloadTest() throws FileNotFoundException {
        open("http://the-internet.herokuapp.com/download");
        $$(By.cssSelector(".example a")).get(1).download();

    }

    @Test
    public void uploadTest(){
        Configuration.holdBrowserOpen = true;
        open("https://the-internet.herokuapp.com/upload");
        $(By.id("file-upload")).uploadFile(new File("text.txt"));
        $(By.id("file-submit")).click();
        $(By.id("uploaded-files")).shouldHave(text("text.txt"));
    }
}

