import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class demoqaTest {

    int result;

    @BeforeEach
    void BeforeEach () {
        System.out.println("###   BeforeEach()");
        result = getResult();
    }

    @AfterEach
    void AfterEach () {
        System.out.println("###   AfterEach()\n");
        result = 0;
    }

    @Test
    void firstTest() {
        System.out.println("###   firstTest()");
        Assertions.assertTrue(result > 2);
    }


    @Test
    void secondTest() {
        System.out.println("###   secondTest()");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###   thirdTest()");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }
}


