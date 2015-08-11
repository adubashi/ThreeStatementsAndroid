package com.example.aduba_000.changesfinance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aduba_000.changesfinance.R;

public class BalanceStatementChanges extends Activity {

    EditText accountsReceivableIncreasesBy;
    EditText prepaidExpensesIncreasesBy;
    EditText inventoryIncreasesBy;
    EditText accruedExpensesIncreasesBy;
    EditText accountsPayableIncreasesBy;
    EditText deferredRevenueIncreasesBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_statement_changes);

        setTitle("Balance Sheet Changes");

        Button submit = (Button) findViewById(R.id.submitChanges);

        accountsReceivableIncreasesBy = (EditText) findViewById(R.id.accountsReceivableIncreasesByValue);
        prepaidExpensesIncreasesBy = (EditText) findViewById(R.id.prepaidExpensesIncreasesByValue);
        inventoryIncreasesBy  = (EditText) findViewById(R.id.inventoryIncreasesByValue);
        accruedExpensesIncreasesBy = (EditText) findViewById(R.id.accruedExpensesIncreasesByValue);
        accountsPayableIncreasesBy  = (EditText) findViewById(R.id.accountsPayableIncreasesByValue);
        deferredRevenueIncreasesBy  = (EditText) findViewById(R.id.deferredRevenueIncreasesByValue);



        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("CashFlowStateChanges", "Submit Button Pressed");
                // Log.v("Revenue Change", revenueChange.getText().toString());
                companyControl.resetIncomeAndCashFlow();
                setChanges();
                companyControl.getChanges();
                Log.d("End Cash on Balance Sheet", Integer.toString(companyControl.company.endCompany.currentCompanyBS.getCash()));



            }
        });

    }
    //Private getters

    private int getAccountsReceivableIncreasesBy() {

        int accountsReceivableIncreasesByVal = 0;
        try {
            accountsReceivableIncreasesByVal  = Integer.parseInt(accountsReceivableIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return accountsReceivableIncreasesByVal;
    }

    private int getPrepaidExpensesIncreasesBy() {
        int prepaidExpensesIncreasesByVal = 0;
        try {
            prepaidExpensesIncreasesByVal  = Integer.parseInt(prepaidExpensesIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return prepaidExpensesIncreasesByVal;

    }

    private int getInventoryIncreasesBy() {
        int inventoryIncreasesByVal = 0;
        try {
            inventoryIncreasesByVal  = Integer.parseInt(inventoryIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return inventoryIncreasesByVal;

    }

    private int getAccruedExpensesIncreasesBy() {
        int accruedExpensesIncreasesByVal = 0;
        try {
            accruedExpensesIncreasesByVal  = Integer.parseInt(accruedExpensesIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return accruedExpensesIncreasesByVal;

    }

    private int getAccountsPayableIncreasesBy() {
        int accountsPayableIncreasesByVal = 0;
        try {
            accountsPayableIncreasesByVal  = Integer.parseInt(accountsPayableIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return accountsPayableIncreasesByVal;

    }

    private int getDeferredRevenueIncreasesBy() {
        int deferredRevenueIncreasesByVal = 0;
        try {
            deferredRevenueIncreasesByVal  = Integer.parseInt(deferredRevenueIncreasesBy.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return deferredRevenueIncreasesByVal;

    }

    //End of Getters

    public void setChanges(){

        companyControl.company.changeAccountsReceivable(this.getAccountsReceivableIncreasesBy());
        companyControl.company.changePrepaidExpenses(this.getPrepaidExpensesIncreasesBy());
        companyControl.company.changeInventory(this.getInventoryIncreasesBy());
        companyControl.company.changeAccruedExpenses(this.getAccruedExpensesIncreasesBy());
        companyControl.company.changeAccountsPayable(this.getAccountsPayableIncreasesBy());
        companyControl.company.changeDeferredRevenue(this.getDeferredRevenueIncreasesBy());



        companyControl.company.calculateChanges();
        companyControl.company.update();
        companyControl.company.printTable();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.balance_statement_changes, menu);
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
}
