package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        // sonuc yazısını yazdırın
        // (amazon sayfasındaki sonuç yazısını incele deyip class name kopyaladık.
        // Fakat unique değil aynı class name'den 100 kusur var. Bu sebeple findElements kullandık. FindElement list döndürür.)
        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 158 results for "city bike"


        //2.Yol: Xpath ile locate alma:
        WebElement sonucYazisiXPath = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        // sonuc sayısını yazdırın
        String[] sonucSayisi = sonucYazisi.get(0).getText().split(" ");
        System.out.println("Sonuç Sayisi: " + sonucSayisi[2]);

        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık
        WebElement onikinciElement = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println(onikinciElement.getText());


        // ilk ürünün locatini alın
        List<WebElement> urunler = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunler.get(0);


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());//true

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());//true

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());//false çünkü webelement seçilme özelliğine sahip değil

        // ilk urune tıklayın
        ilkUrun.click();//WebElementin üzerine tıklar

        // sayfayı kapatın
        driver.close();


    }
    /*
            *************** xpath ***************
        Arama Kutusu HTML Kodları;
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search
        Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon" spellcheck="false">

            //tagName[@attributeIsmi=‘attributeValue']
           TagName yerine * koyarsak tag name farketmeksizin demek olur
         */

    //  input[@name="field-keywords']

    //Aldığımız xpath unique değilse xpath'i parantez içine alarak yanına köşeli parantez ile index belirterek istenilen webelementi seçebiliriz.

    //input[@name="field-keywords'] [1]




    /*
                ODEV
         Techpro sayfasına git
         Çıkan reklamı kapat
         Arama bölümüne qa yazıp arat
         Sayfa başlığının qa içerdiğini doğrula
         Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrula
         Carrer Opportunities In QA linkine tıkla
         Başlığın Opportunities içerdiğini test et
         Tekrar ana sayfaya dön ve url'in https://techproeducation.com/ olduğunu doğrulayalım


     */


}
