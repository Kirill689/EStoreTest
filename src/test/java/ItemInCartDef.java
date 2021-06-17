import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ItemInCartDef {

    ItemInCart itemInCart = new ItemInCart();

    @Then("Assert that item {string} is in cart")
    public void assertThatItemIsInCart(String itemTitle) {
        Assert.assertEquals(itemTitle, itemInCart.selectItemInCart(itemTitle).getAttribute("alt"));
    }


    @Then("Remove item {string} from cart")
    public void removeItemFromCart(String itemDataLable) {
        itemInCart.item.findElement(By.xpath("//div[@data-label='"+itemDataLable+"']")).click();
    }

    @Then("wait some")
    public void waitSome() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Check that {string} was removed from cart")
    public void checkThatWasRemovedFromCart(String itemTitle) {
        Assert.assertEquals(itemTitle, itemInCart.selectItemInCart(itemTitle).getAttribute("alt"));
    }


}
