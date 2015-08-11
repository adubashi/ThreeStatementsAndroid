package com.example.aduba_000.changesfinance;
public class TwoPeriodCompany {
	
	public Company currentCompany;
	public Company endCompany;
	public int changeInCash;
	public int changeInShareholdersEquity;
	public int changeInNetIncome;
	public int changeInAssets;
	public int changeInLiabilitiesSide;
	public boolean balanced;
	
	
	public TwoPeriodCompany(int cash, double taxRate){
		
		currentCompany = new Company(cash, taxRate);
		endCompany = new Company(cash, taxRate);
		initialize();
		
	}
	
	public void initialize(){
				//Company One 
				//Income Statement
				currentCompany.currentCompanyIS.setRevenue(1300);
				currentCompany.currentCompanyIS.setCogs(100);
				currentCompany.currentCompanyIS.setOperatingExpenses(200);
				
				//Balance Sheet
				currentCompany.currentCompanyBS.setShortTermInvestments(100);
				currentCompany.currentCompanyBS.setAccountsReceivable(100);
				currentCompany.currentCompanyBS.setPrepaidExpenses(100);
				currentCompany.currentCompanyBS.setInventory(100);
				
				currentCompany.currentCompanyBS.setPPE(1000);
				currentCompany.currentCompanyBS.setIntangibleAssets(200);
				currentCompany.currentCompanyBS.setLongTermInvestments(100);
				currentCompany.currentCompanyBS.setGoodwill(100);
				
				currentCompany.currentCompanyBS.setRevolver(100);
				currentCompany.currentCompanyBS.setAccountsPayable(200);
				currentCompany.currentCompanyBS.setAccruedExpenses(200);
				
				currentCompany.currentCompanyBS.setDeferredRevenue(200);
				currentCompany.currentCompanyBS.setDeferredTaxLiability(200);
				currentCompany.currentCompanyBS.setLongTermDebt(100);
				
				currentCompany.currentCompanyBS.setCommonStock(600);
				currentCompany.currentCompanyBS.setTreasuryStock(-100);
				currentCompany.currentCompanyBS.setRetainedEarnings(300);
				currentCompany.currentCompanyBS.setOtherIncome(100);
				
				//Company Two 
				//Income Statement
				endCompany.currentCompanyIS.setRevenue(1300);
				endCompany.currentCompanyIS.setCogs(100);
				endCompany.currentCompanyIS.setOperatingExpenses(200);
				
				//Balance Sheet
				endCompany.currentCompanyBS.setShortTermInvestments(100);
				endCompany.currentCompanyBS.setAccountsReceivable(100);
				endCompany.currentCompanyBS.setPrepaidExpenses(100);
				endCompany.currentCompanyBS.setInventory(100);
				
				endCompany.currentCompanyBS.setPPE(1000);
				endCompany.currentCompanyBS.setIntangibleAssets(200);
				endCompany.currentCompanyBS.setLongTermInvestments(100);
				endCompany.currentCompanyBS.setGoodwill(100);
				
				endCompany.currentCompanyBS.setRevolver(100);
				endCompany.currentCompanyBS.setAccountsPayable(200);
				endCompany.currentCompanyBS.setAccruedExpenses(200);
				
				endCompany.currentCompanyBS.setDeferredRevenue(200);
				endCompany.currentCompanyBS.setDeferredTaxLiability(200);
				endCompany.currentCompanyBS.setLongTermDebt(100);
				
				endCompany.currentCompanyBS.setCommonStock(600);
				endCompany.currentCompanyBS.setTreasuryStock(-100);
				endCompany.currentCompanyBS.setRetainedEarnings(300);
				endCompany.currentCompanyBS.setOtherIncome(100);
		
	}
	
	public void printTable(){
        /*
		System.out.println("CURRENT COMPANY");
		currentCompany.printTable();
		System.out.println("END COMPANY");
		endCompany.printTable();
		calculateChanges();
		printChanges();
		*/
		
	}
	
	public void calculateChanges() {
		/*
		public int changeInCash;
		public int changeInShareholdersEquity;
		public int changeInNetIncome;
		public int changeInAssets;
		public int changeInLiabilitiesSide;
		public boolean balanced;
		*/
		this.changeInCash = endCompany.currentCompanyCF.getEndCash() - currentCompany.currentCompanyCF.getEndCash();
		this.changeInShareholdersEquity = endCompany.currentCompanyBS.getShareholdersEquity()  - currentCompany.currentCompanyBS.getShareholdersEquity();
		this.changeInNetIncome = endCompany.currentCompanyIS.getNetIncome() - currentCompany.currentCompanyIS.getNetIncome();
		this.changeInAssets = endCompany.currentCompanyBS.getTotalAssets() - currentCompany.currentCompanyBS.getTotalAssets();
		this.changeInLiabilitiesSide = endCompany.currentCompanyBS.getTotalLiabilitiesAndEquity() - currentCompany.currentCompanyBS.getTotalLiabilitiesAndEquity();
		
	}
	
	public void printChanges(){
		System.out.println("Changes in Statements: ");
		System.out.format("%32s%10d", "Change In Cash ", this.changeInCash);
		System.out.println();
		System.out.format("%32s%10d", "Change In Shareholder's Equity", this.changeInShareholdersEquity);
		System.out.println();
		System.out.format("%32s%10d", "Change In Net Income", this.changeInNetIncome);
		System.out.println();
		System.out.format("%32s%10d", "Change In Assets", this.changeInAssets);
		System.out.println();
		System.out.format("%32s%10d", "Change In Liabilities", this.changeInLiabilitiesSide);
		
	}

	//////////////////Changes in Income Statement/////////////////////////

    ///Changes in Income statement working on////////////////////
	public void changeRevenue(int increment){
		endCompany.currentCompanyIS.setRevenue(currentCompany.currentCompanyIS.getRevenue() + increment);
	}
	
	public void changeOperatingExpenses(int increment){
		endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
	}
	
	public void changeDepreciation(int increment){
		endCompany.currentCompanyIS.setDepreciation(endCompany.currentCompanyIS.getDepreciation() + increment);
	}
	
	public void changeStockBasedCompensation(int increment){
		endCompany.currentCompanyIS.setStockBasedCompensation(endCompany.currentCompanyIS.getStockBasedCompensation() + increment);
	}
	
	public void changeAmortizationOfIntangibles(int increment){
		endCompany.currentCompanyIS.setAmortizationOfIntangibles(endCompany.currentCompanyIS.getAmortizationOfIntangibles() + increment);
	}
	public void changeInterestIncome(int increment){
		endCompany.currentCompanyIS.setInterestIncome(endCompany.currentCompanyIS.getInterestIncome() + increment);
	}
	public void changeInterestExpense(int increment){
		endCompany.currentCompanyIS.setInterestExpense(endCompany.currentCompanyIS.getInterestExpense() + increment);
	}
	
	public void changeSaleOfPPE(int increment){
		endCompany.currentCompanyIS.setSaleOfPPE(endCompany.currentCompanyIS.getSaleOfPPE() + increment);
	}
	public void changeSaleOfST(int increment){
		endCompany.currentCompanyIS.setSaleOfST(endCompany.currentCompanyIS.getSaleOfST() + increment);
	}
	
	public void changeGoodwillImpairment(int increment){
		endCompany.currentCompanyIS.setGoodwillImpairment(endCompany.currentCompanyIS.getGoodwillImpairment() + increment);
	}
	
	public void changePPEwritedown(int increment){
		endCompany.currentCompanyIS.setPPEwritedown(endCompany.currentCompanyIS.getPPEwritedown() + increment);
	}
	
	public void changeDeferredIncomeTaxes(int increment){
		endCompany.currentCompanyIS.setDeferredPortionOfIncomeTaxes(endCompany.currentCompanyIS.getDeferredPortionOfIncomeTaxes() + increment);
	}

	//Balance Sheet Items
	public void changeAccountsReceivable(int increment){
		endCompany.currentCompanyBS.setAccountsReceivable(endCompany.currentCompanyBS.getAccountsReceivable() + increment);
        endCompany.currentCompanyBS.update();


        endCompany.currentCompanyIS.setRevenue(endCompany.currentCompanyIS.getRevenue() + increment);
        endCompany.currentCompanyIS.update();


        endCompany.currentCompanyCF.setNetIncome(endCompany.currentCompanyIS.getNetIncome());
        endCompany.currentCompanyCF.setChangesInaccountsReceivable(-increment);

        endCompany.currentCompanyCF.update();
        endCompany.currentCompanyBS.setCash(endCompany.currentCompanyCF.getEndCash());


	}


	public void changeAccountsPayable(int increment){
        endCompany.currentCompanyBS.setAccountsPayable(endCompany.currentCompanyBS.getAccruedExpenses() + increment);
        endCompany.currentCompanyBS.update();


        endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
        endCompany.currentCompanyIS.update();


        endCompany.currentCompanyCF.setNetIncome(endCompany.currentCompanyIS.getNetIncome());
        endCompany.currentCompanyCF.setChangesInaccruedExpenses(increment);

        endCompany.currentCompanyCF.update();
        endCompany.currentCompanyBS.setCash(endCompany.currentCompanyCF.getEndCash());
	}
	
	
	public void changePrepaidExpenses(int increment){
		endCompany.currentCompanyCF.setChangesInprepaidExpenses(-increment);
        endCompany.currentCompanyCF.update();
        endCompany.currentCompanyBS.setPrepaidExpenses(endCompany.currentCompanyBS.getPrepaidExpenses() + increment);
        endCompany.currentCompanyBS.setCash(endCompany.currentCompanyCF.getEndCash());
	}
	
	public void changeInventory(int increment){
        endCompany.currentCompanyCF.setChangesIninventory(-increment);
        endCompany.currentCompanyCF.update();
        endCompany.currentCompanyBS.setInventory(endCompany.currentCompanyBS.getInventory() + increment);
        endCompany.currentCompanyBS.setCash(endCompany.currentCompanyCF.getEndCash());
	}
	
	public void changeAccruedExpenses(int increment){
        endCompany.currentCompanyBS.setAccruedExpenses(endCompany.currentCompanyBS.getAccruedExpenses() + increment);
        endCompany.currentCompanyBS.update();


        endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
        endCompany.currentCompanyIS.update();


        endCompany.currentCompanyCF.setNetIncome(endCompany.currentCompanyIS.getNetIncome());
        endCompany.currentCompanyCF.setChangesInaccruedExpenses(increment);

        endCompany.currentCompanyCF.update();
        endCompany.currentCompanyBS.setCash(endCompany.currentCompanyCF.getEndCash());
	}
	
	public void changeDeferredRevenue(int increment){
		endCompany.currentCompanyCF.setChangesIndeferredRevenue(increment);
	}


	///Cash flow statement items
	
	public void changePurchaseShortTermInvestments(int increment){
		endCompany.currentCompanyCF.setPurchaseShortTermInvestments(-increment);
	}
	
	public void changeSellShortTermInvestments(int increment){
		endCompany.currentCompanyCF.setSellShortTermInvestments(increment);
		
	}
	
	public void changePurchaseLongTermInvestments(int increment){
		endCompany.currentCompanyCF.setPurchaseLongTermInvestments(increment);
	}
	
	public void changeSellLongTermInvestments(int increment){
		endCompany.currentCompanyCF.setSellLongTermInvestments(increment);
	}
	
	public void changeCapitalExpenditures(int increment){
		endCompany.currentCompanyCF.setCapitalExpenditures(-increment);
	}
	
	public void changePPEsaleProceeds(int increment){
		endCompany.currentCompanyCF.setPPEsaleProceeds(increment);
		//System.out.println(endCompany.currentCompanyCF.getPPEsaleProceeds());
	}
	
	public void changeIncreaseDividendsIssued(int increment){
		endCompany.currentCompanyCF.setDividendsIssued(-1 * increment);
	}
	
	public void changeIssueLongTermDebt(int increment){
		endCompany.currentCompanyCF.setIssueLongTermDebt(increment);
	}
	
	public void changeRepayLongTermDebt(int increment){
		endCompany.currentCompanyCF.setRepayLongTermDebt(-1 * increment);
		endCompany.currentCompanyBS.setLongTermDebt(endCompany.currentCompanyBS.getLongTermDebt());
	}
	
	public void changeIssueShortTermDebt(int increment){
		endCompany.currentCompanyCF.setIssueShortTermDebt(increment);
	}
	public void changeRepayShortTermDebt(int increment){
		endCompany.currentCompanyCF.setRepayShortTermDebt(-1 * increment);

	}
	
	public void changeRepurchaseShares(int increment){
		endCompany.currentCompanyCF.setRepurchaseShares(-1 * increment);

	}
	
	public void changeIssueNewShares(int increment){
		endCompany.currentCompanyCF.setIssueNewShares(increment);
	}
	////End of changes

    public void update(){
        currentCompany.update();
        endCompany.update();
    }

    public void updateNetIncome(){
        currentCompany.updateNetIncome();
        endCompany.updateNetIncome();
    }

    //Special Net Income Change
    public void updateNetIncome2(){
        currentCompany.currentCompanyCF.setNetIncome(currentCompany.currentCompanyIS.getNetIncome());
        currentCompany.recalculate();
        endCompany.recalculate();
        endCompany.currentCompanyBS.setCash( endCompany.currentCompanyCF.getEndCash());
        currentCompany.recalculate();
        endCompany.recalculate();
    }


}
