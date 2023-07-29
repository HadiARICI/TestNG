package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethodAfterMethod extends TestBase {

    // BeforeMethod ve AfterMethod notasyonları
    // Junit deki before after gibi her test method dan önce çalışır


    @Test
    public void test01() {
        driver.get("https://www.amazon.com");

    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void techproedTest() {
        driver.get("https://www.techproeducation.com");

    }
}
