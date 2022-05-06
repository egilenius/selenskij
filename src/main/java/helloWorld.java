import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class helloWorld {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sak i Mark\\Downloads\\chromedriver.exe\\");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://sv.lmgtfy.app/#gsc.tab=0");
        chromeDriver.findElement(By.id("search_form_input_homepage")).sendKeys("how install selenium intellij");
        chromeDriver.findElement(By.id("select2-lang_select-container")).click();
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chromeDriver.close();
    }
}
