import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InputsTesting extends BaseTest {

    @Test
    public void InputsTest() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement inputs = driver.findElement(By.tagName("input"));
        inputs.click();
        Actions builder = new Actions(driver);
        builder.sendKeys(Keys.ARROW_DOWN);
        builder.sendKeys(Keys.ARROW_UP);
    }
}
