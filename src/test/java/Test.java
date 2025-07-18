import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {


    private ThreadLocal<WebDriver> tdriver;
    public WebDriver driver;


    public void intialialiseTest(){

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        tdriver.set(driver);


    }


    public ThreadLocal<WebDriver> getDriver(){
        return tdriver;
    }

    public void good(){

    }
}
