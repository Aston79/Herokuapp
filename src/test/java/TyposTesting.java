import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTesting extends BaseTest {

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
