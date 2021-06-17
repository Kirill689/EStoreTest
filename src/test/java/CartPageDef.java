import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideWait;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPageDef {


    BasePage basePage =  new BasePage();

    @Then("CLick on product cart {string}")
    public void clickOnProductCart(String cartBttId) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.clickBtt(cartBttId);
    }

}
