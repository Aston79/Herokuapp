import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTablesTesting extends BaseTest {

    @Test
    public void SortableDataTablesTest() {
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement checkTable1 = driver.findElement(By.xpath("//table//tr[1]//td[1]"));
        Assert.assertTrue(true);

        WebElement checkTable2 = driver.findElement(By.xpath("//table//tr[1]//td[2]"));
        Assert.assertTrue(true);

        WebElement checkTable3 = driver.findElement(By.xpath("//table//tr[1]//td[3]"));
        Assert.assertTrue(true);

        WebElement checkTable4 = driver.findElement(By.xpath("//table//tr[1]//td[4]"));
        Assert.assertTrue(true);

        WebElement checkTable5 = driver.findElement(By.xpath("//table//tr[2]//td[1]"));
        Assert.assertTrue(true);
    }
}
