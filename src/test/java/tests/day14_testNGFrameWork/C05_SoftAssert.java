package tests.day14_testNGFrameWork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {


    @Test(groups = {"minireg1","smoke"})
    public void test01(){

        //1. adim softAssert objesi olusturmak

        SoftAssert sofAssert=new SoftAssert();

        //2.adim softAssert objesini kullanarak istenilen Assertionlari yapin

        sofAssert.assertEquals(8,8);//Failed
        System.out.println("1.Assertion sonrasi");
        sofAssert.assertTrue(5>3);//Passed
        System.out.println("2.Assertion sonrasi");
        sofAssert.assertFalse(3>5);//Failed
        System.out.println("3.assertion sonrasi");

        //3. adim softAssert e raporla diyecegiz
        sofAssert.assertAll();//Bu satirda calisma durur cunku Falked olan Assertion var
        System.out.println("Assert all sonrasi");

    }
}
