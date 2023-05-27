package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20) Sayfadaki webElementleri görünür olana kadar maximum 20 saniye bekletir.
        webElementler 20 saniyeden önce görünür olursa beklemeden devam eder.
        belirttiğimiz max. süre boyunca internetten veya sayfadan kaynaklı webElementler oluşmazsa testimiz FAILED verir.
        Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler.
        30 saniye beklemesini belirtirsem 30 saniye bekler ve sonra alt satıra geçer.
        implicitlyWait() ise o süreden önceden webElementler oluşursa süreyi beklemeden geçer.
        Her class için maximize'dan sonra kullanılması zorunlu
         */


        //techproed sayfasına gidelim
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);
        //amazona gidelim
        String amazonUrl = "https://amazon.com";
        driver.get(amazonUrl);

        //techprosayfasına geri dönelim
        driver.navigate().back();

        //sayfa başlığının techpro içerdiğini test edelim.
        String actual = driver.getTitle();
        String expected = "Techpro";
        if (actual.contains(expected)){
            System.out.println("test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Techpro Title: "+actual);
        }

        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();

        //sayfa başlığının amazon içerdiğini test edelim
        String actual2 = driver.getTitle();
        String expected2 = "Amazon";
        if (actual2.contains(expected2)){
            System.out.println("test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Amazon Title: "+ actual2);
        }

        //Sayfayı kapatlım
        driver.close();


        /*
        Ödev

         */




    }
}
