package com.example.aduba_000.changesfinance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.aduba_000.changesfinance.R;

public class BalanceSheetStatement extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_sheet_statement);

        setTitle("Balance Sheet");
        setBalanceSheetView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.balance_sheet_statement, menu);
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

    public void setBalanceSheetView(){

        //companyControl.company.update();
        // companyControl.company.printTable();

        //Cash
        TextView text = (TextView) findViewById(R.id.cashBefore);
        String test = "" + companyControl.company.currentCompany.currentCompanyBS.getCash();
        text.setText(test);

        text = (TextView) findViewById(R.id.cashAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getCash();
        text.setText(test);

        //Short Term Investments
        text = (TextView) findViewById(R.id.shortTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getShortTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.shortTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getShortTermInvestments();
        text.setText(test);

        //Accounts Receivable
        text = (TextView) findViewById(R.id.accountsReceivableBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getAccountsReceivable();
        text.setText(test);

        text = (TextView) findViewById(R.id.accountsReceivableAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getAccountsReceivable();
        text.setText(test);

        //Prepaid expenses
        text = (TextView) findViewById(R.id.prepaidExpensesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getPrepaidExpenses();
        text.setText(test);



        text = (TextView) findViewById(R.id.prepaidExpensesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getPrepaidExpenses();
        text.setText(test);



        //Inventory
        text = (TextView) findViewById(R.id.inventoryBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getInventory();
        text.setText(test);

        text = (TextView) findViewById(R.id.inventoryAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getInventory();
        text.setText(test);


        //Total Current Assets
        text = (TextView) findViewById(R.id.totalCurrentAssetsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalCurrentAssets();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalCurrentAssetsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalCurrentAssets();
        text.setText(test);


        //PPE
        text = (TextView) findViewById(R.id.PPEBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getPPE();
        text.setText(test);

        text = (TextView) findViewById(R.id.PPEAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getPPE();
        text.setText(test);

        //Other Intangible Assets
        text = (TextView) findViewById(R.id.intangibleAssetsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getIntangibleAssets();
        text.setText(test);

        text = (TextView) findViewById(R.id.intangibleAssetsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getIntangibleAssets();
        text.setText(test);


        //Long Term Investments
        text = (TextView) findViewById(R.id.longTermInvestmentsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getLongTermInvestments();
        text.setText(test);

        text = (TextView) findViewById(R.id.longTermInvestmentsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getLongTermInvestments();
        text.setText(test);

        //Goodwill
        text = (TextView) findViewById(R.id.goodwillBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getGoodwill();
        text.setText(test);

        text = (TextView) findViewById(R.id.goodwillAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getGoodwill();
        text.setText(test);

        //Total Long Term Assets
        text = (TextView) findViewById(R.id.totalLongTermAssetsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalLongTermAssets();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalLongTermAssetsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalLongTermAssets();
        text.setText(test);

        //Total Assets
        text = (TextView) findViewById(R.id.totalAssetsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalAssets();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalAssetsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalAssets();
        text.setText(test);
        /////////////////////////End of Assets////////////////////////////////////////////////

        ///////////Start of liabilities and equity////////////////////////////////////////////

        //Revolver
        text = (TextView) findViewById(R.id.revolverBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getRevolver();
        text.setText(test);

        text = (TextView) findViewById(R.id.revolverAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getRevolver();
        text.setText(test);

        //Accounts Payable
        text = (TextView) findViewById(R.id.accountsPayableBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getAccountsPayable();
        text.setText(test);

        text = (TextView) findViewById(R.id.accountsPayableAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getAccountsPayable();
        text.setText(test);

        //Accrued Expenses
        text = (TextView) findViewById(R.id.accruedExpensesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getAccruedExpenses();
        text.setText(test);

        text = (TextView) findViewById(R.id.accruedExpensesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getAccruedExpenses();
        text.setText(test);

        //Total Current Liabilities
        text = (TextView) findViewById(R.id.totalCurrentLiabilitiesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalCurrentLiabilities();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalCurrentLiabilitiesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalCurrentLiabilities();
        text.setText(test);

        //Long Term Liabilities////////////////////////////

        //Deferred Revenue
        text = (TextView) findViewById(R.id.deferredRevenueBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getDeferredRevenue();
        text.setText(test);

        text = (TextView) findViewById(R.id.deferredRevenueAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getDeferredRevenue();
        text.setText(test);

        //Deferred Tax Liability
        text = (TextView) findViewById(R.id.deferredTaxLiabilityBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getDeferredTaxLiability();
        text.setText(test);

        text = (TextView) findViewById(R.id.deferredTaxLiabilityAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getDeferredTaxLiability();
        text.setText(test);

        //Long Term Debt
        text = (TextView) findViewById(R.id.longTermDebtBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getLongTermDebt();
        text.setText(test);

        text = (TextView) findViewById(R.id.longTermDebtAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getLongTermDebt();
        text.setText(test);

        //Total Long Term Liabilities
        text = (TextView) findViewById(R.id.totalLongTermLiabilitiesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalLongTermLiabilities();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalLongTermLiabilitiesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalLongTermLiabilities();
        text.setText(test);

        //Total Liabilities
        text = (TextView) findViewById(R.id.totalLiabilitiesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalLiabilities();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalLiabilitiesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalLiabilities();
        text.setText(test);

        ///////////////////////////End of Liabilities//////////////////////////////////////////

        ////////////////////////////Shareholder's Equity//////////////////////////////////////



        ////////////////////////// END OF INVESTING/ ///////////////////


        ///FINANCING ACTIVITIES//////////////////////////////

        ///Common Stock
        text = (TextView) findViewById(R.id.commonStockBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getCommonStock();
        text.setText(test);

        text = (TextView) findViewById(R.id.commonStockAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getCommonStock();
        text.setText(test);

        //Treasury Stock
        text = (TextView) findViewById(R.id.treasuryStockBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTreasuryStock();
        text.setText(test);

        text = (TextView) findViewById(R.id.treasuryStockAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTreasuryStock();
        text.setText(test);

        //Retained Earnings
        text = (TextView) findViewById(R.id.retainedEarningsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getRetainedEarnings();
        text.setText(test);

        text = (TextView) findViewById(R.id.retainedEarningsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getRetainedEarnings();
        text.setText(test);

        //Other Income
        text = (TextView) findViewById(R.id.otherIncomeBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getOtherIncome();
        text.setText(test);

        text = (TextView) findViewById(R.id.otherIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getOtherIncome();
        text.setText(test);

        //Total Shareholders Equity
        text = (TextView) findViewById(R.id.totalShareholdersEquityBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getShareholdersEquity();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalShareholdersEquityAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getShareholdersEquity();
        text.setText(test);

        //Total Liabilities and Equity
        text = (TextView) findViewById(R.id.totalLiabilitiesAndEquityBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.getTotalLiabilitiesAndEquity();
        text.setText(test);

        text = (TextView) findViewById(R.id.totalLiabilitiesAndEquityAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.getTotalLiabilitiesAndEquity();
        text.setText(test);

        //Balanced

        text = (TextView) findViewById(R.id.balancedBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyBS.balanced();
        text.setText(test);

        text = (TextView) findViewById(R.id.balancedAfter);
        test = "" + companyControl.company.endCompany.currentCompanyBS.balanced();
        text.setText(test);



    }
}
