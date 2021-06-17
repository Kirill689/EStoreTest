import io.cucumber.java.en.Then;

public class BasePageDef {

    BasePage basePage = new BasePage();


    @Then("Select {string}")
    public void select(String arg0) {
        basePage.clickBtt(arg0);
    }


}
