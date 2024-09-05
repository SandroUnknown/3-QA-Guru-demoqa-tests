import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {

    private int getResult() {
        return 3;
    }

    int result;

    @BeforeAll
    static void beforeAll() {
        System.out.println("\n### beforeAll\n");
    }

    @BeforeEach
    void beforeTests() {
        System.out.println("### beforeTest");
        result = getResult();
    }

    @Test
    void firstTest() {
        System.out.println("###   firstTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void secondTest() {
        System.out.println("###   secondTest");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###   thirdTest");
        Assertions.assertTrue(result > 2);
    }

    @AfterEach
    void afterTests() {
        System.out.println("### afterTests\n");
        result = 0;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### afterAll\n");
    }





    /*
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
    */
}
