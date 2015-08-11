package com.example.aduba_000.changesfinance;

import com.example.aduba_000.changesfinance.Company;

public class testCompany {
	
	public static void main(String Args[]){
		Company testCompany = new Company(100, .4);
		//
		testCompany.currentCompanyIS.setRevenue(1300);
		testCompany.currentCompanyIS.setCogs(100);
		testCompany.currentCompanyIS.setOperatingExpenses(200);
		
		//Balance Sheet
		testCompany.currentCompanyBS.setShortTermInvestments(100);
		testCompany.currentCompanyBS.setAccountsReceivable(100);
		testCompany.currentCompanyBS.setPrepaidExpenses(100);
		testCompany.currentCompanyBS.setInventory(100);
		
		testCompany.currentCompanyBS.setPPE(1000);
		testCompany.currentCompanyBS.setIntangibleAssets(200);
		testCompany.currentCompanyBS.setLongTermInvestments(100);
		testCompany.currentCompanyBS.setGoodwill(100);
		
		testCompany.currentCompanyBS.setRevolver(100);
		testCompany.currentCompanyBS.setAccountsPayable(200);
		testCompany.currentCompanyBS.setAccruedExpenses(200);
		
		testCompany.currentCompanyBS.setDeferredRevenue(200);
		testCompany.currentCompanyBS.setDeferredTaxLiability(200);
		testCompany.currentCompanyBS.setLongTermDebt(100);
		
		testCompany.currentCompanyBS.setCommonStock(600);
		testCompany.currentCompanyBS.setTreasuryStock(-100);
		testCompany.currentCompanyBS.setRetainedEarnings(300);
		testCompany.currentCompanyBS.setOtherIncome(100);
		//////////////END OF BASE CASE /////////////////////////////////
		
		testCompany.currentCompanyIS.setDepreciation(10);
		testCompany.currentCompanyIS.setStockBasedCompensation(10);
		testCompany.currentCompanyIS.setAmortizationOfIntangibles(10);
		
		
		testCompany.currentCompanyIS.setInterestIncome(10);
		testCompany.currentCompanyIS.setInterestExpense(-10);
		testCompany.currentCompanyIS.setSaleOfPPE(10);
		testCompany.currentCompanyIS.setSaleOfST(10);
		testCompany.currentCompanyIS.setGoodwillImpairment(-10);
		testCompany.currentCompanyIS.setPPEwritedown(-10);
		
		testCompany.printTable();
		
	}

}
