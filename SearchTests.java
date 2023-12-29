import static jdk.internal.misc.ThreadFloack.open;

public class SearchTests {
    @Test
    void succesfulSearchTest() {
        open("http://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
