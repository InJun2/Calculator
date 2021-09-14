package Calculate;

import java.util.ArrayList;

public class Operator {
	private ArrayList<String> operlist = new ArrayList<String>();
	
	protected Operator() {
		
	}
	
	protected Operator(String oper) throws Exception {
		boolean oper_val = valiation_Operator(oper);
		
		if(oper_val==true) {
			setOperator(oper);
			
		}
		else {
			throw new Exception("맞는 연산자가 아닙니다.");
		}
	}

	protected void setOperator(String oper) {
		this.operlist.add(oper);
	}
	
	protected ArrayList<String> getOperator() {
		return this.operlist;
	}

	private boolean valiation_Operator(String word) {	
		boolean integerOrNot1 = word.matches("[*+-]");	
		return integerOrNot1;
	}
}
