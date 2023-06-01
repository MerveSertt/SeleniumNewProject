package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    /*
        cssSelector ile Xpath arasındaki farklar;
    1-cssSelector'da @ işareti ve // işaretleri kullanılmaz.
    2-xpath ile index alabiliriz ama cssSelector ile index alınmaz
    3-xpath ile text alınabilirken cssSelector ile text alınamaz.
    4-cssSelector xpath'e göre daha hızlı çalışır.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        Add Element butonuna basin
        Delete butonu’nun gorunur oldugunu test edin
        Delete tusuna basin
        “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElementButoon = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElementButoon.click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        //Delete tusuna basin
        deleteButonu.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
       WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        driver.close();

        /*
                ODEV

            // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
            // Add Element butonuna 100 defa basınız
            // 100 defa basıldığını test ediniz
            // 90 defa delete butonuna basınız
            // 90 defa basıldığını doğrulayınız
            // Sayfayı kapatınız
         */

    }
}
