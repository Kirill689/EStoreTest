import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {


    public void searchField (String id, String text){
        $(By.id(id)).sendKeys(text);
    }




}
