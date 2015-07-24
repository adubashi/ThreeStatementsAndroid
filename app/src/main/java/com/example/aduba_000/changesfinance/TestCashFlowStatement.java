
public class TestCashFlowStatement {
	public static void main(String Args[]){
		Company statement = new Company(100, .4);
		statement.currentCompanyCF.setPurchaseLongTermInvestments(10);
		//statement.printTable();
		
		
		CashFlowStatement statement2 = new CashFlowStatement(100, 20);
		//statement2.setPurchaseLongTermInvestments(10);
		statement2.printTable();
		
		statement2.setPPEsaleProceeds(-10);
		System.out.println(statement2.getPPEsaleProceeds());
		statement2.printTable();
	}
}
