package com.example.aduba_000.changesfinance;

public class IncomeStatement {
	public  double taxRate;
	public int revenue;
	public int cogs;
	
	//No input needed
	public int grossProfit;
	public int operatingExpenses;
	
	public int depreciation;
	public int stockBasedCompensation;
	public int amortizationOfIntangibles;
	
	//No input needed
	public int operatingIncome;
	
	public int interestIncome;
	public int interestExpense;
	public int saleOfPPE;
	public int saleOfST;
	public int goodwillImpairment;
	public int PPEwritedown;
	
	//No input needed
	public int preTaxIncome;
	
	//No input needed
	public int IncomeTaxProvision;
	
	//No input needed
	public int currentPortionOfIncomeTaxes;
	
	public int deferredPortionOfIncomeTaxes;
	
	//No input needed
	public int netIncome;
	
	public IncomeStatement(double taxRate, int revenue, int cogs, int operatingExpenses, int depreciation,
						   int stockBasedCompensation, int amortizationOfIntangibles, 
						   int interestIncome, int interestExpense, int saleOfPPE, 
						   int saleOfST, int goodwillImpairment, int PPEwritedown,
						   int deferredPortionOfIncomeTaxes){
        this.taxRate = taxRate;
		this.revenue = revenue;
		this.cogs = cogs;
		this.operatingExpenses = operatingExpenses;
		this.depreciation = depreciation;
		this.stockBasedCompensation = stockBasedCompensation;
		this.amortizationOfIntangibles= amortizationOfIntangibles;
		this.interestIncome= interestIncome;
		this.interestExpense = interestExpense;
		this.saleOfPPE = saleOfPPE;
		this.saleOfST = saleOfST;
		this.goodwillImpairment = goodwillImpairment;
		this.PPEwritedown = PPEwritedown;
		this.deferredPortionOfIncomeTaxes = deferredPortionOfIncomeTaxes;
		calculateGrossProfit();
		calculateOperatingIncome();
		calculatePreTaxIncome();
		calculateIncomeTaxProvision();
		calculateCurrentPortionOfIncomeTaxes();
		calculateNetIncome();
	}
	
	public IncomeStatement(double taxRate, int revenue, int cogs, int operatingExpenses){
		
		this(taxRate, revenue, cogs, operatingExpenses,0,0,0,0,0,0,0,0,0,0);
		
	}
	//Setters and Getters////////////////////////////////////////////////
	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
		update();
	}

	public int getCogs() {
		return cogs;
	}

	public void setCogs(int cogs) {
		this.cogs = cogs;
		update();
	}

	public int getOperatingExpenses() {
		return operatingExpenses;
	}

	public void setOperatingExpenses(int operatingExpenses) {
		this.operatingExpenses = operatingExpenses;
		update();
	}

	public int getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(int depreciation) {
		this.depreciation = depreciation;
	}

	public int getStockBasedCompensation() {
		return stockBasedCompensation;
	}

	public void setStockBasedCompensation(int stockBasedCompensation) {
		this.stockBasedCompensation = stockBasedCompensation;
	}

	public int getAmortizationOfIntangibles() {
		return amortizationOfIntangibles;
	}

	public void setAmortizationOfIntangibles(int amortizationOfIntangibles) {
		this.amortizationOfIntangibles = amortizationOfIntangibles;
	}

	public int getInterestIncome() {
		return interestIncome;
	}

	public void setInterestIncome(int interestIncome) {
		this.interestIncome = interestIncome;
	}

	public int getInterestExpense() {
		return interestExpense;
	}

	public void setInterestExpense(int interestExpense) {
		this.interestExpense = interestExpense;
	}

	public int getSaleOfPPE() {
		return saleOfPPE;
	}

	public void setSaleOfPPE(int saleOfPPE) {
		this.saleOfPPE = saleOfPPE;
	}

	public int getSaleOfST() {
		return saleOfST;
	}

	public void setSaleOfST(int saleOfST) {
		this.saleOfST = saleOfST;
	}

	public int getGoodwillImpairment() {
		return goodwillImpairment;
	}

	public void setGoodwillImpairment(int goodwillImpairment) {
		this.goodwillImpairment = goodwillImpairment;
	}

	public int getPPEwritedown() {
		return PPEwritedown;
	}

	public void setPPEwritedown(int pPEwritedown) {
		PPEwritedown = pPEwritedown;
	}

	public int getDeferredPortionOfIncomeTaxes() {
		return deferredPortionOfIncomeTaxes;
	}

	public void setDeferredPortionOfIncomeTaxes(int deferredPortionOfIncomeTaxes) {
		this.deferredPortionOfIncomeTaxes = deferredPortionOfIncomeTaxes;
	}
	//Setters and Getters////////////////////////////////////////////////
	
	
	//Calculate methods////////////////
	public void calculateGrossProfit(){
		this.grossProfit = this.revenue - this.cogs;
	}
	
	public void calculateOperatingIncome(){
		this.operatingIncome = this.grossProfit - this.operatingExpenses - 
		this.depreciation - this.stockBasedCompensation - this.amortizationOfIntangibles;
	}
	
	public void calculatePreTaxIncome(){
		this.preTaxIncome =  this.operatingIncome + this.goodwillImpairment + this.PPEwritedown +  this.interestExpense +
							 + this.saleOfPPE + this.saleOfST + this.interestIncome;
	}
	
	public void calculateIncomeTaxProvision(){
		this.IncomeTaxProvision = (int)((double)this.preTaxIncome * taxRate);	
	}
	
	public void calculateCurrentPortionOfIncomeTaxes(){
		this.currentPortionOfIncomeTaxes = this.IncomeTaxProvision - this.deferredPortionOfIncomeTaxes;
	}
	
	public void calculateNetIncome(){
		this.netIncome = this.preTaxIncome - this.IncomeTaxProvision;
	}
	//////////////////////////////////////
	
	////Update function///////////
	
	public int getGrossProfit() {
		return grossProfit;
	}

	public void setGrossProfit(int grossProfit) {
		this.grossProfit = grossProfit;
	}

	public int getOperatingIncome() {
		return operatingIncome;
	}

	public void setOperatingIncome(int operatingIncome) {
		this.operatingIncome = operatingIncome;
	}

	public int getPreTaxIncome() {
		return preTaxIncome;
	}

	public void setPreTaxIncome(int preTaxIncome) {
		this.preTaxIncome = preTaxIncome;
	}

	public int getIncomeTaxProvision() {
		return IncomeTaxProvision;
	}

	public void setIncomeTaxProvision(int incomeTaxProvision) {
		IncomeTaxProvision = incomeTaxProvision;
	}

	public int getCurrentPortionOfIncomeTaxes() {
		return currentPortionOfIncomeTaxes;
	}

	public void setCurrentPortionOfIncomeTaxes(int currentPortionOfIncomeTaxes) {
		this.currentPortionOfIncomeTaxes = currentPortionOfIncomeTaxes;
	}

	public int getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(int netIncome) {
		this.netIncome = netIncome;
	}

	public double getTaxRate() {
		return this.taxRate;
	}
	
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public void update(){
		calculateGrossProfit();
		calculateOperatingIncome();
		calculatePreTaxIncome();
		calculateIncomeTaxProvision();
		calculateCurrentPortionOfIncomeTaxes();
		calculateNetIncome();
	}
	
	///to string
	@Override
	public String toString(){
		update();
		return "Revenue: " + this.revenue + "Operating Income: " + this.operatingIncome +
			   "Net Income: " + this.netIncome;
 		
	}
	
	public void printTable(){
		//update();
		System.out.format("%s%.3f ", "Tax Rate: ",taxRate);
		System.out.format("%32s", "INCOME STATEMENT");
		System.out.println();
		System.out.format("%32s%10d", "Revenue", this.revenue);
		System.out.println();
		System.out.format("%32s%10d", "Cogs", this.cogs);
		System.out.println();
		System.out.format("%32s%10d", "Gross Profit", this.grossProfit);
		System.out.println();
		System.out.format("%32s%10d", "Operating Expenses", this.operatingExpenses);
		System.out.println();
		System.out.format("%32s%10d", "Depreciation", this.depreciation);
		System.out.println();
		System.out.format("%32s%10d", "Stock Based Compensation", this.stockBasedCompensation);
		System.out.println();
		System.out.format("%32s%10d", "Amortization of Intangibles", this.amortizationOfIntangibles);
		System.out.println();
		System.out.format("%32s%10d", "Operating Income", this.operatingIncome);
		System.out.println();
		System.out.format("%32s%10d", "Interest Income", this.interestIncome);
		System.out.println();
		System.out.format("%32s%10d", "Interest Expense", this.interestExpense);
		System.out.println();
		System.out.format("%32s%10d", "Gain/Loss on Sale of PP&E", this.saleOfPPE);
		System.out.println();
		System.out.format("%32s%10d", "Gain/Loss on Sale of ST", this.saleOfST);
		System.out.println();
		System.out.format("%32s%10d", "Goodwill Impairment", this.goodwillImpairment);
		System.out.println();
		System.out.format("%32s%10d", "PP&E writedown", this.PPEwritedown);
		System.out.println();
		System.out.format("%32s%10d", "PreTax Income", this.preTaxIncome);
		System.out.println();
		System.out.format("%32s%10d", "Income Tax Provision", this.IncomeTaxProvision);
		System.out.println();
		System.out.format("%32s%10d", "Current Portion of Income Taxes:", this.currentPortionOfIncomeTaxes);
		System.out.println();
		System.out.format("%32s%10d", "Deferred Portion of Income Taxes", this.deferredPortionOfIncomeTaxes);
		System.out.println();
		System.out.format("%32s%10d", "Net Income", this.netIncome);	
		System.out.println();
	}
	
	
	

}
