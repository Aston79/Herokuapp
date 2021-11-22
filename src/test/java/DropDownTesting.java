import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTesting extends BaseTest {

    @Test
    public void DropDownTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown1 = driver.findElement(By.id("dropdown"));
        dropDown1.click();
        if (dropDown1.isSelected()) {
            Select sel = new Select(driver.findElement(By.id("dropdown")));
            sel.selectByVisibleText("Option1");
        } else {
            System.out.println("Sorry, dropdown is not selected yet");
        }

        WebElement dropDown2 = driver.findElement(By.id("dropdown"));
        dropDown2.click();
        if (dropDown2.isSelected()) {
            Select sel = new Select(driver.findElement(By.id("dropdown")));
            sel.selectByVisibleText("Option2");
        } else {
            System.out.println("Sorry, dropdown is not selected yet");
        }
    }
}
