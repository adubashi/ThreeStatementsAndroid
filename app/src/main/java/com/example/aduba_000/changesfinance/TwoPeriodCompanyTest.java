package com.example.aduba_000.changesfinance;

public class TwoPeriodCompanyTest {

	public static void main(String[] args) {
		TwoPeriodCompany testCompany = new TwoPeriodCompany(100, .4);
		//testCompany.printTable();
		
		//Change Income Statement Items
		//testCompany.changeRevenue(10);
		//testCompany.changeDepreciation(10);
		//testCompany.changeStockBasedCompensation(10);
		//testCompany.changeAmortizationOfIntangibles(10);
		//testCompany.changeInterestIncome(10);
		//testCompany.changeInterestExpense(-10);
		//testCompany.changeSaleOfPPE(10);
		//testCompany.changeSaleOfST(10);
		//testCompany.changeGoodwillImpairment(-10);
		//testCompany.changePPEwritedown(-10);
		//testCompany.changeDeferredIncomeTaxes(10);
		
		//Change Balance Items
		//testCompany.changeAccountsReceivable(10);
		//testCompany.changeAccountsPayable(10);
		//testCompany.changePrepaidExpenses(10);
		//testCompany.changeAccruedExpenses(10);
		//testCompany.changeDeferredRevenue(10);
		
		//Change Cash flow statement
		//testCompany.changePurchaseShortTermInvestments(10);
		//testCompany.changeSellShortTermInvestments(10);
		//testCompany.changePurchaseLongTermInvestments(10);
		//testCompany.changeSellLongTermInvestments(10);
		//testCompany.changeCapitalExpenditures(10);
		//testCompany.changePPEsaleProceeds(10);
		//testCompany.changeIssueLongTermDebt(10);
		//testCompany.changeRepayLongTermDebt(7);
		//testCompany.changeIssueShortTermDebt(10);
		//testCompany.changeRepayShortTermDebt(10);
		//testCompany.changeRepurchaseShares(10);
		//testCompany.changeIssueNewShares(10);
		
		//New Tests
		testCompany.changeIncreaseDividendsIssued(10);
		testCompany.changeIssueLongTermDebt(10);
		testCompany.changeRepayLongTermDebt(10);
		testCompany.changeIssueShortTermDebt(10);
		testCompany.changeRepayShortTermDebt(10);
		testCompany.changeRepurchaseShares(10);
		testCompany.changeIssueNewShares(10);
		
		testCompany.printTable();
		
		
	}

}
