package tests.day14_testNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    @Test(priority = -3)
    public void  birinciTest(){
        System.out.println("Birinci Test Calisti");
        Assert.assertTrue(5>9);
    }
    @Test(dependsOnMethods = "birinciTest")
    public void  IkinciTest(){
        System.out.println("Ikinci Test Calisti");
    }

    @Test(dependsOnMethods = "IkinciTest")
    public void  ucuncuTest(){
        System.out.println("Ucucncu Test Calisti");
    }















}
