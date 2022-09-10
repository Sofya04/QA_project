import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tables {
    @Test

    public void wschoolTables() {
        WebDriver wd;
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //print quantity of rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Quantity of rows  " + listRows.size());
        Assert.assertEquals(listRows.size(), 7);

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
        Assert.assertEquals(list2.size(), 3);
    }

        @Test
        public void homeWorkTable () {
        WebDriver wd;
            wd = new ChromeDriver();
            wd.manage().window().maximize();
            wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            wd.navigate().to("file:///Users/gurevich_laptop/Downloads/index.html");// url to index.html


            // print count rows in table
            List<WebElement> rowsQuantity = wd.findElements(By.cssSelector("#country-table tr"));
            System.out.println("Quantity of rows: " + rowsQuantity.size());
            Assert.assertEquals(rowsQuantity.size(), 4);

            // print last rows
            WebElement last = wd.findElement(By.cssSelector("#country-table tr:last-child"));
            System.out.println(last.getText());


            // print count of columns
            List<WebElement> columns1 = wd.findElements(By.cssSelector(".container tbody tr:first-child td"));
            System.out.println("Columns quantity " + columns1.size());
            Assert.assertEquals(columns1.size(), 3);

            // print text Israel
            WebElement israel = wd.findElement(By.cssSelector("#country-table tbody tr:nth-child(2) td:nth-child(2)"));
            System.out.println(israel.getText());
            Assert.assertEquals(israel.getText(), "Israel");

            wd.close();
            wd.quit();
        }
    }



