package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	private String oper;
	
	protected Operator() {
		
	}
	
	protected Operator(String oper, Operators opers){
		valiation_Operator(oper);
		opers.setOperators(oper);
	}

	protected void setOperator(String oper) {
		this.oper = oper;
	}
	
	protected String getOperator() {
		return this.oper;
	}

	private void valiation_Operator(String word) {	
		boolean OperatorOrNot = word.matches("[*+-]");	
		if(!OperatorOrNot) {
			throw new RuntimeException("잘못된 연산자입니다");
		}
		if(word.length()!=1) {
			throw new RuntimeException("잘못된 연산자입니다");
		}
		
	}
	
	
}
