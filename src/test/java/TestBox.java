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
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillFormTest() {
        open("/text-box");
        $("#userName").setValue("Yana");
        $("#userEmail").setValue("yana@gmail.com");
        $("#currentAddress").setValue("Some street 1");
        $("#permanentAddress").setValue("Another street 1");
        $("#submit").click();
        $("#output").$("#name").shouldHave(text("Yana"));
        $("#output #email").shouldHave(text("yana@gmail.com"));
        $("#currentAddress", 1).shouldHave(text("Some street 1"));
        $("#output").$("#permanentAddress").shouldHave(text("Another street 1"));
    }
}
