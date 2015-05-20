package com.frolova.steps;

import com.frolova.pages.CreditCardPages;
import com.frolova.pages.DepositPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Frolova.A on 5/19/15.
 */
public class DepositSteps extends ScenarioSteps {
    DepositPages depositPages;
    CreditCardPages creditCardPages;
    //////////////////////////////////////////////////////////////////////////////////////////
    public void do_deposit(){
        depositPages.add_amount("25.00");
        depositPages.add_card_number("4485387717420266");
        depositPages.add_month();
        depositPages.add_cvv();
        depositPages.submit_page_deposit();
        depositPages.check_balance();
    }
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void open_page_for_deposit(){
        getDriver().manage().window().maximize();
        depositPages.open();

    }
}
