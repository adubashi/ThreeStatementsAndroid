package com.example.aduba_000.changesfinance;

/**
 * Created by aduba_000 on 7/25/2015.
 */
public class companyControl {
    public static TwoPeriodCompany company = new TwoPeriodCompany(100, .4);

    public static int i = 0;

    public static int changeCash = 0;




    public static void reset(){
       company = new TwoPeriodCompany(100, .4);
    }

    public static void reset(int cash, double taxRate){
        System.out.println("Tax Rate:");
        System.out.println(taxRate);
        company = new TwoPeriodCompany(cash, taxRate);
        companyControl.company.update();
    }



    public static void zeroBalanceSheetChanges(){
        companyControl.company.changeAccountsReceivable(0);
        companyControl.company.changePrepaidExpenses(0);
        companyControl.company.changeInventory(0);
        companyControl.company.changeAccruedExpenses(0);
        companyControl.company.changeAccountsPayable(0);
        companyControl.company.changeDeferredRevenue(0);
    }

    public static void zeroIncomeStatementChanges(){
        companyControl.company.changeRevenue(0);
        companyControl.company.changeOperatingExpenses(0);
        companyControl.company.changeDepreciation(0);
        companyControl.company.changeAmortizationOfIntangibles(0);
        companyControl.company.changeInterestIncome(0);
        companyControl.company.changeInterestExpense(0);
        companyControl.company.changeSaleOfPPE(0);
        companyControl.company.changeSaleOfST(0);
        companyControl.company.changeGoodwillImpairment(0);
        companyControl.company.changePPEwritedown(0);
        companyControl.company.changeDeferredIncomeTaxes(0);
    }

    public static void zeroCashFlowStatementChanges(){
        companyControl.company.changePurchaseShortTermInvestments(0);
        companyControl.company.changeSellShortTermInvestments(0);
        companyControl.company.changePurchaseLongTermInvestments(0);
        companyControl.company.changeSellLongTermInvestments(0);
        companyControl.company.changePPEsaleProceeds(0);
        companyControl.company.changeCapitalExpenditures(0);

        companyControl.company.changeIncreaseDividendsIssued(0);
        companyControl.company.changeIssueLongTermDebt(0);
        companyControl.company.changeRepayLongTermDebt(0);
        companyControl.company.changeIssueShortTermDebt(0);
        companyControl.company.changeRepayShortTermDebt(0);
        companyControl.company.changeRepurchaseShares(0);
        companyControl.company.changeIssueNewShares(0);
    }

    public static void resetIncomeAndBalanceSheetChanges(){
        zeroBalanceSheetChanges();
        zeroIncomeStatementChanges();
    }

    public static void resetBalanceSheetAndCashFlow(){
        zeroBalanceSheetChanges();
        zeroCashFlowStatementChanges();
    }

    public static void resetIncomeAndCashFlow(){
        zeroIncomeStatementChanges();
        zeroCashFlowStatementChanges();
    }

    public static void getChanges(){
        changeCash = company.endCompany.currentCompanyCF.getEndCash() - company.currentCompany.currentCompanyCF.getEndCash();
        System.out.println("Change Cash:");
        System.out.println(changeCash);
    }
}
