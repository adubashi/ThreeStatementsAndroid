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

public class CashFlowStatementChange extends Activity {

    EditText purchaseShortTermInvestmentsChange;
    EditText sellShortTermInvestmentsChange;
    EditText purchaseLongTermInvestmentsChange;
    EditText sellLongTermInvestmentsChange;
    EditText capitalExpendituresChange;
    EditText ppeSalesProceedsChange;

    EditText dividendsIssuedChange;
    EditText issueLongTermDebtChange;
    EditText repayLongTermDebtChange;
    EditText issueShortTermDebtChange;
    EditText repayShortTermDebtChange;
    EditText repurchaseSharesChange;
    EditText issueNewSharesChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_flow_statement_change);

        setTitle("Cash Flow Statement Changes");
        Button submit = (Button) findViewById(R.id.submitChanges);

        //EditTexts declaration
        purchaseShortTermInvestmentsChange = (EditText) findViewById(R.id.purchaseShortTermInvestmentsIncreasesByValue);
        sellShortTermInvestmentsChange = (EditText) findViewById(R.id.sellShortTermInvestmentsIncreasesByValue);
        purchaseLongTermInvestmentsChange = (EditText) findViewById(R.id.purchaseLongTermInvestmentsIncreasesByValue);
        sellLongTermInvestmentsChange = (EditText) findViewById(R.id.sellLongTermInvestmentsIncreasesByValue);
        capitalExpendituresChange = (EditText) findViewById(R.id.capitalExpendituresIncreasesByValue);
        ppeSalesProceedsChange = (EditText) findViewById(R.id.ppeSaleProceedsIncreasesByValue);

        dividendsIssuedChange = (EditText) findViewById(R.id.dividendsIssuedIncreasesByValue);
        issueShortTermDebtChange = (EditText) findViewById(R.id.issuedShortTermDebtIncreasesByValue);
        repayShortTermDebtChange = (EditText) findViewById(R.id.repayShortTermDebtIncreasesByValue);
        issueLongTermDebtChange = (EditText) findViewById(R.id.issuedLongTermIncreasesByValue);
        repayLongTermDebtChange = (EditText) findViewById(R.id.repayLongTermDebtIncreasesByValue);
        repurchaseSharesChange = (EditText) findViewById(R.id.repurchaseSharesIncreasesByValue);
        issueNewSharesChange = (EditText) findViewById(R.id.issueNewSharesIncreasesByValue);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("CashFlowStateChanges", "Submit Button Pressed");
                // Log.v("Revenue Change", revenueChange.getText().toString());
                companyControl.resetIncomeAndBalanceSheetChanges();
                setChanges();
                companyControl.getChanges();
                Log.d("New End Cash", Integer.toString(companyControl.company.endCompany.currentCompanyCF.getEndCash()));



            }
        });
    }

    //Getters

    private int getPurchaseShortTermInvestmentsChange() {

        int purchaseShortTermInvestmentsChangeVal = 0;
        try {
            purchaseShortTermInvestmentsChangeVal  = Integer.parseInt(purchaseShortTermInvestmentsChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return purchaseShortTermInvestmentsChangeVal;
    }
    private int getSellShortTermInvestmentsChange() {

        int sellShortTermInvestmentsChangeVal = 0;
        try {
            sellShortTermInvestmentsChangeVal =  Integer.parseInt(sellShortTermInvestmentsChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            return 0;
        }
        return sellShortTermInvestmentsChangeVal;
    }

    private int getPurchaseLongTermInvestmentsChange() {

        int purchaseLongTermInvestmentsChangeVal = 0;
        try {
            purchaseLongTermInvestmentsChangeVal = Integer.parseInt(purchaseLongTermInvestmentsChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return purchaseLongTermInvestmentsChangeVal;
    }

    private int getSellLongTermInvestmentsChange() {

        int sellLongTermInvestmentsChangeVal = 0;
        try {
            sellLongTermInvestmentsChangeVal = Integer.parseInt(sellLongTermInvestmentsChange.getText().toString());
            String s = sellLongTermInvestmentsChange.getText().toString();
            System.out.println(s);
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return sellLongTermInvestmentsChangeVal;
    }

    private int getCapitalExpendituresChange() {

        int capitalExpendituresChangeVal = 0;
        try {
            capitalExpendituresChangeVal = Integer.parseInt(capitalExpendituresChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return capitalExpendituresChangeVal;
    }
    private int getPPEsalesProceedsChange() {

        int PPEsalesProceedsChangeVal = 0;
        try {
            PPEsalesProceedsChangeVal = Integer.parseInt(ppeSalesProceedsChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return PPEsalesProceedsChangeVal;
    }

    private int getDividendsIssuedChange() {

        int dividendsIssuedChangeVal = 0;
        try {
            dividendsIssuedChangeVal = Integer.parseInt(dividendsIssuedChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return dividendsIssuedChangeVal;
    }

    private int getIssueLongTermDebtChange() {

        int issueLongTermDebtChangeVal = 0;
        try {
            issueLongTermDebtChangeVal = Integer.parseInt(issueLongTermDebtChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement", Log.getStackTraceString(e));
            return 0;
        }
        return issueLongTermDebtChangeVal;
    }

    private int getRepayLongTermDebtChange() {

        int repayLongTermDebtChangeVal = 0;
        try {
            repayLongTermDebtChangeVal  = Integer.parseInt(repayLongTermDebtChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        System.out.println("Repay Long Term Debt" + repayLongTermDebtChangeVal);
        return repayLongTermDebtChangeVal ;
    }

    private int getIssueShortTermDebtChange() {

        int issueShortTermDebtChangeVal = 0;
        try {
            issueShortTermDebtChangeVal  = Integer.parseInt(issueShortTermDebtChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return issueShortTermDebtChangeVal ;
    }

    private int getRepayShortTermDebtChange() {

        int repayShortTermChangeVal = 0;
        try {
            repayShortTermChangeVal  = Integer.parseInt(repayShortTermDebtChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return repayShortTermChangeVal;
    }

    private int getRepurchaseSharesChange() {

        int repurchaseSharesChangeVal = 0;
        try {
            repurchaseSharesChangeVal  = Integer.parseInt(repurchaseSharesChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return repurchaseSharesChangeVal;
    }

    private int getIssueNewSharesChange() {

        int issueNewSharesChangeVal = 0;
        try {
            issueNewSharesChangeVal = Integer.parseInt(issueNewSharesChange.getText().toString());
        } catch (NumberFormatException e) {
            // this is not a number. tell the user something here or do something
            Log.e("Cash Flow Statement ", Log.getStackTraceString(e));
            return 0;
        }
        return issueNewSharesChangeVal;
    }

    public void setChanges(){

        companyControl.company.changePurchaseShortTermInvestments(this.getPurchaseShortTermInvestmentsChange());
        companyControl.company.changeSellShortTermInvestments(this.getSellShortTermInvestmentsChange());
        companyControl.company.changePurchaseLongTermInvestments(this.getPurchaseLongTermInvestmentsChange());
        companyControl.company.changeSellLongTermInvestments(this.getSellLongTermInvestmentsChange());
        companyControl.company.changePPEsaleProceeds(this.getPPEsalesProceedsChange());
        companyControl.company.changeCapitalExpenditures(this.getCapitalExpendituresChange());

        companyControl.company.changeIncreaseDividendsIssued(this.getDividendsIssuedChange());
        companyControl.company.changeIssueLongTermDebt(this.getIssueLongTermDebtChange());
        companyControl.company.changeRepayLongTermDebt(this.getRepayLongTermDebtChange());
        companyControl.company.changeIssueShortTermDebt(this.getIssueShortTermDebtChange());
        companyControl.company.changeRepayShortTermDebt(this.getRepayShortTermDebtChange());
        companyControl.company.changeRepurchaseShares(this.getRepurchaseSharesChange());
        companyControl.company.changeIssueNewShares(this.getIssueNewSharesChange());

        companyControl.company.calculateChanges();
        companyControl.company.update();
        //companyControl.company.printTable();

        companyControl.company.updateNetIncome2();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cash_flow_statement_change, menu);
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
