import io.cucumber.java.en.Then;

public class SearchPageDef {

    SearchPage searchPage = new SearchPage();

    @Then("{string} field input {string}")
    public void fieldInput(String id, String text) {
        searchPage.searchField(id,text);

    }


}
