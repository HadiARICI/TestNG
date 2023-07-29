package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    /*
    testNg test methodlarını isim sırasına göre çalıştırır.
    eğer isim sıralmasının dışında çalışmasını isterseniz o zaman test methodlarını önclik (priority) tanımlayabiliriz
    priority küçükten büyüyeğe doğru çalışır

    eğer bir test methoduna priority değeri atanmamışsa priority dğeri default alır yani sıfır alır
     */

    @Test(priority = 1)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }
    @Test(priority = 2)
    public void test02() {
        driver.get("https://www.bestbuy.com");

    }
    @Test(priority = 3)
    public void techproedTest() {
        driver.get("https://www.techproeducation.com");

    }

}
