import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public WebElement itemInCartByTitle (String itemTitle){
        WebElement item = $(By.xpath("//img[@title='"+itemTitle+" - Kiabi']"));
        return item;
    }

}
