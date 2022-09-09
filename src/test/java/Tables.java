import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    @Test

    public void wschoolTables(){
        WebDriver wd;
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //print quantity of rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Quantity of rows  "+ listRows.size());
        Assert.assertEquals(listRows.size(),7);

        //print last row
        WebElement lastrow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastrow.getText());
        //print quantity of columns

        //print text Canada
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(), "Canada");

        //print quantity of columns
        List<WebElement> list2 = wd.findElements(By.cssSelector("#customers th"));
        Assert.assertEquals(list2.size(),3);



    }
}
