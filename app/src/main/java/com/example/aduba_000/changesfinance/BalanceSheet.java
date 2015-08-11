package com.example.aduba_000.changesfinance;

public class BalanceSheet {
	private int cash;
	private int shortTermInvestments;
	private int accountsReceivable;
	private int prepaidExpenses;
	private int inventory;
	
	//Calculate
	private int totalCurrentAssets;
	
	private int PPE;
	private int intangibleAssets;
	private int longTermInvestments;
	private int goodwill;
	
	//Calculate
	private int totalLongTermAssets;
	
	//Calculate
	private int totalAssets;
	
	private int revolver;
	private int accountsPayable;
	private int accruedExpenses;
	
	//Calculate
	private int totalCurrentLiabilities;
	
	private int deferredRevenue;
	private int deferredTaxLiability;
	private int longTermDebt;
	
	//Calculate
	private int totalLongTermLiabilities;
	
	
	//Calculate
	private int totalLiabilities;
	
	private int commonStock;
	private int treasuryStock;
	private int retainedEarnings;
	private int otherIncome;
	
	//Calculate
	private int shareholdersEquity;
	
	//Calculate
	private int totalLiabilitiesAndEquity;
	
	//Calculate
	private boolean balanced;
	
	
	public BalanceSheet(int cash, int longTermDebt, int commonStock){
		this.cash = cash;
		this.longTermDebt = longTermDebt;
		this.commonStock = commonStock;
		
	}
	
	
	//Calculating////////////////////////////////////////
	public void calculateTotalCurrentAssets(){
		this.totalCurrentAssets = cash + shortTermInvestments +
		accountsReceivable +
		prepaidExpenses +
		inventory;
	}
	
	public void calculateTotalLongTermAssets(){
		this.totalLongTermAssets = PPE + intangibleAssets + longTermInvestments + goodwill;
	}
	
	public void calculateTotalAssets(){
		this.totalAssets = this.totalCurrentAssets + this.totalLongTermAssets;
	}
	
	public void calculateTotalCurrentLiabilities(){
		this.totalCurrentLiabilities = revolver + accountsPayable + accruedExpenses;
	}
	
	public void calculateTotalLongTermLiabilities(){
		
		this.totalLongTermLiabilities = deferredRevenue + deferredTaxLiability + longTermDebt;
	}
	
	public void calculateTotalLiabilities(){
		this.totalLiabilities = totalCurrentLiabilities + totalLongTermLiabilities;
	}
	
	public void calculateShareholdersEquity(){
		this.shareholdersEquity = commonStock + treasuryStock + retainedEarnings + otherIncome;
	}
	
	public void calculateTotalLiabilitiesAndEquity(){
		this.totalLiabilitiesAndEquity = shareholdersEquity + totalLiabilities;
	}
	//////////////////////////////////////////////////////////////////
	
	//balanced
	public boolean balanced(){
		balanced =  this.totalLiabilitiesAndEquity == this.totalAssets;
		return balanced;
	}
	
	
	public void update(){
		calculateTotalCurrentAssets();
		calculateTotalLongTermAssets();
		calculateTotalAssets();
		calculateTotalCurrentLiabilities();
		calculateTotalLongTermLiabilities();
		calculateTotalLiabilities();
		calculateShareholdersEquity();
		calculateTotalLiabilitiesAndEquity();
		//balanced();
		
	}
	
	
	////////////////////////////////SETTERS AND GETTERS/////////////////////////////////////////
	
	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}


	public int getShortTermInvestments() {
		return shortTermInvestments;
	}


	public void setShortTermInvestments(int shortTermInvestments) {
		this.shortTermInvestments = shortTermInvestments;
	}


	public int getAccountsReceivable() {
		return accountsReceivable;
	}


	public void setAccountsReceivable(int accountsReceivable) {
		this.accountsReceivable = accountsReceivable;
	}


	public int getPrepaidExpenses() {
		return prepaidExpenses;
	}


	public void setPrepaidExpenses(int prepaidExpenses) {
		this.prepaidExpenses = prepaidExpenses;
	}


	public int getInventory() {
		return inventory;
	}


	public void setInventory(int inventory) {
		this.inventory = inventory;
	}


	public int getTotalCurrentAssets() {
		return totalCurrentAssets;
	}


	public void setTotalCurrentAssets(int totalCurrentAssets) {
		this.totalCurrentAssets = totalCurrentAssets;
	}


	public int getPPE() {
		return PPE;
	}


	public void setPPE(int pPE) {
		System.out.println("Setting PPE: ");
        System.out.println(pPE);
        PPE = pPE;
	}


	public int getIntangibleAssets() {
		return intangibleAssets;
	}


	public void setIntangibleAssets(int intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}


	public int getLongTermInvestments() {
		return longTermInvestments;
	}


	public void setLongTermInvestments(int longTermInvestments) {
		this.longTermInvestments = longTermInvestments;
	}


	public int getGoodwill() {
		return goodwill;
	}


	public void setGoodwill(int goodwill) {
		this.goodwill = goodwill;
	}


	public int getTotalLongTermAssets() {
		return totalLongTermAssets;
	}


	public void setTotalLongTermAssets(int totalLongTermAssets) {
		this.totalLongTermAssets = totalLongTermAssets;
	}


	public int getTotalAssets() {
		return totalAssets;
	}


	public void setTotalAssets(int totalAssets) {
		this.totalAssets = totalAssets;
	}


	public int getRevolver() {
		return revolver;
	}


	public void setRevolver(int revolver) {
		this.revolver = revolver;
	}


	public int getAccountsPayable() {
		return accountsPayable;
	}


	public void setAccountsPayable(int accountsPayable) {
		this.accountsPayable = accountsPayable;
	}


	public int getAccruedExpenses() {
		return accruedExpenses;
	}


	public void setAccruedExpenses(int accruedExpenses) {
		this.accruedExpenses = accruedExpenses;
	}


	public int getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}


	public void setTotalCurrentLiabilities(int totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}


	public int getDeferredRevenue() {
		return deferredRevenue;
	}


	public void setDeferredRevenue(int deferredRevenue) {
		this.deferredRevenue = deferredRevenue;
	}


	public int getDeferredTaxLiability() {
		return deferredTaxLiability;
	}


	public void setDeferredTaxLiability(int deferredTaxLiability) {
		this.deferredTaxLiability = deferredTaxLiability;
	}


	public int getLongTermDebt() {
		return longTermDebt;
	}


	public void setLongTermDebt(int longTermDebt) {
		this.longTermDebt = longTermDebt;
	}


	public int getTotalLongTermLiabilities() {
		return totalLongTermLiabilities;
	}


	public void setTotalLongTermLiabilities(int totalLongTermLiabilities) {
		this.totalLongTermLiabilities = totalLongTermLiabilities;
	}


	public int getTotalLiabilities() {
		return totalLiabilities;
	}


	public void setTotalLiabilities(int totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}


	public int getCommonStock() {
		return commonStock;
	}


	public void setCommonStock(int commonStock) {
		this.commonStock = commonStock;
	}


	public int getTreasuryStock() {
		return treasuryStock;
	}


	public void setTreasuryStock(int treasuryStock) {
		this.treasuryStock = treasuryStock;
	}


	public int getRetainedEarnings() {
		return retainedEarnings;
	}


	public void setRetainedEarnings(int retainedEarnings) {
		this.retainedEarnings = retainedEarnings;
	}


	public int getOtherIncome() {
		return otherIncome;
	}


	public void setOtherIncome(int otherIncome) {
		this.otherIncome = otherIncome;
	}


	public int getShareholdersEquity() {
		return shareholdersEquity;
	}


	public void setShareholdersEquity(int shareholdersEquity) {
		this.shareholdersEquity = shareholdersEquity;
	}


	public int getTotalLiabilitiesAndEquity() {
		return totalLiabilitiesAndEquity;
	}


	public void setTotalLiabilitiesAndEquity(int totalLiabilitiesAndEquity) {
		this.totalLiabilitiesAndEquity = totalLiabilitiesAndEquity;
	}


	public boolean isBalanced() {
		return balanced;
	}


	public void setBalanced(boolean balanced) {
		this.balanced = balanced;
	}

	/////////////////////////END OF SETTERS AND GETTERS//////////////////////////////////
	@Override
	public String toString(){
		return "Assets: " + this.totalAssets + "Liabilities: " 
	    + this.totalLiabilities + "Shareholder's Equity:" + this.shareholdersEquity + "Balanced: " + this.balanced;
	}
	
	public void printTable(){
		//update();
		System.out.println("----------------------------------------------------");
		System.out.format("%32s", "BALANCE SHEET");
		System.out.println();
		System.out.format("%32s", "CURRENT ASSETS");
		System.out.println();
		System.out.format("%32s%10d", "Cash", this.cash);
		System.out.println();
		System.out.format("%32s%10d", "Short Term Investments", this.shortTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Accounts Receivable", this.accountsReceivable);
		System.out.println();
		System.out.format("%32s%10d", "Prepaid Expenses", this.prepaidExpenses);
		System.out.println();
		System.out.format("%32s%10d", "Inventory", this.inventory);
		System.out.println();
		System.out.format("%32s%10d", "Total Current Assets", this.totalCurrentAssets);
		System.out.println();
		System.out.format("%32s", "LONG TERM ASSETS");
		System.out.println();
		System.out.format("%32s%10d", "PPE", this.PPE);
		System.out.println();
		System.out.format("%32s%10d", "Other Intangible Assets", this.intangibleAssets);
		System.out.println();
		System.out.format("%32s%10d", "Long term investments", this.longTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Goodwill", this.goodwill);
		System.out.println();
		System.out.format("%32s%10d", "Total Long-Term Assets", this.totalLongTermAssets);
		System.out.println();
		System.out.format("%32s%10d", "Total Assets", this.totalAssets);
		System.out.println();
		System.out.format("%32s", "LIABILITIES AND SHAREHOLDER'S EQUITY");
		System.out.println();
		System.out.format("%32s", "CURRENT LIABILITIES");
		System.out.println();
		System.out.format("%32s%10d", "Revolver", this.revolver);
		System.out.println();
		System.out.format("%32s%10d", "Accounts Payable", this.accountsPayable);
		System.out.println();
		System.out.format("%32s%10d", "Accrued Expenses", this.accruedExpenses);
		System.out.println();
		System.out.format("%32s%10d", "Total Current Liabilities", this.totalCurrentLiabilities);
		System.out.println();
		System.out.format("%32s", "LONG TERM LIABILITIES");
		System.out.println();
		System.out.format("%32s%10d", "Deferred Revenue", this.deferredRevenue);
		System.out.println();
		System.out.format("%32s%10d", "Deferred Tax Liability", this.deferredTaxLiability);
		System.out.println();
		System.out.format("%32s%10d", "Long Term Debt", this.longTermDebt);
		System.out.println();
		System.out.format("%32s%10d", "Total Long-Term Liabilties", this.totalLongTermLiabilities);
		System.out.println();
		System.out.format("%32s%10d", "Total Liabilities", this.totalLiabilities);
		System.out.println();
		System.out.format("%32s", "SHAREHOLDER'S EQUITY");
		System.out.println();
		System.out.format("%32s%10d", "Common Stock", this.commonStock);
		System.out.println();
		System.out.format("%32s%10d", "Treasury Stock", this.treasuryStock);
		System.out.println();
		System.out.format("%32s%10d", "Retained Earnings", this.retainedEarnings);
		System.out.println();
		System.out.format("%32s%10d", "Other Income", this.otherIncome);
		System.out.println();
		System.out.format("%32s%10d", "Total Shareholders' Equity", this.shareholdersEquity);
		System.out.println();
		System.out.format("%32s%10d", "Total Liabilities and Equity", this.totalLiabilitiesAndEquity);
		System.out.println();
		System.out.format("%32s%10b", "Balanced Sheet Balanced", this.balanced);
		System.out.println();
		System.out.println("----------------------------------------------------");
	}
	
	
	
	
}
