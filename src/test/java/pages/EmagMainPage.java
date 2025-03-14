package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.*;

public class EmagMainPage {

    public SelenideElement searchInput = $x("//input[@id='searchboxTrigger']");
    public SelenideElement acceptAll = $x("//button[contains(@class,'js-accept')]");
    public SelenideElement closeAccountBanner = $x("//*[contains(@class,'dismiss-btn')]//i");
    public SelenideElement searchButton = $x("//button[contains(@class,'searchbox-submit-button')]");
    public ElementsCollection searchResults = $$x("//*[@data-zone='card']");
    public SelenideElement addedCartItem = $x("//*[@class='modal-content']//*[@class='row table-layout']");

    public void search(String query) {
        searchInput.click();
        searchInput.setValue(query);
        searchButton.click();
    }

    public void addToCart() {
        if ( Objects.requireNonNull(searchResults.first().getAttribute("data-name")).contains("Redmi Note 13")){
            searchResults.first().$x(".//button[@type='submit']").click();
        }
    }

    public void checkCart() {
        addedCartItem.getText().contains("Xiaomi Redmi Note 13");
    }
}
