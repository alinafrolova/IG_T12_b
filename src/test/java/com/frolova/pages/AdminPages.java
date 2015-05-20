package com.frolova.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

/**
 * Created by Frolova.A on 4/28/15.
 */

@DefaultUrl("https://ui61.maxymiser.com/Admin/account-igame/529/site-igame-com/438/ActionLog")
public class AdminPages extends PageObject {
    private WebDriver driver;
    private String adminCamp,checkCamp,baseUrl,m;

    @Before
    public void setUp(){

        adminCamp = "https://ui61.maxymiser.com/Admin/account-igame/529/site-igame-com/438/ActionLog";

    }
    @FindBy(id = "Login")
    private WebElementFacade login;


    @FindBy(id = "Password")
    private WebElementFacade password;

    @FindBy(css = "div.auth-line > #Login")
    private WebElementFacade submit;

    @FindBy(id = "bDropToArchive")
    private WebElementFacade clear;
    ///////////////////////////////////////////////////////
    @FindBy(css = "div.stateStr")
    private WebElementFacade configuration;
    ///////////////////////////////////////
    @FindBy(id = "HIT")
    private WebElementFacade hit;
    ///////////////////////////////////////
    @FindBy(id = "CITY")
    private WebElementFacade city;
    ///////////////////////////////////////
    @FindBy(id = "PAGE")
    private WebElementFacade page;
    ///////////////////////////////////////
    @FindBy(id = "CAMPAIGN")
    private WebElementFacade campaign;
    ///////////////////////////////////////
    @FindBy(id = "CAMPAIGN_VERSION")
    private WebElementFacade campaign_version;
    ///////////////////////////////////////
    @FindBy(id = "ISGENERATION")
    private WebElementFacade isGeneration;
    ///////////////////////////////////////
    @FindBy(id = "ISCONTENTPAGE")
     private WebElementFacade isContentPage;
    ///////////////////////////////////////
    @FindBy(id = "CRITERIA")
    private WebElementFacade pc;
    ///////////////////////////////////////
    @FindBy(id = "SEGMENTS")
    private WebElementFacade segments;
    ///////////////////////////////////////
    @FindBy(id = "COOKIES")
    private WebElementFacade cookies;
    ///////////////////////////////////////
    @FindBy(id = "REFERRER")
    private WebElementFacade referrer;
    ///////////////////////////////////////
    @FindBy(id = "SERVER")
    private WebElementFacade server;
    ///////////////////////////////////////
    @FindBy(id = "AGENT")
    private WebElementFacade agent;
    ///////////////////////////////////////
    @FindBy(id = "BROWSER")
    private WebElementFacade browser;
    ///////////////////////////////////////
    @FindBy(id = "OS")
    private WebElementFacade os;
    ///////////////////////////////////////
    @FindBy(id = "DEVICETYPE")
    private WebElementFacade deviceType;
    ///////////////////////////////////////
    @FindBy(id = "SITELOCATION")
    private WebElementFacade siteLocation;
    ///////////////////////////////////////
    @FindBy(id = "GENERATIONMETHOD")
    private WebElementFacade generationmethod;
    ///////////////////////////////////////
    @FindBy(id = "bApply")
    private WebElementFacade apply;
///////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////

    public void enterLoginPass(String log, String pass){
        login.sendKeys(log);
        password.sendKeys(pass);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void logInSubmit(){
        submit.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void clearActionLog(){
        clear.click();

    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void choose_configuration_action_log(){
        configuration.click();
        campaign.click();
        pc.click();
        apply.click();

    }
    public void openActionLog() {
        getDriver().get("https://ui61.maxymiser.com/Admin/account-igame/529/site-igame-com/438/ActionLog/AjaxLoadGrid?configType=Sandbox&ipCategory=OWN_IP&_");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public void closeDriver(){
        driver.quit();
    }
    /////////////////////////////////////////
    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("body"));
        List<WebElement> results = definitionList.findElements(By.tagName("pre"));
        System.out.println("RESULTS"+results);
        return convert(results, toStrings());
    }
    /*String results = getDriver().getPageSource();
        System.out.println(results);
        return convert(results, toStrings());*/
    /////////////////////////////////////////////////////////////////////////////////////////////
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }


}
