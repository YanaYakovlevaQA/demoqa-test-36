import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBox {

    @BeforeAll
    static void BeforeAll () {
        Configuration.browserSize = "1920x1980";
    }

    @Test
    void FillFormTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Yana");
        $("#userEmail").setValue("yana@gmail.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Another street 1");
        $("#submit").click();

        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
