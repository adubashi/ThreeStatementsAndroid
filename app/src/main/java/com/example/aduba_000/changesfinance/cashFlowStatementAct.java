package com.example.aduba_000.changesfinance;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.TextView;

import com.example.aduba_000.changesfinance.R;

public class cashFlowStatementAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_flow_statement);

        setTitle("Cash Flow Statement");
        setCashFlowStatementView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cash_flow_statement, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id == R.id.introduction){
            Intent i = new Intent(this, Introduction.class);
            startActivity(i);

        }
        if (id == R.id.activity_income_statement) {
            //TwoPeriodCompany sampleObject = new TwoPeriodCompany(100, .4);
            Intent i = new Intent(this, incomeStatementAct.class);

            //i.putExtra("com.example.aduba_000.changesfinance.company", company);

            startActivity(i);
            //startActivityForResult(i, 100);
        }
        if (id == R.id.activity_income_statement_changes) {
            Intent i = new Intent(getApplicationContext(), IncomeStatementChanges.class);
            startActivityForResult(i, 100);
        }

        if (id == R.id.activity_cash_flow_statement) {
            Intent i = new Intent(getApplicationContext(), cashFlowStatementAct.class);
            startActivityForResult(i, 100);
        }

        if (id == R.id.activity_cash_flow_statement_change) {
            Intent i = new Intent(getApplicationContext(), CashFlowStatementChange.class);
            startActivityForResult(i, 100);
        }

        if (id == R.id.activity_balance_sheet_statement) {
            Intent i = new Intent(getApplicationContext(), BalanceSheetStatement.class);
            startActivityForResult(i, 100);
        }

        if (id == R.id.activity_balance_sheet_change) {
            Intent i = new Intent(getApplicationContext(), BalanceStatementChanges.class);
            startActivityForResult(i, 100);
        }
        return super.onOptionsItemSelected(item);
    }

    public void setCashFlowStatementView(){
        //Net Income


        //companyControl.company.update();

        TextView text = (TextView) findViewById(R.id.netIncomeBefore);
        String test = "" + companyControl.company.currentCompany.currentCompanyCF.getNetIncome();
        text.setText(test);



        text = (TextView) findViewById(R.id.netIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getNetIncome();
        text.setText(test);

        //Depreciation
        text = (TextView) findViewById(R.id.depreciationBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getDepreciation();
        text.setText(test);

        text = (TextView) findViewById(R.id.depreciationAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getDepreciation();
        text.setText(test);

        //Stock Based Compensation
        text = (TextView) findViewById(R.id.SBCBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getStockBasedCompensation();
        text.setText(test);

        text = (TextView) findViewById(R.id.SBCAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getStockBasedCompensation();
        text.setText(test);

        //Amortization
        text = (TextView) findViewById(R.id.amortizationBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getAmortizationOfIntangibles();
        text.setText(test);



        text = (TextView) findViewById(R.id.amortizationAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getAmortizationOfIntangibles();
        text.setText(test);



        //Deferred Income Taxes
        text = (TextView) findViewById(R.id.deferredPortionOfIncomeTaxesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getDeferredIncomeTaxes();
        text.setText(test);

        text = (TextView) findViewById(R.id.deferredPortionOfIncomeTaxesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getDeferredIncomeTaxes();
        text.setText(test);


        //Gain on sale of PPE
        text = (TextView) findViewById(R.id.gainOnSaleOfPPEBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getGainOnSaleOfPPE();
        text.setText(test);

        text = (TextView) findViewById(R.id.gainOnSaleOfPPEAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getGainOnSaleOfPPE();
        text.setText(test);


        //Gain on sale of ST
        text = (TextView) findViewById(R.id.gainOnSaleOfSTBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getGainOnSaleOfST();
        text.setText(test);

        text = (TextView) findViewById(R.id.gainOnSaleOfSTAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getGainOnSaleOfST();
        text.setText(test);

        //Goodwill Impairment
        text = (TextView) findViewById(R.id.goodwillImpairmentBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getGoodwillImpairment();
        text.setText(test);

        text = (TextView) findViewById(R.id.goodwillImpairmentAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getGoodwillImpairment();
        text.setText(test);


        //PPE writedown
        text = (TextView) findViewById(R.id.ppeWritedownBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getPPEwritedown();
        text.setText(test);

        text = (TextView) findViewById(R.id.ppeWritedownAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getPPEwritedown();
        text.setText(test);

        ////////////////////CHANGES/////////////////
        //Accounts Receivable
        text = (TextView) findViewById(R.id.accountsReceivableBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesInaccountsReceivable();
        text.setText(test);

        text = (TextView) findViewById(R.id.accountsReceivableAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesInaccountsReceivable();
        text.setText(test);

        //Accounts Payable
        text = (TextView) findViewById(R.id.accountsPayableBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesInaccountsPayable();
        text.setText(test);

        text = (TextView) findViewById(R.id.accountsPayableAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesInaccountsPayable();
        text.setText(test);

        //Prepaid Expenses
        text = (TextView) findViewById(R.id.prepaidExpensesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesInprepaidExpenses();
        text.setText(test);

        text = (TextView) findViewById(R.id.prepaidExpensesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesInprepaidExpenses();
        text.setText(test);

        //Inventory
        text = (TextView) findViewById(R.id.inventoryBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesIninventory();
        text.setText(test);

        text = (TextView) findViewById(R.id.inventoryAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesIninventory();
        text.setText(test);

        //Accrued Expenses
        text = (TextView) findViewById(R.id.accruedExpensesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesInaccruedExpenses();
        text.setText(test);

        text = (TextView) findViewById(R.id.accruedExpensesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesInaccruedExpenses();
        text.setText(test);

        //Deferred Revenue
        text = (TextView) findViewById(R.id.deferredRevenueBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getChangesIndeferredRevenue();
        text.setText(test);

        text = (TextView) findViewById(R.id.deferredRevenueAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getChangesIndeferredRevenue();
        text.setText(test);
        ///END OF CHANGES
        /////////Cash flow from operations////////
        text = (TextView) findViewById(R.id.cfOperationsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getCFfromOperations();
        text.setText(test);

        text = (TextView) findViewById(R.id.cfOperationsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getCFfromOperations();
        text.setText(test);

        ///Investing Activities/////////////
        //Purchase Short Term Investments
        text = (TextView) findViewById(R.id.purchaseShortTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getPurchaseShortTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.purchaseShortTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getPurchaseShortTermInvestments();
        text.setText(test);

        //Sell Short Term Investments
        text = (TextView) findViewById(R.id.sellShortTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getSellShortTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.sellShortTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getSellShortTermInvestments();
        text.setText(test);

        //Purchase Long Term Investments
        text = (TextView) findViewById(R.id.purchaseLongTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getPurchaseLongTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.purchaseLongTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getPurchaseLongTermInvestments();
        text.setText(test);

        //Sell Long Term Investments
        text = (TextView) findViewById(R.id.sellLongTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getSellLongTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.sellLongTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getSellLongTermInvestments();
        text.setText(test);

        //Capital Expenditures
        text = (TextView) findViewById(R.id.capitalExpendituresBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getCapitalExpenditures();
        text.setText(test);

        text = (TextView) findViewById(R.id.capitalExpendituresAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getCapitalExpenditures();
        text.setText(test);

        //PPE sale proceeds
        text = (TextView) findViewById(R.id.ppeSaleProceedsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getPPEsaleProceeds();
        text.setText(test);

        text = (TextView) findViewById(R.id.ppeSaleProceedsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getPPEsaleProceeds();
        text.setText(test);

        //Cash Flow from investing
        text = (TextView) findViewById(R.id.cashFlowfromInvestingBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getCFfromInvesting();
        text.setText(test);

        text = (TextView) findViewById(R.id.cashFlowfromInvestingAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getCFfromInvesting();
        text.setText(test);
        ////////////////////////// END OF INVESTING/ ///////////////////


        ///FINANCING ACTIVITIES//////////////////////////////

        ///Dividends Issued
        text = (TextView) findViewById(R.id.dividendsIssuedBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getDividendsIssued();
        text.setText(test);

        text = (TextView) findViewById(R.id.dividendsIssuedAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getDividendsIssued();
        text.setText(test);

        //Issue Long Term Debt
        text = (TextView) findViewById(R.id.issueLongTermDebtBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getIssueLongTermDebt();
        text.setText(test);

        text = (TextView) findViewById(R.id.issueLongTermDebtAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getIssueLongTermDebt();
        text.setText(test);

        //Repay Long Term Debt
        text = (TextView) findViewById(R.id.repayLongTermDebtBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getRepayLongTermDebt();
        text.setText(test);

        text = (TextView) findViewById(R.id.repayLongTermDebtAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getRepayLongTermDebt();
        text.setText(test);

        //Issue Short Term Debt
        text = (TextView) findViewById(R.id.issueShortTermDebtBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getIssueShortTermDebt();
        text.setText(test);

        text = (TextView) findViewById(R.id.issueShortTermDebtAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getIssueShortTermDebt();
        text.setText(test);

        //Repay Short Term Debt
        text = (TextView) findViewById(R.id.repayShortTermDebtBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getRepayShortTermDebt();
        text.setText(test);

        text = (TextView) findViewById(R.id.repayShortTermDebtAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getRepayShortTermDebt();
        text.setText(test);

        //Repurchase shares
        text = (TextView) findViewById(R.id.repurchaseSharesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getRepurchaseShares();
        text.setText(test);

        text = (TextView) findViewById(R.id.repurchaseSharesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getRepurchaseShares();
        text.setText(test);

        //Issue New Shares
        text = (TextView) findViewById(R.id.issueNewSharesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getIssueNewShares();
        text.setText(test);

        text = (TextView) findViewById(R.id.issueNewSharesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getIssueNewShares();
        text.setText(test);

        //CF from financing
        text = (TextView) findViewById(R.id.cashFlowFromFinancingBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getCFfromFinancing();
        text.setText(test);

        text = (TextView) findViewById(R.id.cashFlowFromFinancingAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getCFfromFinancing();
        text.setText(test);

        //Beginning Cash
        text = (TextView) findViewById(R.id.beginningCashBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getBeginningCash();
        text.setText(test);

        text = (TextView) findViewById(R.id.beginningCashAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getBeginningCash();
        text.setText(test);


        //Increase In cash
        text = (TextView) findViewById(R.id.increaseInCashBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getIncreaseInCash();
        text.setText(test);

        text = (TextView) findViewById(R.id.increaseInCashAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getIncreaseInCash();
        text.setText(test);

        //End Cash
        text = (TextView) findViewById(R.id.endCashBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyCF.getEndCash();
        text.setText(test);


        text = (TextView) findViewById(R.id.endCashAfter);
        test = "" + companyControl.company.endCompany.currentCompanyCF.getEndCash();
        text.setText(test);







    }
}
