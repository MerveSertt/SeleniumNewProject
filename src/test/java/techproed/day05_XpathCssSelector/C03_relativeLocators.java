package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    public static void main(String[] args) {
        /*
        Benzer özelliklere sahip web elementler için relative locators kullanabiliriz.
        Syntax => driver.findElement(with(By.tagName).below().above().to_left_of().to_right_of().near()) gibi methodlar ile
        benzer özelliklere sahip web elementleri locatini almadan o web elemnte ulaşabiliriz.
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //relative locator kullanarak hybrid bikes altındaki elemete tıklayalım
        WebElement HybridBikes = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base']) [1]"));
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(HybridBikes));
        electricBike.click();

        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        completeBike.click();
















    }
}
