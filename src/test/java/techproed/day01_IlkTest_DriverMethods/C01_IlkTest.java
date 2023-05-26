package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamarinda system ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //getProperty methodu ile class'ımızın fiziki yolunu belirttik.

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getproperty ile key değerini girerek value'ya ulaşabilirim

       WebDriver driver = new ChromeDriver();
       //ChromeDriver türünde yeni bir obje oluşturduk

       driver.get("https://www.techproeducation.com");
       //get() methodu ile string olarak girilen url'ye gideriz.








    }
}
