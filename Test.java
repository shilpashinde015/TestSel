import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[]args){
        System.setProperty("webdriver.gecko.driver","C:/Users/shilp/Downloads/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
      /*  List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("size" + list.size());

        for(int i = 0;i<list.size();i++){
            WebElement ele = list.get(i);
            String link = ele.getAttribute("href");
            verifyLink(link);
        }
        driver.quit();
    }

    private static void verifyLink(String ele) {
        try {
            URL url = new URL(ele);
            HttpURLConnection  con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(4000);
            con.connect();

            if(con.getResponseCode() >= 400){
                System.out.println(ele + con.getResponseMessage() + "is broken");
            }else{
                System.out.println(ele + con.getResponseMessage());
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        driver.quit();
    }
}
