import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Start {
    WebDriver wd;

    @Test
    public void goToPhoneBook(){
        // open browser
        wd=new ChromeDriver();
        //go to phonebook
        //  wd.get("https://contacts-app.tobbymarshall815.vercel.app/"); //whiout history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        //with history

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        //close browser
        wd.close();
        //  wd.quit();
    }

    @Test
    public void loginTest(){

        wd=new ChromeDriver();
        //wd=new FirefoxDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        // open loginPage :find loginTab + click
        //fill email  : find ElementEmail + type "email"
        //fill password :find ElementPassword + type "password"
        // login submit : find login button _ click
        // Assert (ex res=ac res)


        // [PHONEBOOK ;Home Component ]
        WebElement element = wd.findElement(By.tagName("h1"));  /// PHONEBOOK
        element.click();

        List<WebElement> list =wd.findElements(By.tagName("h1"));

        WebElement element1 = list.get(1); ///Home Component
        element1.click();

        // By id
        wd.findElement(By.id("root"));
        // By class
        wd.findElement(By.className("container"));
        // By linkText
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));
        // By.name
        //wd.findElement(By.name("name"));
        //wd.findElement(By.name("surname"));

        // By.ccsSelector
        //by tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        // by class
        wd.findElement(By.cssSelector(".container"));
        // by attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href]"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']")); /// start with /ho
        wd.findElement(By.cssSelector("[href *='om']")); // containce - om
        wd.findElement(By.cssSelector("[href $='me']")); // end of me

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        //By.xPath

        wd.quit();
    }

    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/gurevich_laptop/Downloads/index.html");

        // find items
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        WebElement item_1 = wd.findElement(By.linkText("Item 1"));
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item_2 = wd.findElement(By.linkText("Item 2"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item_3 = wd.findElement(By.linkText("Item 3"));
        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement item_4 = wd.findElement(By.linkText("Item 4"));
        //find element of form
        WebElement name = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement surname = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement send = wd.findElement(By.cssSelector(".btn"));

        // ****** find from table
        //List<WebElement> list = wd.findElements(By.tagName("td"));
        //WebElement element1 = list.get(9); ///Poland
        //String text = element1.getText();
        //System.out.println(text);

        WebElement poland = wd.findElement(By.cssSelector("#country-table tr:last-child td:first-child"));

        wd.quit();
    }
}