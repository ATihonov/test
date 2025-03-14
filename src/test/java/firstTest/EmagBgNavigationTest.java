package firstTest;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import pages.EmagMainPage;
import static com.codeborne.selenide.Selenide.*;

public class EmagBgNavigationTest {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.headless = true;
    }

    EmagMainPage eMagPage = new EmagMainPage();


    @Test
    public void searchAndNavigate() {
        open("https://emag.bg");
        eMagPage.acceptAll.click();
        eMagPage.closeAccountBanner.click();
        eMagPage.search("xiaomi redmi note 13");
        eMagPage.addToCart();
        eMagPage.checkCart();
    }
}