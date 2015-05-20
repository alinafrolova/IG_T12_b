package com.frolova.features;

import com.frolova.steps.CreditCardSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 5/19/15.
 */
@RunWith(SerenityRunner.class)
public class CreditCardStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    CreditCardSteps creditCardSteps;


    @Test
    @WithDriver("chrome")
    public void get_credit_card(){
        creditCardSteps.open_site_with_credit_card();
        creditCardSteps.generateCard();

    }
}
