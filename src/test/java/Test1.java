import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Test1 {
    @Test
    public void test1(){
        open("https://www.github.com");
    }
}
