package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Lenovo on 8/15/2016.
 */
public class ResultsPage {

    public SelenideElement getElement(int index){
        return $$(By.cssSelector(".rc")).get(index);
    }

   public ElementsCollection getElements(){
       return $$(By.cssSelector(".rc")).filter(Condition.visible);
   }

}
