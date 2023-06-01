package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına git
        driver.get("https://www.amazon.com");

        //Sayfadaki linlerin sayısını ve linkleri yazdıralım
        /*
        findElement() ile bir webelemente ulaşabilirken, birden fazla web element için findElements() methodunu kullanırız.
        Bu webElementlerin sayısına ulaşmak için ya da bu web Elementlerin yazısınız konsola yazdırabilrmek için
        List<WebElement> linlerListesi = driver.findElements(By.locator("Locator değeri)); olarak kullanırız.
        Oluşturduğumuz List'i loop ile konsola yazdırabiliriz.
         */

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));  //HTML'de linkerin tag'ı a olduğu için a yazıyorum ve kaç tane link olduğunu a sayısından bulup veriyor.
        System.out.println("Linklerin Sayısı: " + linklerListesi.size());

        /*Tüm linkeri yazdırmak için loop açıyorum
        for (WebElement w:linklerListesi) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }


        */

        //Lambda ile yazdırma
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});


        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());


    driver.close();

    /*
            ODEV
       Amazon sayfasına git
       iphone aratın
       çıkan sonuç yazısını konsola yazdırınız
       çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız.

     */









    }
}
