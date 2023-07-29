package tests.day16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClassAfterClass extends TestBase {
    //Junit @BeforeClass ve @AfterClass nostasyonları sahip methodlar static olmak zoeunda
    // TestNG bu zoronluluk yok
// TestNG bize daha fazzla before after nostayon sunar diğer before/after

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @Test
    public void amazonTesti() {
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
