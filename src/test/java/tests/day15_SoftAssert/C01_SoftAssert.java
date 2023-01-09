package tests.day15_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_SoftAssert {

@Test(groups = "minireg2")
    public void test01(){



    Driver.getDriver().get("https://www.amazon.com/");
    //amamzon ana sayfaya gittiginizi dogrulayin
    SoftAssert softassert=new SoftAssert();
    String expectedURLkelimesi="amazon";
    String actualURL=Driver.getDriver().getCurrentUrl();
    softassert.assertTrue(actualURL.contains(expectedURLkelimesi));
    //Nutella aratin
    AmazonPage  amazonPage=new AmazonPage();

    amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    // arama sonuclarinin nutella icerdigini dogrulayin
    String AramsonucYazisi=amazonPage.aramaSonucuElementi.getText();
    softassert.assertTrue(AramsonucYazisi.contains("Nutella"));
    //java aratin
    amazonPage.amazonAramaKutusu.clear();
    amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    ReusableMethods.bekle(10);
    // arama sonuclarinini 1000 den fazla oldugunu dogrulayin

    String aramasonucText=amazonPage.aramaSonucuElementi.getText();

    String [] sonucArr=aramasonucText.split(" ");
  String sonucSayisi=sonucArr[3];
  sonucSayisi=sonucSayisi.replaceAll("\\W","");
    System.out.println(sonucSayisi);
  int sonucSayisiInt=Integer.parseInt(sonucSayisi);
    softassert.assertTrue(sonucSayisiInt>1000);





    String str =amazonPage.aramaSonucuElementi.getText();
    System.out.println(str);
    String [] sonucArrm=str.split(" ");

    String javaSonucSayisiStr=sonucArr[3];
    javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");

    int sonucSayisiint=Integer.parseInt(javaSonucSayisiStr);

    softassert.assertTrue(sonucSayisiint>1000,"java arma sayiyi 1000 dem cok degil");
   softassert.assertAll();
   Driver.closeDriver();
}


}
