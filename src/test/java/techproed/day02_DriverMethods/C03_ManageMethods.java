package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu: " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları: " + driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();

        /*
        Bir websitesine gittiğimizde browser default olarak bir boyutta gelir.Ve açılan browserdaki webElementlere
        browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra maximize yaparsak driver
        bütün webElementleri görür ve rahatlıkla müdehale edilir. Bu yüzden browser'ı açtıktan sonra ilk olarak
        driver.manage().window().maximize(); yapmamız bizim weElementlere ulaşmada işimizi kolaylaştırır.
        Böylelikle fail almamış oluruz.
         */

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu: " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları: " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı full screen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);


        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir

        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz boyuta getirir

        //Sayfayı kapatalım
        driver.close();


        /*

        ÖDEV
        1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin

         */

    }
}
