import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class CheckBoxTesting extends BaseTest {

    @Test
    public void checkBoxesTesting() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        By checkboxes = By.tagName("input");
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        assertEquals(checkBoxes.get(0).isSelected(), false, "the 1st checkbox is unchecked");
        checkBoxes.get(0).click();
        assertEquals(checkBoxes.get(0).isSelected(), true, "the 1st checkbox is checked");
        assertEquals(checkBoxes.get(1).isSelected(), true, "the 2nd checkbox is checked");
        checkBoxes.get(1).click();
        assertEquals(checkBoxes.get(1).isSelected(), false, "the 2nd checkbox is unchecked");
    }
    @Test
    public void CheckBoxTesting2() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.cssSelector("[type=checkbox]"));
        checkBox1.click();
        if (checkBox1.isSelected()) Assert.assertTrue(true);

        WebElement checkBox2 = driver.findElement(By.cssSelector("[type=checkbox]"));
        checkBox2.click();
        if (checkBox2.isSelected()) Assert.assertTrue(false);
    }

    @Test
    public void TestInputCheckbox() {
        ((JavascriptExecutor) driver).executeScript(
                "var inputs = document.getElementsByTagName(\"input\");" +
                        "for (var i = 0; i < inputs.length; i++){" +
                        "if (inputs[i].type == \"checkbox\"){" +
                        "inputs[i].checked=true;" +
                        "}" +
                        "}"
        );

        String test = (String) ((JavascriptExecutor) driver).executeScript(
                "var controlGroupAlpha;" +
                        "var controlGroupBetta;" +
                        "var inputs = document.getElementsByTagName(\"input\");" +
                        "for (var i = 0; i < inputs.length; i++){" +
                        "if (inputs[i].type == \"checkbox\"){" +
                        "controlGroupAlpha = inputs[i].getAttribute(\"name\");" +
                        "controlGroupBetta = controlGroupBetta+\";\"+ controlGroupAlpha;" +
                        "}" +
                        "}" +
                        "return controlGroupBetta;"
        );
        Reporter.log("All checked : " + test);
//  Это рабочий класс для Webdriver на JAVA. Он находит все чекбоксы на странице и отмечает их
//  (Первый кусок кода), так же ищет все имена чекбоксов, формирует их список и выдает через
//  логгер (Второй кусок кода... логгер от TestNG). https://software-testing.ru/forum/index.php?/topic/26099-kak-proverit-chto-chekboks-vibran-webdriver-java/#:~:text=public%20void%20TestInputCheckbox,All%20checked%20%3A%20%22%2Btest)%3B%0A%20%20%20%20%7D
    }
}
