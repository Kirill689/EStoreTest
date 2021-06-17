import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ItemInCart {

    WebElement item;

    public WebElement selectItemInCart(String itemTitle){
       item = $(By.xpath("//img[@title='"+itemTitle+" - Kiabi']"));
       return item;
    }
}
