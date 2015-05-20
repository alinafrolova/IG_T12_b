package com.frolova.steps;

import com.frolova.pages.AdminPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;
/**
 * Created by Frolova.A on 5/12/15.
 */
public class AdminSteps extends ScenarioSteps {
    AdminPages adminPages;

    @Step
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void loginAdmin(){
        adminPages.enterLoginPass("alina.frolova@maxymiser.com","");
        adminPages.logInSubmit();
//        adminPages.choose_configuration_action_log();
    }
    @Step
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void clearAdmin(){
        adminPages.clearActionLog();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openAdmin(){
        getDriver().manage().window().maximize();
        adminPages.open();

        }
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openActionLog(){
        adminPages.openActionLog();
       }

    @Step
    public void should_see_definition(String text,String definition) {
        assertThat(adminPages.getDefinitions(), hasItem(containsString(definition)));

    }


}
