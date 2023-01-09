package tests.day14_testNGFrameWork;

import org.testng.annotations.Test;
/*
Test NG methodlarinin isim sirasina gore calisir
priority deger verilen methodlar priority degeri kucukten buyuge dogru calisir
esit olan priority degerlerinde harf sirasina gore calisir
eger priority yazmazsak deger 0 dir
 */
public class C01_TestNGIlkTest {
@Test()
    public void  birinciTest(){
    System.out.println("Birinci Test Calisti");
}
    @Test(priority = 9)
    public void  IkinciTest(){
        System.out.println("Ikinci Test Calisti");
    }

    @Test(priority = 6)
    public void  ucuncuTest(){
        System.out.println("Ucucncu Test Calisti");
    }





}
