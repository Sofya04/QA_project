import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTest {
    WebDriver wd;

    @Test

    public void XPathTests(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();//open full screen
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");


    }
}
