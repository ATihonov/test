package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    public SelenideElement searchInput = $x("//textarea[@class='gLFyf']");
    public ElementsCollection searchResults = $$("#search .g");
    public SelenideElement header = $x("(//h1)[2]");

    public void search(String query) {
        searchInput.setValue(query).pressEnter();
    }
}
