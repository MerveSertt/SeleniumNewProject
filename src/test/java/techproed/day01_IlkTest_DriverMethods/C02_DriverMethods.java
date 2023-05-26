package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title: " + driver.getTitle());
        System.out.println("Amazon Actual Url: "+driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri: "+amazonWindowHandle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title: " + driver.getTitle());//Sayfa başlığını verir.
        System.out.println("Techproed Actual Url: "+driver.getCurrentUrl());//gidilen sayfanın url'sini verir.
        //System.out.println("Techproed Kaynak Kodları: "+driver.getPageSource());//Açılan sayfanın kaynak kodlarını verir. Çok uzun olduğu için yorum satırına alındı

        System.out.println("Techproed Window Handle Değeri: "+driver.getWindowHandle());//Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız.

    }
}
