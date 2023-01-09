package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_NegatifLoginTesti {
// 3 test method'u olusturun
// 1.de yanlis email, dogru sifre
// 2.de dogru email yanlis sifre
// 3.de yanlis email, yanlis sifre ile giris yapmayi deneyin
// giris yapilamadigini test edin


    QualitydemyPage qualitydemyPage=new QualitydemyPage();
@Test
    public void yanlisEmailTesti(){
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    qualitydemyPage.ilkLoginLinki.click();
    qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUserName"));
    qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


    qualitydemyPage.loginButonu.click();

    Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

    ReusableMethods.bekle(3);
    Driver.closeDriver();
}

@Test
    public void yanlisPasswordTesi(){
    qualitydemyPage=new QualitydemyPage();
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    qualitydemyPage.ilkLoginLinki.click();
    qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
    qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPasssword"));
    qualitydemyPage.cookieAccept.click();
    qualitydemyPage.loginButonu.click();

    Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

    ReusableMethods.bekle(3);
    Driver.closeDriver();

}
@Test
    public  void yanlisUsernameVePasswordTesti(){
    qualitydemyPage=new QualitydemyPage();
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    qualitydemyPage.ilkLoginLinki.click();
    qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUserName"));
    qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPasssword"));
    qualitydemyPage.cookieAccept.click();
    qualitydemyPage.loginButonu.click();

    Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

    ReusableMethods.bekle(3);

    Driver.closeDriver();




}
}
