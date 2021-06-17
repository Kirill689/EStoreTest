import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {


    public void clickBtt (String id){
        $(By.id(id)).click();
    }

    public void clickBttByXPathClass (String xPath){
        $(By.xpath("(//button[@class='"+xPath+"'])[1]")).click();
    }

}
