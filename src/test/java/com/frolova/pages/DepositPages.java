package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 5/19/15.
 */
@DefaultUrl("https://staging.igame.com/sv/deposit/creditcard?registration=1?mmcore.opc.enabled=1&mmcore.cfgid=1")
public class DepositPages  extends PageObject {
    public WebDriver webdriver;

    @FindBy(css = "#igame-deposit-amounts > div > button:nth-child(4)")
    private WebElementFacade button_amount;
    /////////////////////////////////page deposit
    @FindBy(id = "user-panel-logged-in")
    private WebElementFacade panel_logged_in;
    /////////////////////////////////
    @FindBy(id = "amount")
    private WebElementFacade amount;
    /////////////////////////////////
    @FindBy(id = "cardnumber")
    private WebElementFacade cardnumber;
    /////////////////////////////////
    @FindBy(id = "cvv1")
    private WebElementFacade cvv;
    /////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElementFacade dateday;
    /////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[8]")
    private WebElementFacade datemon;
    ///////////////////////////////////
    @FindBy(linkText = "Dec - 12")
    private WebElementFacade choosemonth;
    /////////////////////////////////
    @FindBy(css = "#btnDeposit > strong")
    private WebElementFacade submitDeposit;
    /////////////////////////////////
    @FindBy(id = "balance_total")
    private WebElementFacade balance;
    /////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void add_amount(String summ){
        button_amount.click();

    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void add_card_number(String cardnumbber){
        cardnumber.click();
        cardnumber.clear();
        cardnumber.sendKeys(cardnumbber);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void add_month(){
        dateday.click();
        choosemonth.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void add_cvv(){
        cvv.click();
        cvv.clear();
        cvv.sendKeys("500");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    public void submit_page_deposit(){
        submitDeposit.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    public void check_balance(){
        String new_str="0";
        float cont =0;
        try {
            new_str = balance.getText();
            System.out.println("mnew_stron " + new_str);
            String mon = new_str.replace (',', '.');
            System.out.println("mon " + mon);
            cont = Float.parseFloat(mon);
            System.out.println("cont " +cont);
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        do{
            cont =0;
            new_str =balance.getText();
            System.out.println("new_str " + new_str);
            String mon = new_str.replace (',', '.');
            System.out.println("mon " + mon);
            cont = Float.parseFloat(mon);
            System.out.println("cont " + cont);

        } while (cont == 0f);
        System.out.println("cont" + cont);
    }
}
