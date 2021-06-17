import io.cucumber.java.en.Then;

public class ItemCardDef {

    BasePage basePage = new BasePage();
    ItemCard itemCard = new ItemCard();


    @Then("Hover on {string} item in list to see available sizes")
    public void hoverOnItemInListToSeeAvailableSizes(String itemIndexInArray) {
        itemCard.hoverOnItemCard(itemIndexInArray);
    }

    @Then("Select {string} available size in list")
    public void selectAvailableSizeInList(String sizeIndexInArray) {
        itemCard.selectSizeOnItemCard(sizeIndexInArray);
    }

    @Then("Click on {string}")
    public void clickOn(String bttClassName) {
        basePage.clickBttByXPathClass(bttClassName);

    }


}
