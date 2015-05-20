package com.frolova.steps;

import com.frolova.addition.Temp;
import com.frolova.pages.CampaignPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Cookie;

import java.util.Random;

/**
 * Created by Frolova.A on 5/19/15.
 */
public class CampaignSteps extends ScenarioSteps {
    CampaignPages campaignPages;

    ///////////////////////////////////////////////////////////
    String name = "MyIG" + Temp.randomtxt(4);
    String usern = "MyIG" +  Temp.randomtxt(4)+new Random().nextInt(999);
    String mail = "MyIG" + Temp.randomtxt(4) +new Random().nextInt(999)+ "@maxymiser.com";
    String ph = "95495758"+ new Random().nextInt(999);
    private Cookie mmcore;

    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openSiteEN(){
        getDriver().manage().window().maximize();
        campaignPages.open("en", new String[] {"en"});
        campaignPages.deleteAllCookies();
        campaignPages.addCookies();
    }
    ///////////////////////////////////////////////////////////
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openSiteFI(){
        getDriver().manage().window().maximize();
        campaignPages.open("fi", new String[] {"fi"});
    }
    ///////////////////////////////////////////////////////////
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openSiteNO(){
        getDriver().manage().window().maximize();
        campaignPages.open("no", new String[] {"no"});
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillDefaultStep(){
//        campaignPages.check_cookie();
        // campaignPages.addCookies();
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.submit();

    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillSecondtStep(){
        //  campaignPages.addCookie(mmcore);
//        campaignPages.check_cookie();
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.submit();

    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillFirstA4Step(){
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillTwotA4Step(){

        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillThreetA4Step(){

        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.three_submit();
    }
}
