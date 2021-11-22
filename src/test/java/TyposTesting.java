import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTesting extends BaseTest {

    @Test
    public void TyposTest() {
//        driver.get("https://the-internet.herokuapp.com/typos");
        String Str1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "\n" +
                "Sometimes you'll see a typo, other times you won't.";
        String Str3 = "Этот пример демонстрирует вводимую опечатку. Это происходит случайным образом при каждой загрузке страницы.\n" +
                "\n" +
                "Иногда вы увидите опечатку, иногда нет.";
        String Str2 = Str1;
//        WebElement typosElements = driver.findElement(By.tagName(Str1));
        boolean answer;

        answer = Str1.equals(Str2);
        System.out.println("String Str1 = string Str2? Answer: " + answer);

        answer = Str1.equals(Str3);
        System.out.println("String Str1 = string Str3? Answer: " + answer);
    }   // It`s a joke !!! )))

    @Test
    public void typosTest() {
        driver.get("http://the-internet.herokuapp.com/typos");
        for (int i = 0; i < 10; i++) {
            driver.navigate().refresh();
            String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[1]")).getText();
            assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.", "Error: the word 'won,t' is misspelled");
        }
    }
}
