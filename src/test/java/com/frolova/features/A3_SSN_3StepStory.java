package com.frolova.features;

import com.frolova.steps.AdminSteps;
import com.frolova.steps.CampaignSteps;
import com.frolova.steps.DepositSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 5/14/15.
 */
@RunWith(SerenityRunner.class)
public class A3_SSN_3StepStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    AdminSteps adminSteps;
    @Steps
    CampaignSteps campaignSteps;
    @Steps
    DepositSteps depositSteps;
    @Test
         @WithDriver("firefox")
         public void b_work_with_campaignEN(){
        adminSteps.openAdmin();
        adminSteps.loginAdmin();
        adminSteps.clearAdmin();
        campaignSteps.openSiteEN();
        campaignSteps.fillFirstA4Step();
        campaignSteps.fillTwotA4Step();
        campaignSteps.fillThreetA4Step();
//        depositSteps.open_page_for_deposit();
//        depositSteps.do_deposit();
    }
    @Test
    @WithDriver("firefox")
    public void c_find_actiona_in_action_logEN(){
        adminSteps.openAdmin();

        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12b_3_Step_Reg_England_Norway_Finland");
        adminSteps.should_see_definition("Content- ","a_page=a2_3step_image");
        adminSteps.should_see_definition("Action- ","t12b_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_stepthree=1,unique;");
        // adminSteps.should_see_definition("Action- ","t12b_registration");
        // adminSteps.should_see_definition("Action- ","t12b_firstdeposit");

    }
    ///////////////////////////////////FI
    @Test
    @WithDriver("firefox")
    public void b_work_with_campaignFI(){
        adminSteps.openAdmin();
        adminSteps.clearAdmin();
        campaignSteps.openSiteFI();
        campaignSteps.fillFirstA4Step();
        campaignSteps.fillTwotA4Step();
        campaignSteps.fillThreetA4Step();
//        depositSteps.open_page_for_deposit();
//        depositSteps.do_deposit();
    }
    @Test
    @WithDriver("firefox")
    public void c_find_actiona_in_action_logFI(){
        adminSteps.openAdmin();

        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12b_3_Step_Reg_England_Norway_Finland");
        adminSteps.should_see_definition("Content- ","a_page=a2_3step_image");
        adminSteps.should_see_definition("Action- ","t12b_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_stepthree=1,unique;");
        // adminSteps.should_see_definition("Action- ","t12b_registration");
        // adminSteps.should_see_definition("Action- ","t12b_firstdeposit");

    }
    ///////////////////////////////////FI
    @Test
    @WithDriver("firefox")
    public void b_work_with_campaignNO(){
        adminSteps.openAdmin();
        adminSteps.clearAdmin();
        campaignSteps.openSiteNO();
        campaignSteps.fillFirstA4Step();
        campaignSteps.fillTwotA4Step();
        campaignSteps.fillThreetA4Step();
//        depositSteps.open_page_for_deposit();
//        depositSteps.do_deposit();
    }
    @Test
    @WithDriver("firefox")
    public void c_find_actiona_in_action_logNO(){
        adminSteps.openAdmin();

        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12b_3_Step_Reg_England_Norway_Finland");
        adminSteps.should_see_definition("Content- ","a_page=a2_3step_image");
        adminSteps.should_see_definition("Action- ","t12b_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_stepthree=1,unique;");
        // adminSteps.should_see_definition("Action- ","t12b_registration");
        // adminSteps.should_see_definition("Action- ","t12b_firstdeposit");

    }
}
