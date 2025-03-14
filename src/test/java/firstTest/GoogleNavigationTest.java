package firstTest;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import pages.GooglePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleNavigationTest {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
    }

    GooglePage googlePage = new GooglePage();


    @Test
    public void searchAndNavigate() {
        open("https://www.google.com");

        googlePage.search("Selenide");

        googlePage.searchResults.first().$("a").click();

        googlePage.header.shouldHave(text("Selenide"));
    }
}