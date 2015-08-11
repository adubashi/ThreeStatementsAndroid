package com.example.aduba_000.changesfinance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;



public class IncomeStatementChanges extends Activity {

    //All edit texts
    EditText revenueChange;
    EditText operatingExpensesChange;
    EditText depreciationChange;
    EditText stockBasedCompensationChange;
    EditText amortizationChange;
    EditText interestIncomeChange;
    EditText interestExpenseChange;
    EditText gainOnSaleOfPPEChange;
    EditText gainOnSaleOfSTChange;
    EditText goodwillImpairmentChange;
    EditText ppeWritedownChange;
    EditText deferredIncomeTaxes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_statement_changes);
        setTitle("Income Statement Changes");

        Button submit = (Button) findViewById(R.id.submitChanges);

        //EditTexts declaration
        revenueChange = (EditText) findViewById(R.id.revenueIncreasesByValue);
        operatingExpensesChange = (EditText) findViewById(R.id.operatingExpensesIncreasesByValue);
        depreciationChange = (EditText) findViewById(R.id.depreciationIncreasesByValue);
        stockBasedCompensationChange = (EditText) findViewById(R.id.sbcIncreasesByValue);
        amortizationChange = (EditText) findViewById(R.id.amortizationOfIntangiblesIncreasesByValue);
        interestIncomeChange = (EditText) findViewById(R.id.interestIncomeIncreasesByValue);
        interestExpenseChange = (EditText) findViewById(R.id.interestExpenseIncreasesByValue);
        gainOnSaleOfPPEChange = (EditText) findViewById(R.id.gainOnSaleOfPPEValue);
        gainOnSaleOfSTChange = (EditText) findViewById(R.id.gainOnSaleOfSTValue);
        goodwillImpairmentChange = (EditText) findViewById(R.id.goodwillImpairmentValue);
        ppeWritedownChange = (EditText) findViewById(R.id.ppeWritedownIncreasesByValue);
        deferredIncomeTaxes = (EditText) findViewById(R.id.deferredIncomeTaxesIncreasesByValue);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("IncomeStateChanges", "Submit Button Pressed");
                // Log.v("Revenue Change", revenueChange.getText().toString());
                companyControl.resetBalanceSheetAndCashFlow();
                setChanges();
                //companyControl.getChanges();
                Log.d("New Revenue", Integer.toString(companyControl.company.endCompany.currentCompanyIS.getRevenue()));



            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.income_statement_changes, menu);
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

    //Getters

    private int getRevenueChange() {

        int revenueChangeVal = 0;
        try {
            revenueChangeVal = Integer.parseInt(revenueChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return revenueChangeVal;
    }
    private int getOperatingExpensesChange() {

        int operatingExpensesChangeVal = 0;
        try {
            operatingExpensesChangeVal =  Integer.parseInt(operatingExpensesChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return operatingExpensesChangeVal;
    }

    private int getDepreciationChange() {

        int depreciationChangeVal = 0;
        try {
            depreciationChangeVal = Integer.parseInt(depreciationChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return depreciationChangeVal;
    }

    private int getStockBasedCompensationChange() {

        int sbaChangeVal = 0;
        try {
            sbaChangeVal = Integer.parseInt(stockBasedCompensationChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return sbaChangeVal;
    }

    private int getAmortizationChange() {

        int amortizationChangeVal = 0;
        try {
            amortizationChangeVal = Integer.parseInt(amortizationChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return amortizationChangeVal;
    }

    private int getInterestIncomeChange() {

        int interestIncomeChangeVal = 0;
        try {
            interestIncomeChangeVal = Integer.parseInt(interestIncomeChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return interestIncomeChangeVal;
    }
    private int getInterestExpenseChange() {

        int interestExpenseChangeVal = 0;
        try {
            interestExpenseChangeVal = Integer.parseInt(interestExpenseChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return interestExpenseChangeVal;
    }

    private int getGainOnSaleOfPPEChange() {

        int gainOnSaleOfPPEChangeVal = 0;
        try {
            gainOnSaleOfPPEChangeVal = Integer.parseInt(gainOnSaleOfPPEChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return gainOnSaleOfPPEChangeVal;
    }

    private int getGainOnSaleOfSTChange() {

        int gainOnSaleOfSTChangeVal = 0;
        try {
            gainOnSaleOfSTChangeVal = Integer.parseInt(gainOnSaleOfSTChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return gainOnSaleOfSTChangeVal;
    }

    private int getGoodwillImpairmentChange() {

        int goodwillImpairmentChangeVal = 0;
        try {
            goodwillImpairmentChangeVal  = Integer.parseInt(goodwillImpairmentChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return goodwillImpairmentChangeVal ;
    }

    private int getPPEwritedownChange() {

        int ppeWritedownChangeVal = 0;
        try {
            ppeWritedownChangeVal  = Integer.parseInt(ppeWritedownChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return ppeWritedownChangeVal ;
    }

    private int getDeferredIncomeTaxesChange() {

        int deferredIncomeTaxesChangeVal = 0;
        try {
            deferredIncomeTaxesChangeVal  = Integer.parseInt(deferredIncomeTaxes.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Income Statement ", Log.getStackTraceString(e));
        }
        return deferredIncomeTaxesChangeVal;
    }

    public void setChanges(){
        //Set Income Statement Changes
        companyControl.company.changeRevenue(this.getRevenueChange());
        companyControl.company.changeOperatingExpenses(this.getOperatingExpensesChange());
        companyControl.company.changeDepreciation(this.getDepreciationChange());
        companyControl.company.changeAmortizationOfIntangibles(this.getAmortizationChange());
        companyControl.company.changeStockBasedCompensation(this.getStockBasedCompensationChange());
        companyControl.company.changeInterestIncome(this.getInterestIncomeChange());
        companyControl.company.changeInterestExpense(this.getInterestExpenseChange());
        companyControl.company.changeSaleOfPPE(this.getGainOnSaleOfPPEChange());
        companyControl.company.changeSaleOfST(this.getGainOnSaleOfSTChange());
        companyControl.company.changeGoodwillImpairment(this.getGoodwillImpairmentChange());
        companyControl.company.changePPEwritedown(this.getPPEwritedownChange());
        companyControl.company.changeDeferredIncomeTaxes(this.getDeferredIncomeTaxesChange());

        //companyControl.company.calculateChanges();
        companyControl.company.update();
    }






















}


