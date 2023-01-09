package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {


    //Page sayfalari o websayfasinda kullanilacak locate ler
    //ve varsa login islemi gibi basit methodlar icin kullanilir

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath="//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")
    public WebElement aramaSonucuElementi;
//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
}
