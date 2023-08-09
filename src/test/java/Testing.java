import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {

    @Test
    public void getInfo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().window().maximize();

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
    }


}
