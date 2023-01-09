package tests.day14_testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {
/*
testNG de iki tane Assert classs i vardir
1.si Junit deki Assert class i ile aynui methodlara sahiptir
ilk Failed olan Assert isleminde calismayi durdurur ve hata mesaji veriri

2.Assert classinin adi Soft ASSErt oldugu icin ilkine Hard Assert denmistir

2.Assert Classs i ise soft Assert Class idir
SoftAssert biz raporla diyinceye kadar
assertion lari failed olsa bile calistirmaya devam eder
Biz raporla dedigimizde calisan assertionlardam kacinin Failed  oldugunu soyler
ve Failed olan assertion varsa raporla dedigimiz satirda calismayi durdurur
 */
@Test
    public void test01(){

    Assert.assertTrue(6>4);
    System.out.println("1.assertion sonrasi ");
    Assert.assertTrue(6>3);
    System.out.println("2.assertion sonrasi ");
    Assert.assertEquals(6,6);
    System.out.println("3.assertion sonrasi ");

}


}
