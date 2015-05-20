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
public class DefaultStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    AdminSteps adminSteps;
    @Steps
    CampaignSteps campaignSteps;
    @Steps
    DepositSteps depositSteps;

    @Test
    @WithDriver("iexplorer")
    public void b_work_with_campaign(){
        adminSteps.openAdmin();
        adminSteps.loginAdmin();
        adminSteps.clearAdmin();
        campaignSteps.openSiteEN();
        campaignSteps.fillDefaultStep();
       /* depositSteps.open_page_for_deposit();
        depositSteps.do_deposit();*/

    }
    @Test
    @WithDriver("iexplorer")
    public void c_find_actiona_in_action_log(){
        adminSteps.openAdmin();
        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12b_3_Step_Reg_England_Norway_Finland");
        adminSteps.should_see_definition("Content- ","a_page=Default;");
        adminSteps.should_see_definition("Action- ","t12b_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12b_stepthree=1,unique;");
       adminSteps.should_see_definition("Action- ","t12b_registration");
        adminSteps.should_see_definition("Action- ","t12b_firstdeposit");

    }

}
