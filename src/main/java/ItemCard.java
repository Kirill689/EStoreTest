import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ItemCard {

    public void hoverOnItemCard (String itemIndexInArray){
        $(By.xpath("(//img[@class='image lazy'])["+itemIndexInArray+"]")).hover();
    }

    public void clickOnItemCard (String itemIndexInArray){
        $(By.xpath("(//img[@class='image lazy'])["+itemIndexInArray+"]")).click();
    }

    public void selectSizeOnItemCard (String sizeIndexInArray) {
        $(By.xpath("(//span[@class='availableSize'])["+sizeIndexInArray+"]")).click();
    }


}
