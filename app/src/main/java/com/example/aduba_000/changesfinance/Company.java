package com.example.aduba_000.changesfinance;
public class Company {
	
	
	public IncomeStatement currentCompanyIS;	
	public BalanceSheet  currentCompanyBS;
	public CashFlowStatement currentCompanyCF;

	
	public Company(int cash, double taxRate){
		currentCompanyIS = new IncomeStatement(taxRate,0,0,0);
		currentCompanyBS = new BalanceSheet(cash,0,0);
		currentCompanyCF = new CashFlowStatement(cash,0);
		currentCompanyIS.setTaxRate(taxRate);
		
	}
	
	
	

	
	public void printTable(){
		//update();
		//System.out.println(currentCompanyCF.getPPEsaleProceeds());
		currentCompanyIS.printTable();
		currentCompanyBS.printTable();
		currentCompanyCF.printTable();
	}
	
	public void update(){
		 //Update Cash Flow operations
		 updateCashFlowOperations();
		 //UpdateCashFlowOperations
		 updateNetIncome();
		 //Update Balance Sheet
		 updateBalanceSheet();
	}
	
	
	public void recalculate(){
		currentCompanyIS.update();
		currentCompanyBS.update();
		currentCompanyCF.update();
		
	}
	
	//Ordering
	//Income Statement
	//Cash Flow Statement
	//Balance Sheet
	
	//Set all the cash flow statement variables, then move on to the balance sheet 
	public void updateNetIncome(){
		currentCompanyCF.setNetIncome(currentCompanyIS.getNetIncome());
		recalculate();
		currentCompanyBS.setCash(currentCompanyCF.getEndCash());
		recalculate();
	}


	
	public void updateCashFlowOperations(){
		/*
		 * Depreciation:
		Stock-Based Compensation:
		Amortization of Intangibles:
		Deferred Income Taxes:
		(Gain) / Loss on Sale of PP&E:
		(Gain) / Loss on Sale of ST Investments:
		Goodwill Impairment:
		PP&E Write-Down:
		 */
		currentCompanyCF.setDepreciation(currentCompanyIS.getDepreciation());
		currentCompanyCF.setStockBasedCompensation(currentCompanyIS.getStockBasedCompensation());
		currentCompanyCF.setAmortizationOfIntangibles(currentCompanyIS.getAmortizationOfIntangibles());
		currentCompanyCF.setDeferredIncomeTaxes(currentCompanyIS.getDeferredPortionOfIncomeTaxes());
		currentCompanyCF.setGainOnSaleOfPPE(-currentCompanyIS.getSaleOfPPE());
		currentCompanyCF.setGainOnSaleOfST(currentCompanyIS.getSaleOfST());
		currentCompanyCF.setGoodwillImpairment(-currentCompanyIS.getGoodwillImpairment());
		currentCompanyCF.setGainOnSaleOfST(-currentCompanyIS.getSaleOfST());
		currentCompanyCF.setPPEwritedown(-currentCompanyIS.getPPEwritedown());
		
		
		currentCompanyCF.setPPEsaleProceeds(currentCompanyIS.getSaleOfPPE() + currentCompanyCF.getPPEsaleProceeds());
		currentCompanyCF.setSellShortTermInvestments(currentCompanyIS.getSaleOfST() + currentCompanyCF.getSellShortTermInvestments());
		recalculate();
	}
	
	public void updateBalanceSheet(){
		/*
		 *  Short-Term Investments:
			Accounts Receivable:
			Prepaid Expenses:
			Inventory:
		 */
		//Assets 
		currentCompanyBS.setShortTermInvestments(currentCompanyBS.getShortTermInvestments() - currentCompanyCF.getGainOnSaleOfST()+ 
												 - currentCompanyCF.getSellShortTermInvestments() - currentCompanyCF.getPurchaseShortTermInvestments());
		currentCompanyBS.setAccountsReceivable(currentCompanyBS.getAccountsReceivable() + currentCompanyCF.getChangesInaccountsReceivable());
		currentCompanyBS.setPrepaidExpenses(currentCompanyBS.getPrepaidExpenses() - currentCompanyCF.getChangesInprepaidExpenses());
		
		
		currentCompanyBS.setPPE(currentCompanyBS.getPPE() - currentCompanyCF.getDepreciation() - currentCompanyCF.getGainOnSaleOfPPE() -
				                currentCompanyCF.getPPEwritedown() - currentCompanyCF.getCapitalExpenditures() - currentCompanyCF.getPPEsaleProceeds());
		
		currentCompanyBS.setIntangibleAssets(currentCompanyBS.getIntangibleAssets() - currentCompanyCF.getAmortizationOfIntangibles());
		
		currentCompanyBS.setLongTermInvestments(currentCompanyBS.getLongTermInvestments()- currentCompanyCF.getPurchaseLongTermInvestments() - currentCompanyCF.getSellLongTermInvestments());
		
		currentCompanyBS.setGoodwill(currentCompanyBS.getGoodwill() - currentCompanyCF.getGoodwillImpairment());
		recalculate();
		
		//Liabilities
		
		currentCompanyBS.setRevolver(currentCompanyBS.getRevolver() + currentCompanyCF.getIssueShortTermDebt()+ currentCompanyCF.getRepayShortTermDebt());
		currentCompanyBS.setAccountsPayable(currentCompanyBS.getAccountsPayable() + currentCompanyCF.getChangesInaccountsPayable() );
		currentCompanyBS.setAccruedExpenses(currentCompanyBS.getAccruedExpenses() + currentCompanyCF.getChangesInaccruedExpenses() );
		
		currentCompanyBS.setDeferredRevenue(currentCompanyBS.getDeferredRevenue() + currentCompanyCF.getChangesIndeferredRevenue());
		currentCompanyBS.setDeferredTaxLiability(currentCompanyBS.getDeferredTaxLiability() + currentCompanyCF.getDeferredIncomeTaxes() );
		currentCompanyBS.setLongTermDebt(currentCompanyBS.getLongTermDebt() + currentCompanyCF.getIssueLongTermDebt() + currentCompanyCF.getRepayLongTermDebt() );
		
		//Shareholders Equity
		currentCompanyBS.setCommonStock(currentCompanyBS.getCommonStock() + currentCompanyCF.getIssueNewShares() + currentCompanyCF.getStockBasedCompensation() );
		currentCompanyBS.setTreasuryStock(currentCompanyBS.getTreasuryStock() + currentCompanyCF.getRepurchaseShares());
        currentCompanyBS.setOtherIncome(currentCompanyBS.getOtherIncome());



		currentCompanyBS.setRetainedEarnings(0);
        balance();
        recalculate();

	}

    public void balance(){
        int j = currentCompanyBS.getTotalAssets();
        int k = currentCompanyBS.getTotalLiabilities();
        int l = j - k;
        recalculate();
        currentCompanyBS.setRetainedEarnings(l - currentCompanyBS.getCommonStock() - currentCompanyBS.getTreasuryStock() - currentCompanyBS.getOtherIncome());
    }
	
	
	

}
