package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(3000); //Java kodlarını bekletmek için kullanabiliriz.

        //Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa Başlığı: " + driver.getTitle());
        Thread.sleep(3000);

        //Techproeducationsayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa başlığını yazdıralım
        System.out.println("Techpro Sayfa Başlığı: " + driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon Sayfa Url'i: " + driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayı kapatalım
        driver.close();



        //ÖDEV

       // Yeni bir Class olusturalim.C05_NavigationMethods
       // Youtube ana sayfasina gidelim . https://www.youtube.com/
       // Amazon soyfasina gidelim. https://www.amazon.com/
       // Tekrar YouTube’sayfasina donelim
       // Yeniden Amazon sayfasina gidelim
       // Sayfayi Refresh(yenile) yapalim
       // Sayfayi kapatalim / Tum sayfalari kapatalim














    }
}
