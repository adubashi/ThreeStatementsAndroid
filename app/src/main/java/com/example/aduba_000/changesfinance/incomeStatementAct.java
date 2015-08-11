package com.example.aduba_000.changesfinance;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.content.Intent;
import com.example.aduba_000.changesfinance.R;


public class incomeStatementAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setIncomeStatementView();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_statement);
        setTitle("Income Statement");

        setIncomeStatementView();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.income_statement, menu);
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
            Intent i = new Intent(this, incomeStatementAct.class);
            startActivity(i);
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

    public void setIncomeStatementView(){
        //Revenue
        //companyControl.company.update();




        TextView text = (TextView) findViewById(R.id.revenueBefore);
        String test = "" + companyControl.company.currentCompany.currentCompanyIS.getRevenue();
        text.setText(test);

        text = (TextView) findViewById(R.id.revenueAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getRevenue();
        text.setText(test);

        //COGS
        text = (TextView) findViewById(R.id.cogsBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getCogs();
        text.setText(test);

        text = (TextView) findViewById(R.id.cogsAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getCogs();
        text.setText(test);

        //Gross Profit
        text = (TextView) findViewById(R.id.grossProfitBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getGrossProfit();
        text.setText(test);

        text = (TextView) findViewById(R.id.grossProfitAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getGrossProfit();
        text.setText(test);

        //Operating Expenses
        text = (TextView) findViewById(R.id.operatingExpensesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getOperatingExpenses();
        text.setText(test);



        text = (TextView) findViewById(R.id.operatingExpensesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getOperatingExpenses();
        text.setText(test);

        System.out.println("Operating Expenses from view" + test);
        System.out.println("Operating Expenses from company"  + companyControl.company.endCompany.currentCompanyIS.getOperatingExpenses() );





        //Depreciation
        text = (TextView) findViewById(R.id.depreciationBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getDepreciation();
        text.setText(test);

        text = (TextView) findViewById(R.id.depreciationAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getDepreciation();
        text.setText(test);


        //Stock Based Compensation
        text = (TextView) findViewById(R.id.SBCBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getStockBasedCompensation();
        text.setText(test);

        text = (TextView) findViewById(R.id.SBCAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getStockBasedCompensation();
        text.setText(test);


        //Amortization
        text = (TextView) findViewById(R.id.amortizationBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getAmortizationOfIntangibles();
        text.setText(test);

        text = (TextView) findViewById(R.id.amortizationAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getAmortizationOfIntangibles();
        text.setText(test);

        //Operating Income
        text = (TextView) findViewById(R.id.operatingIncomeBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getOperatingIncome();
        text.setText(test);

        text = (TextView) findViewById(R.id.operatingIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getOperatingIncome();
        text.setText(test);


        //Interest Income
        text = (TextView) findViewById(R.id.interestIncomeBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getInterestIncome();
        text.setText(test);

        text = (TextView) findViewById(R.id.interestIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getInterestIncome();
        text.setText(test);

        //Interest Expense
        text = (TextView) findViewById(R.id.interestExpenseBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getInterestExpense();
        text.setText(test);

        text = (TextView) findViewById(R.id.interestExpenseAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getInterestExpense();
        text.setText(test);

        //Gain on sale of PPE
        text = (TextView) findViewById(R.id.gainOnSaleOfPPEBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getSaleOfPPE();
        text.setText(test);

        text = (TextView) findViewById(R.id.gainOnSaleOfPPEAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getSaleOfPPE();
        text.setText(test);

        //Gain on sale of ST
        text = (TextView) findViewById(R.id.gainOnSaleOfSTBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getSaleOfST();
        text.setText(test);

        text = (TextView) findViewById(R.id.gainOnSaleOfSTAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getSaleOfST();
        text.setText(test);

        //Goodwill Impairment
        text = (TextView) findViewById(R.id.goodwillImpairmentBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getGoodwillImpairment();
        text.setText(test);

        text = (TextView) findViewById(R.id.goodwillImpairmentAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getGoodwillImpairment();
        text.setText(test);

        //PPE writedown
        text = (TextView) findViewById(R.id.ppeWritedownBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getGoodwillImpairment();
        text.setText(test);

        text = (TextView) findViewById(R.id.ppeWritedownAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getGoodwillImpairment();
        text.setText(test);

        //PreTax Income
        text = (TextView) findViewById(R.id.preTaxIncomeBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getPreTaxIncome();
        text.setText(test);

        text = (TextView) findViewById(R.id.preTaxIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getPreTaxIncome();
        text.setText(test);

        //Income Tax Provision
        text = (TextView) findViewById(R.id.incomeTaxProvisionBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getIncomeTaxProvision();
        text.setText(test);

        text = (TextView) findViewById(R.id.incomeTaxProvisionAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getIncomeTaxProvision();
        text.setText(test);

        //Current Portion of Income Taxes
        text = (TextView) findViewById(R.id.currentPortionOfIncomeTaxesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getCurrentPortionOfIncomeTaxes();
        text.setText(test);

        text = (TextView) findViewById(R.id.currentPortionOfIncomeTaxesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getCurrentPortionOfIncomeTaxes();
        text.setText(test);

        //Deferred Portion of Income Taxes
        text = (TextView) findViewById(R.id.deferredPortionOfIncomeTaxesBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getDeferredPortionOfIncomeTaxes();
        text.setText(test);

        text = (TextView) findViewById(R.id.deferredPortionOfIncomeTaxesAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getDeferredPortionOfIncomeTaxes();
        text.setText(test);

        //Net Income
        text = (TextView) findViewById(R.id.netIncomeBefore);
        test = "" + companyControl.company.currentCompany.currentCompanyIS.getNetIncome();
        text.setText(test);

        text = (TextView) findViewById(R.id.netIncomeAfter);
        test = "" + companyControl.company.endCompany.currentCompanyIS.getNetIncome();
        text.setText(test);






    }
}
