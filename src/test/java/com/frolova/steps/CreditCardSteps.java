package com.frolova.steps;

import com.frolova.pages.CreditCardPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Frolova.A on 5/18/15.
 */
public class CreditCardSteps extends ScenarioSteps {
    CreditCardPages creditCardPages;


    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void open_site_with_credit_card(){
        getDriver().manage().window().maximize();
        creditCardPages.open();

    }
    @Step
    public void generateCard(){
        creditCardPages.get_generete_card();


    }
}
