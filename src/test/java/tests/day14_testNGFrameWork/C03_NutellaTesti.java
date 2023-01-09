package tests.day14_testNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_NutellaTesti {
@Test(groups = {"minireg1","minireg2","smoke"})
    public void test01(){

    // amazon ana sayfaya gidin
    ReusableMethods.bekle(3);
    Driver.getDriver().get("https://www.amazon.com/");
    //Nutella icin arama yapin
   // WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
    AmazonPage amazonPage= new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    //sonuclarin Nutella icerdigini test edin
    //WebElement aramaSonuclariYazisi= Driver.getDriver().findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
    String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
    String expectedSonucYazisi="Nutella";
    Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
    Driver.closeDriver();

}
}
