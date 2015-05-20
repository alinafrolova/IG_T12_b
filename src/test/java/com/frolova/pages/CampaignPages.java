package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Frolova.A on 4/29/15.
 */
//@DefaultUrl("https://staging.igame.com/en/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1")
@DefaultUrl("https://www.igame.com/no/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1")
@NamedUrls(
        {
                @NamedUrl(name = "en", url = "https://www.igame.com/{1}/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1"),
                @NamedUrl(name = "fi", url = "https://www.igame.com/{2}/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1"),
                @NamedUrl(name = "no", url = "https://www.igame.com/{3}/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1")
        }
)

public class CampaignPages extends PageObject {

    private WebDriver driver;


    //////////////////////////////////fields
    @FindBy(id = "firstname")
    private WebElementFacade firstname;
    //////////////////////////////////
    @FindBy(id = "lastname")
    private WebElementFacade lastname;
    //////////////////////////////////
    @FindBy(id = "email")
    private WebElementFacade e_mail;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElementFacade dobD;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElementFacade dobD2;
    //////////////////////////////////
    @FindBy(linkText = "1")
    private WebElementFacade chooseDay2;
    ///////////////////////////////////
    @FindBy(xpath = "//div/div/div/ul/li[3]/a")
    private WebElementFacade chooseDay;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElementFacade dobM;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElementFacade dobM2;
    //////////////////////////////////
    @FindBy(xpath = "//div[2]/div/div/ul/li[3]/a")
    private WebElementFacade chooseMon;
       //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElementFacade dobY;
    //////////////////////////////////
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElementFacade dobY2;
    //////////////////////////////////
    @FindBy(linkText = "1990")
    private WebElementFacade chooseYear;
    //////////////////////////////////
    @FindBy(id = "address1")
    private WebElementFacade address1;
    //////////////////////////////////
    @FindBy(id = "city")
    private WebElementFacade city;
    //////////////////////////////////
    @FindBy(id = "postcode")
    private WebElementFacade postcode;
    //////////////////////////////////
    @FindBy(id = "username")
    private WebElementFacade username;
    //////////////////////////////////
    @FindBy(id = "phonenumber")
    private WebElementFacade phonenumber;
    //////////////////////////////////
    @FindBy(id = "passwordone")
    private WebElementFacade passwordone;
    //////////////////////////////////
    @FindBy(id = "passwordtwo")
    private WebElementFacade passwordtwo;

    //////////////////////////////////button
    @FindBy(id = "terms")
    private WebElementFacade terms ;
    /////////////////////////////////
    @FindBy(css = "#mm-btn > strong")
    private WebElementFacade stepSubmit;
    /////////////////////////////////
    /////////////////////////////////
    @FindBy(css = "#signupBtn > strong")
    private WebElementFacade submit;
    /////////////////////////////////
    @FindBy (id = "user-panel-logged-in")
    private WebElementFacade panel_logged_in;
    /////////////////////////////////


    Cookie mmcore = new Cookie("mmcore.opc.enabled", "1");
    Cookie cfgid = new Cookie("mmcore.cfgid", "1");

    /////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }
   /////////////////////////////////////////////////////////////////////////////////////////////
   public void addCookies(){

    driver.manage().addCookie(mmcore);
    System.out.println("enabled");
    driver.manage().addCookie(cfgid);
    driver.navigate().refresh();
}
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void check_cookie(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println(allCookies);
        for (Cookie loadedCookie : allCookies) {
            System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));

        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void firstname(String name){
        firstname.clear();
        firstname.sendKeys(name);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void lastname(String name){
        lastname.clear();
        lastname.sendKeys(name);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void email(String email){
        e_mail.clear();
        e_mail.sendKeys(email);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithDay(){

        dobD.click();
        chooseDay.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithDay2(){

        dobD2.click();
        chooseDay2.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithMon(){

        dobM.click();
        chooseMon.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithMon2(){

        dobM2.click();
        chooseMon.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithYear(){

        dobY.click();
        chooseYear.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithYear2(){

        dobY2.click();
        chooseYear.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void address1(String add){
        address1.clear();
        address1.sendKeys(add);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void postcode(String code){
        postcode.clear();
        postcode.sendKeys(code);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void city(){
        city.clear();
        city.sendKeys("London");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void phonenumber(String ph){
        phonenumber.clear();
        phonenumber.sendKeys(ph);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void passwordone(){
        passwordone.clear();
        passwordone.sendKeys("qwerty123");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void username(String usern){
        username.clear();
        username.sendKeys(usern);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void passwordtwo(){
        passwordtwo.clear();
        passwordtwo.sendKeys("qwerty123");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void submit(){
        boolean wait_submit;
        submit.click();
        waitForWithRefresh();
        withTimeoutOf(5, TimeUnit.SECONDS).elementIsDisplayed(By.id("user-panel-logged-in"));
        wait_submit= panel_logged_in.isPresent();
        while (wait_submit=false)
        {
            wait_submit= panel_logged_in.isDisplayed();
            System.out.println(wait_submit);
        }
        }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void stepSubmit(){
        stepSubmit.click();
        waitForWithRefresh();


    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void three_submit(){
        stepSubmit.click();
        waitForWithRefresh();
        withTimeoutOf(5, TimeUnit.SECONDS).elementIsDisplayed(By.id("user-panel-logged-in"));

    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void terms(){
        terms.click();
    }




}
