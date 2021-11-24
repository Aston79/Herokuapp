import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NotificationMessageTesting extends BaseTest {

    @Test
    public void NotificationMessageTest() {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector(".example a")).click();
        String message = driver.findElement(By.cssSelector(".flash")).getText();
        assertEquals(message, "Action is unsuccessful, please try again\n" + "×");
    }
}
