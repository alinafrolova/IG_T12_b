package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Frolova.A on 5/18/15.
 */
@DefaultUrl("http://www.getcreditcardnumbers.com/how-to-get-a-visa-credit-card")
public class CreditCardPages extends PageObject {
    @FindBy(xpath = "//button")
    private WebElementFacade generate;
    //////////////////////////////////
    @FindBy(className = "generatednumber")
    private WebElementFacade generatednumber;
    //////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void get_generete_card(){
        String CARDDef,CARD;
        CARDDef = "4111111111111111";
        generate.click();
        CARD=generatednumber.getText();
        System.out.println(CARD);

        float Def = Float.parseFloat(CARD);
        float CDef = Float.parseFloat(CARDDef);

        do{
            CARD =generatednumber.getText();
            Def = Float.parseFloat(CARD);
            //log.info(mon);
            System.out.println("CARD " + CARD);
            generate.click();

        } while (Def == CDef);
        System.out.println("CARD " + CARD);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
}
