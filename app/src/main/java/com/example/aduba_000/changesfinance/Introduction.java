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


public class Introduction extends Activity {

    public static int i = 0;

    EditText cashEntry;
    EditText taxRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Introduction");
        Log.d("MyApp", "End of Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Button submit = (Button) findViewById(R.id.submitChanges);

        cashEntry = (EditText) findViewById(R.id.cashBalance);
        taxRate = (EditText) findViewById(R.id.taxRate);


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double tax = getTaxRate();
                int cash = getCashBalance();
                companyControl.reset(cash, tax);

            }
        });
    }

    private double getTaxRate() {

        double taxRateVal = 0;
        try {
            taxRateVal  = Double.parseDouble(taxRate.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return taxRateVal;
    }

    private int getCashBalance() {

        int cashBalanceVal = 0;
        try {
            cashBalanceVal = Integer.parseInt(cashEntry.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return cashBalanceVal;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.introduction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
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
